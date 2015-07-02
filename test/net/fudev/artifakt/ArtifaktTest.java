package net.fudev.artifakt;

import javax.script.ScriptException;

import net.fudev.artifakt.graphics.g2d.Batch2D;
import net.fudev.artifakt.state.GameState;

public final class ArtifaktTest extends GameState
{
   public static void main(String[] args) throws ScriptException
   {
      Artifakt.create(new ArtifaktTest());
   }
   
   private Batch2D batch = null;
   
   private float pulseSpeed = 2.25f;
   private float offset = 0.0f, rotation = 0.0f, scale = 1.0f;

   @Override
   public void create()
   {
      batch = new Batch2D();
   }

   @Override
   public void dispose()
   {
      batch.dispose();
   }

   @Override
   public void resize(int width, int height)
   {
      batch.resize(width, height);
   }

   @Override
   public void update(float delta)
   {
      final float sin = (float) Math.sin(Artifakt.getLifeTime() * Math.PI * pulseSpeed);
      
      offset = 20.0f * Math.abs(sin);
      rotation = 15.0f * sin;
      scale = 0.5f + Math.abs(sin) * 0.5f;
   }

   @Override
   public void render()
   {
      batch.begin();
      batch.rect(10, 10 + offset, 25, 25, 50, 50, scale, scale, rotation - 7.0f);
      batch.end();
   }
}
