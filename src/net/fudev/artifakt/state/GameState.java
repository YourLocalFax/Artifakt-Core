package net.fudev.artifakt.state;

import net.fudev.artifakt.err.IllegalAction;
import net.fudev.artifakt.instance.Instance;

public abstract class GameState extends Instance
{
   public abstract void create();
   
   public abstract void dispose();
   
   public abstract void resize(int width, int height);
   
   public abstract void update(float delta);
   
   public abstract void render();

   @Override
   public Instance getParent()
   {
      return null;
   }

   @Override
   public void setParent(final Instance parent)
   {
      throw new IllegalAction("Cannot set the parent of a GameState.");
   }
}
