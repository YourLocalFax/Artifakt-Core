package net.fudev.artifakt;

import javax.script.ScriptException;

import com.badlogic.gdx.Gdx;

import net.fudev.artifakt.script.LayeInterface;
import net.fudev.artifakt.state.GameState;
import net.fudev.laye.LayeScriptEngine;
import net.fudev.laye.LayeScriptEngine.LayeScript;
import net.fudev.laye.internal.values.LayeValue;

public final class ArtifaktTest extends GameState
{
   public static void main(final String[] args) throws ScriptException
   {
      Artifakt.create(new ArtifaktTest());
   }
   
   private LayeScriptEngine engine;
   private LayeScript script;
   
   // private Batch2D batch = null;
   //
   // private final float pulseSpeed = 2.25f;
   // private float offset = 0.0f, rotation = 0.0f, scale = 1.0f;
   
   private void invoke(final String name, final Object... args)
   {
      final LayeValue method = engine.get(name);
      if (method != null)
      {
         final LayeValue[] largs = new LayeValue[args.length];
         for (int i = 0; i < largs.length; i++)
         {
            largs[i] = LayeValue.valueOf(args[i]);
         }
         method.call(largs);
      }
   }
   
   @Override
   public void create()
   {
      engine = LayeInterface.createLayeScriptEngine();
      try
      {
         script = engine.compile(Gdx.files.internal("test.laye").reader());
         script.eval();
      }
      catch (final ScriptException e)
      {
         e.printStackTrace();
      }
      
      invoke("Create");
      
      // batch = new Batch2D();
   }
   
   @Override
   public void dispose()
   {
      invoke("Dispose");
      // batch.dispose();
   }
   
   @Override
   public void resize(final int width, final int height)
   {
      invoke("Resize", width, height);
      // batch.resize(width, height);
   }
   
   @Override
   public void update(final float delta)
   {
      // final float sin = (float) Math.sin(Artifakt.getLifeTime() * Math.PI * pulseSpeed);
      //
      // offset = 20.0f * Math.abs(sin);
      // rotation = 15.0f * sin;
      // scale = 0.5f + Math.abs(sin) * 0.5f;
   }
   
   @Override
   public void render()
   {
      invoke("Render");
      // batch.begin();
      // batch.rect(10, 10 + offset, 25, 25, 50, 50, scale, scale, rotation - 7.0f);
      // batch.end();
   }
}
