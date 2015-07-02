package net.fudev.artifakt.math;

import com.badlogic.gdx.math.Vector2;

import net.fudev.laye.api.LayeCtor;
import net.fudev.laye.api.LayeInfix;
import net.fudev.laye.api.LayeMethod;
import net.fudev.laye.api.LayeOperator.Assoc;
import net.fudev.laye.api.LayePostfix;
import net.fudev.laye.api.LayePrefix;
import net.fudev.laye.api.LayeType;

@LayeType
public class Vec2 extends Vector2
{
   private static final long serialVersionUID = 8213239599569840480L;
   
   @LayeCtor(name = "zero")
   public Vec2()
   {
   }
   
   @LayeCtor(name = "xy")
   public Vec2(final float a)
   {
      super(a, a);
   }
   
   @LayeCtor(name = "xy")
   public Vec2(final int a)
   {
      super(a, a);
   }
   
   @LayeCtor
   public Vec2(final float x, final float y)
   {
      super(x, y);
   }
   
   @LayeCtor
   public Vec2(final int x, final float y)
   {
      super(x, y);
   }
   
   @LayeCtor
   public Vec2(final float x, final int y)
   {
      super(x, y);
   }
   
   @LayeCtor
   public Vec2(final int x, final int y)
   {
      super(x, y);
   }
   
   @LayeCtor(name = "copy")
   public Vec2(final Vector2 v)
   {
      super(v);
   }
   
   @Override
   public String toString()
   {
      final StringBuilder builder = new StringBuilder();
      builder.append('<').append(x);
      builder.append(", ").append(y);
      return builder.append('>').toString();
   }
   
   @LayeMethod
   public Vec2 set(final Vec2 other)
   {
      this.x = other.x;
      this.y = other.y;
      return this;
   }
   
   // ----- Prefix Operators ----- //
   
   @LayePrefix(operator = "#")
   public float length()
   {
      return (float) StrictMath.sqrt(x * x + y * y);
   }
   
   @LayePrefix(operator = "##")
   public float lengthSquared()
   {
      return x * x + y * y;
   }
   
   // ----- Postfix Operators ----- //
   
   @LayePostfix(operator = "^")
   public Vec2 normalized()
   {
      final float len = length();
      if (len == 0.0f || len == 1.0f)
      {
         return this;
      }
      return new Vec2(x / len, y / len);
   }
   
   @LayePostfix(operator = "^!")
   public Vec2 normalize()
   {
      final float len = length();
      if (len != 0.0f && len != 1.0f)
      {
         x /= len;
         y /= len;
      }
      return this;
   }
   
   // ----- Infix Operators ----- //
   
   @LayeInfix(operator = "+")
   public Vec2 add(final Vec2 vec)
   {
      return new Vec2(x + vec.x, y + vec.y);
   }
   
   @LayeInfix(operator = "+!")
   public Vec2 addLocal(final Vec2 vec)
   {
      x += vec.x;
      y += vec.y;
      return this;
   }
   
   @LayeInfix(operator = "+")
   public Vec2 add(final float scalar)
   {
      return new Vec2(x + scalar, y + scalar);
   }
   
   @LayeInfix(operator = "+!")
   public Vec2 addLocal(final float scalar)
   {
      x += scalar;
      y += scalar;
      return this;
   }
   
   @LayeInfix(operator = "+")
   public Vec2 add(final int scalar)
   {
      return add((float) scalar);
   }
   
   @LayeInfix(operator = "+!")
   public Vec2 addLocal(final int scalar)
   {
      return addLocal((float) scalar);
   }
   
   @LayeInfix(operator = "-")
   public Vec2 sub(final Vec2 vec)
   {
      return new Vec2(x - vec.x, y - vec.y);
   }
   
   @LayeInfix(operator = "-!")
   public Vec2 subLocal(final Vec2 vec)
   {
      x -= vec.x;
      y -= vec.y;
      return this;
   }
   
   @LayeInfix(operator = "-")
   public Vec2 sub(final float scalar)
   {
      return new Vec2(x - scalar, y - scalar);
   }
   
   @LayeInfix(operator = "-!")
   public Vec2 subLocal(final float scalar)
   {
      x -= scalar;
      y -= scalar;
      return this;
   }
   
   @LayeInfix(operator = "-")
   public Vec2 sub(final int scalar)
   {
      return sub((float) scalar);
   }
   
   @LayeInfix(operator = "-!")
   public Vec2 subLocal(final int scalar)
   {
      return subLocal((float) scalar);
   }
   
   @LayeInfix(operator = "*")
   public Vec2 mul(final Vec2 vec)
   {
      return new Vec2(x * vec.x, y * vec.y);
   }
   
   @LayeInfix(operator = "*!")
   public Vec2 mulLocal(final Vec2 vec)
   {
      x *= vec.x;
      y *= vec.y;
      return this;
   }
   
   @LayeInfix(operator = "*")
   public Vec2 mul(final float scalar)
   {
      return new Vec2(x * scalar, y * scalar);
   }
   
   @LayeInfix(operator = "*!")
   public Vec2 mulLocal(final float scalar)
   {
      x *= scalar;
      y *= scalar;
      return this;
   }
   
   @LayeInfix(operator = "*", assoc = Assoc.RIGHT)
   public Vec2 mulRightAssoc(final float scalar)
   {
      return new Vec2(x * scalar, y * scalar);
   }
   
   @LayeInfix(operator = "*")
   public Vec2 mul(final int scalar)
   {
      return mul((float) scalar);
   }
   
   @LayeInfix(operator = "*!")
   public Vec2 mulLocal(final int scalar)
   {
      return mulLocal((float) scalar);
   }
   
   @LayeInfix(operator = "*", assoc = Assoc.RIGHT)
   public Vec2 mulRightAssoc(final int scalar)
   {
      return new Vec2(x * scalar, y * scalar);
   }
   
   @LayeInfix(operator = "/")
   public Vec2 div(final Vec2 vec)
   {
      return new Vec2(x / vec.x, y / vec.y);
   }
   
   @LayeInfix(operator = "/!")
   public Vec2 divLocal(final Vec2 vec)
   {
      x /= vec.x;
      y /= vec.y;
      return this;
   }
   
   @LayeInfix(operator = "/")
   public Vec2 div(final float scalar)
   {
      return new Vec2(x / scalar, y / scalar);
   }
   
   @LayeInfix(operator = "/!")
   public Vec2 divLocal(final float scalar)
   {
      x /= scalar;
      y /= scalar;
      return this;
   }
   
   @LayeInfix(operator = "/")
   public Vec2 div(final int scalar)
   {
      return div((float) scalar);
   }
   
   @LayeInfix(operator = "/!")
   public Vec2 divLocal(final int scalar)
   {
      return divLocal((float) scalar);
   }
   
   @LayeInfix(operator = "//")
   public Vec2 idiv(final Vec2 vec)
   {
      return new Vec2((int) (x / vec.x), (int) (y / vec.y));
   }
   
   @LayeInfix(operator = "//!")
   public Vec2 idivLocal(final Vec2 vec)
   {
      x = (int) (x / vec.x);
      y = (int) (y / vec.y);
      return this;
   }
   
   @LayeInfix(operator = "//")
   public Vec2 idiv(final float scalar)
   {
      return new Vec2((int) (x / scalar), (int) (y / scalar));
   }
   
   @LayeInfix(operator = "//!")
   public Vec2 idivLocal(final float scalar)
   {
      x = (int) (x / scalar);
      y = (int) (y / scalar);
      return this;
   }
   
   @LayeInfix(operator = "//")
   public Vec2 idiv(final int scalar)
   {
      return idiv((float) scalar);
   }
   
   @LayeInfix(operator = "//!")
   public Vec2 idivLocal(final int scalar)
   {
      return idivLocal((float) scalar);
   }
   
   // ----- other operators
   
   @LayeMethod
   public float dot(final Vec2 other)
   {
      return x * other.x + y * other.y;
   }
   
   @LayeMethod
   public float dot(final float ox, final float oy)
   {
      return x * ox + y * oy;
   }
}
