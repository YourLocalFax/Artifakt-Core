package net.fudev.artifakt.err;

public class IllegalArgument extends ArtifaktRuntimeException
{
   private static final long serialVersionUID = 6294982901573986695L;
   
   public IllegalArgument()
   {
   }
   
   public IllegalArgument(final String message)
   {
      super(message);
   }
   
   public IllegalArgument(final Throwable cause)
   {
      super(cause);
   }
   
   public IllegalArgument(final String message, final Throwable cause)
   {
      super(message, cause);
   }
   
   public IllegalArgument(final String message, final Throwable cause, final boolean enableSuppression,
         final boolean writableStackTrace)
   {
      super(message, cause, enableSuppression, writableStackTrace);
   }
}
