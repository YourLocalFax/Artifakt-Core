package net.fudev.artifakt.graphics.g2d;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.Matrix4;

import net.fudev.laye.api.LayeCtor;
import net.fudev.laye.api.LayeMethod;
import net.fudev.laye.api.LayeType;

@LayeType
public class Batch2D extends SpriteBatch
{
   private final TextureRegion empty;
   
   @LayeCtor
   public Batch2D()
   {
      this(1000, null);
   }

   @LayeCtor(name = "size")
   public Batch2D(final int size)
   {
      this(size, null);
   }

   @LayeCtor(name = "shader")
   public Batch2D(final ShaderProgram defaultShader)
   {
      this(1000, null);
   }

   @LayeCtor(name = "full")
   public Batch2D(final int size, final ShaderProgram defaultShader)
   {
      super(size, defaultShader);
      final Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
      pixmap.setColor(Color.WHITE);
      pixmap.fill();
      empty = new TextureRegion(new Texture(pixmap));
   }
   
   @Override
   @LayeMethod(name = "Begin")
   public void begin()
   {
      super.begin();
   }

   @Override
   @LayeMethod(name = "End")
   public void end()
   {
      super.end();
   }

   @Override
   @LayeMethod(name = "Dispose")
   public void dispose()
   {
      empty.getTexture().dispose();
      super.dispose();
   }

   @LayeMethod(name = "Resize")
   public void resize(final int width, final int height)
   {
      setProjectionMatrix(new Matrix4().setToOrtho2D(0, 0, width, height));
   }
   
   /**
    * Draws a filled rectangle with the bottom left corner at x,y and spanning the given width and height.
    * 
    * @param x
    * @param y
    * @param width
    * @param height
    */
   @LayeMethod(name = "Rect")
   public void rect(final int x, final int y, final int width, final int height)
   {
      rect(x, y, 0, 0, width, height, 0);
   }
   
   /**
    * Draws a filled rectangle with the bottom left corner at x,y and spanning the given width and height. Rotation
    * specifies the angle of counter clockwise rotation of the rectangle around 0, 0.
    * 
    * @param x
    * @param y
    * @param width
    * @param height
    * @param rotation
    */
   @LayeMethod(name = "Rect")
   public void rect(final int x, final int y, final int width, final int height, final int rotation)
   {
      rect(x, y, 0, 0, width, height, rotation);
   }
   
   /**
    * Draws a filled rectangle with the bottom left corner at x,y and spanning the given width and height. The rectangle
    * is offset by originX, originY relative to the origin. Rotation specifies the angle of counter clockwise rotation
    * of the rectangle around originX, originY.
    * 
    * @param x
    * @param y
    * @param originX
    * @param originY
    * @param width
    * @param height
    * @param rotation
    */
   @LayeMethod(name = "Rect")
   public void rect(final int x, final int y, final int originX, final int originY, final int width,
         final int height, final int rotation)
   {
      rect(x, y, originX, originY, width, height, 1, 1, rotation);
   }
   
   /**
    * Draws a filled rectangle with the bottom left corner at x,y and spanning the given width and height. The rectangle
    * is offset by originX, originY relative to the origin. Scale specifies the scaling factor by which the rectangle
    * should be scaled around originX, originY. Rotation specifies the angle of counter clockwise rotation of the
    * rectangle around originX, originY.
    * 
    * @param x
    * @param y
    * @param originX
    * @param originY
    * @param width
    * @param height
    * @param rotation
    */
   @LayeMethod(name = "Rect")
   public void rect(final int x, final int y, final int originX, final int originY, final int width,
         final int height, final int scaleX, final int scaleY, final int rotation)
   {
      draw(empty, x, y, originX, originY, width, height, scaleX, scaleY, rotation);
   }
   
   /**
    * Draws a filled rectangle with the bottom left corner at x,y and spanning the given width and height.
    * 
    * @param x
    * @param y
    * @param width
    * @param height
    */
   @LayeMethod(name = "Rect")
   public void rect(final float x, final float y, final float width, final float height)
   {
      rect(x, y, 0, 0, width, height, 0);
   }
   
   /**
    * Draws a filled rectangle with the bottom left corner at x,y and spanning the given width and height. Rotation
    * specifies the angle of counter clockwise rotation of the rectangle around 0, 0.
    * 
    * @param x
    * @param y
    * @param width
    * @param height
    * @param rotation
    */
   @LayeMethod(name = "Rect")
   public void rect(final float x, final float y, final float width, final float height, final float rotation)
   {
      rect(x, y, 0, 0, width, height, rotation);
   }
   
   /**
    * Draws a filled rectangle with the bottom left corner at x,y and spanning the given width and height. The rectangle
    * is offset by originX, originY relative to the origin. Rotation specifies the angle of counter clockwise rotation
    * of the rectangle around originX, originY.
    * 
    * @param x
    * @param y
    * @param originX
    * @param originY
    * @param width
    * @param height
    * @param rotation
    */
   @LayeMethod(name = "Rect")
   public void rect(final float x, final float y, final float originX, final float originY, final float width,
         final float height, final float rotation)
   {
      rect(x, y, originX, originY, width, height, 1, 1, rotation);
   }
   
   /**
    * Draws a filled rectangle with the bottom left corner at x,y and spanning the given width and height. The rectangle
    * is offset by originX, originY relative to the origin. Scale specifies the scaling factor by which the rectangle
    * should be scaled around originX, originY. Rotation specifies the angle of counter clockwise rotation of the
    * rectangle around originX, originY.
    * 
    * @param x
    * @param y
    * @param originX
    * @param originY
    * @param width
    * @param height
    * @param rotation
    */
   @LayeMethod(name = "Rect")
   public void rect(final float x, final float y, final float originX, final float originY, final float width,
         final float height, final float scaleX, final float scaleY, final float rotation)
   {
      draw(empty, x, y, originX, originY, width, height, scaleX, scaleY, rotation);
   }
}
