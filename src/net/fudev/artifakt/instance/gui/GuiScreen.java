package net.fudev.artifakt.instance.gui;

public class GuiScreen extends BaseGui
{
   public GuiScreen()
   {
   }
   
   @Override
   public void update(final float delta)
   {
      position.set(0, 0, 0, 0);
      size.set(1, 0, 1, 0);
   }
}
