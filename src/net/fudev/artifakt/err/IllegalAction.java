package net.fudev.artifakt.err;

public class IllegalAction extends ArtifaktRuntimeException
{
   private static final long serialVersionUID = 288323183521015936L;
   
   public IllegalAction()
   {
   }
   
   public IllegalAction(final String message)
   {
      super(message);
   }
   
   public IllegalAction(final Throwable cause)
   {
      super(cause);
   }
   
   public IllegalAction(final String message, final Throwable cause)
   {
      super(message, cause);
   }
   
   public IllegalAction(final String message, final Throwable cause, final boolean enableSuppression,
         final boolean writableStackTrace)
   {
      super(message, cause, enableSuppression, writableStackTrace);
   }
}
