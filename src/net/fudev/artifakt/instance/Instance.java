package net.fudev.artifakt.instance;

import java.util.Vector;

import net.fudev.artifakt.util.NotNull;
import net.fudev.artifakt.util.Nullable;
import net.fudev.laye.api.LayeMethod;
import net.fudev.laye.api.LayePropertyGet;
import net.fudev.laye.api.LayePropertySet;
import net.fudev.laye.api.LayeType;

@LayeType
public abstract class Instance
{
   private @Nullable Instance parent = null;
   
   private final Vector<Instance> children = new Vector<>();
   
   public Instance()
   {
   }
   
   public abstract void update(final float delta);
   
   /**
    * Destroys all children, then sets this parent to null.
    */
   @LayeMethod
   public void destroy()
   {
      for (final Instance child : children)
      {
         child.destroy();
      }
      setParent(null);
   }
   
   @LayePropertyGet(name = "parent")
   public @Nullable Instance getParent()
   {
      return parent;
   }
   
   @LayePropertySet(name = "parent")
   public void setParent(final @Nullable Instance parent)
   {
      if (this.parent != null)
      {
         this.parent.removeChild(this);
      }
      if (parent != null)
      {
         parent.addChild(this);
      }
      this.parent = parent;
   }
   
   @LayeMethod
   public Vector<Instance> getChildren()
   {
      return new Vector<>(children);
   }
   
   private void removeChild(final @NotNull Instance child)
   {
      children.removeElement(child);
   }
   
   private void addChild(final @NotNull Instance child)
   {
      if (!children.contains(child))
      {
         children.addElement(child);
      }
   }
}
