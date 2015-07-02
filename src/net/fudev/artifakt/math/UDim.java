package net.fudev.artifakt.math;

import net.fudev.laye.api.LayeCtor;
import net.fudev.laye.api.LayeField;
import net.fudev.laye.api.LayeInfix;
import net.fudev.laye.api.LayeType;

@LayeType
public class UDim
{
   @LayeField
   public float scale;
   @LayeField
   public int offset;
   
   @LayeCtor
   public UDim(final float scale, final int offset)
   {
      this.scale = scale;
      this.offset = offset;
   }
   
   @LayeCtor(name = "zero")
   public UDim()
   {
      this(0, 0);
   }
   
   @LayeCtor(name = "copy")
   public UDim(final UDim other)
   {
      this.scale = other.scale;
      this.offset = other.offset;
   }
   
   @Override
   public String toString()
   {
      final StringBuilder builder = new StringBuilder();
      builder.append('(').append(scale);
      builder.append(", ").append(offset);
      return builder.append(')').toString();
   }
   
   public void set(final float scale, final int offset)
   {
      this.scale = scale;
      this.offset = offset;
   }
   
   @LayeInfix(operator = "+")
   public UDim add(final UDim other)
   {
      return new UDim(scale + other.scale, offset + other.offset);
   }
   
   @LayeInfix(operator = "+!")
   public UDim addLocal(final UDim other)
   {
      scale += other.scale;
      offset += other.offset;
      return this;
   }
   
   @LayeInfix(operator = "-")
   public UDim sub(final UDim other)
   {
      return new UDim(scale - other.scale, offset - other.offset);
   }
   
   @LayeInfix(operator = "-!")
   public UDim subLocal(final UDim other)
   {
      scale -= other.scale;
      offset -= other.offset;
      return this;
   }
   
   @LayeInfix(operator = "*")
   public UDim mul(final UDim other)
   {
      return new UDim(scale * other.scale, offset * other.offset);
   }
   
   @LayeInfix(operator = "*!")
   public UDim mulLocal(final UDim other)
   {
      scale *= other.scale;
      offset *= other.offset;
      return this;
   }
   
   @LayeInfix(operator = "/")
   public UDim div(final UDim other)
   {
      return new UDim(scale / other.scale, offset / other.offset);
   }
   
   @LayeInfix(operator = "/!")
   public UDim divLocal(final UDim other)
   {
      scale /= other.scale;
      offset /= other.offset;
      return this;
   }
   
   @LayeInfix(operator = "//")
   public UDim idiv(final UDim other)
   {
      return new UDim((int) (scale / other.scale), offset / other.offset);
   }
   
   @LayeInfix(operator = "//!")
   public UDim idivLocal(final UDim other)
   {
      scale = (int) (scale / other.scale);
      offset /= other.offset;
      return this;
   }
}