package net.fudev.artifakt.err;

public class IllegalArgument extends ArtifaktRuntimeException
{
   private static final long serialVersionUID = 6294982901573986695L;

   public IllegalArgument()
   {
   }
   
   public IllegalArgument(String message)
   {
      super(message);
   }
   
   public IllegalArgument(Throwable cause)
   {
      super(cause);
   }
   
   public IllegalArgument(String message, Throwable cause)
   {
      super(message, cause);
   }
   
   public IllegalArgument(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
   {
      super(message, cause, enableSuppression, writableStackTrace);
   }
}
