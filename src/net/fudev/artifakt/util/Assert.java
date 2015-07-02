package net.fudev.artifakt.util;

import net.fudev.artifakt.err.AssertionFailure;

public final class Assert
{
   public static void notNull(final Object... objects)
   {
      for (final Object object : objects)
      {
         if (object == null)
         {
            throw new AssertionFailure();
         }
      }
   }
   
   private Assert()
   {
   }
}
