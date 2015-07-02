package net.fudev.artifakt.math;

import net.fudev.artifakt.util.NotNull;
import net.fudev.laye.api.LayeCtor;
import net.fudev.laye.api.LayeType;

@LayeType
public class UDim2
{
   public @NotNull UDim x;
   public @NotNull UDim y;
   
   // ----- There are four constructors here so that Laye can choose any of these when doing type checks.
   
   @LayeCtor
   public UDim2(final float xScale, final int xOffset, final float yScale, final int yOffset)
   {
      x = new UDim(xScale, xOffset);
      y = new UDim(yScale, yOffset);
   }
   
   @LayeCtor
   public UDim2(final int xScale, final int xOffset, final float yScale, final int yOffset)
   {
      x = new UDim(xScale, xOffset);
      y = new UDim(yScale, yOffset);
   }
   
   @LayeCtor
   public UDim2(final float xScale, final int xOffset, final int yScale, final int yOffset)
   {
      x = new UDim(xScale, xOffset);
      y = new UDim(yScale, yOffset);
   }
   
   @LayeCtor
   public UDim2(final int xScale, final int xOffset, final int yScale, final int yOffset)
   {
      x = new UDim(xScale, xOffset);
      y = new UDim(yScale, yOffset);
   }
   
   @LayeCtor(name = "dim")
   public UDim2(final UDim x, final UDim y)
   {
      this.x = new UDim(x);
      this.y = new UDim(y);
   }
   
   @LayeCtor(name = "zero")
   public UDim2()
   {
      this(0.0f, 0, 0.0f, 0);
   }
   
   @LayeCtor(name = "copy")
   public UDim2(final UDim2 other)
   {
      this.x = new UDim(other.x);
      this.y = new UDim(other.y);
   }
   
   @Override
   public String toString()
   {
      final StringBuilder builder = new StringBuilder();
      builder.append('(').append(x.scale).append(", ").append(x.offset);
      builder.append(", ").append(y.scale).append(", ").append(y.offset);
      return builder.append(')').toString();
   }
   
   public UDim2 set(final float xScale, final int xOffset, final float yScale, final int yOffset)
   {
      x.set(xScale, xOffset);
      y.set(yScale, yOffset);
      return this;
   }
}
