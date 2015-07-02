package net.fudev.artifakt.instance.gui;

import net.fudev.artifakt.instance.Instance;
import net.fudev.artifakt.math.UDim2;
import net.fudev.artifakt.util.NotNull;
import net.fudev.laye.api.LayeField;
import net.fudev.laye.api.LayeType;

@LayeType
public abstract class BaseGui extends Instance
{
   @LayeField
   public @NotNull UDim2 position = new UDim2();
   @LayeField
   public @NotNull UDim2 size = new UDim2();
   
   public BaseGui()
   {
   }
   
   @Override
   public void update(final float delta)
   {
   }
}
