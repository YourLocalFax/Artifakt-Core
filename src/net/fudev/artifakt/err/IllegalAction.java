package net.fudev.artifakt.err;

public class IllegalAction extends ArtifaktRuntimeException
{
   private static final long serialVersionUID = 288323183521015936L;

   public IllegalAction()
   {
   }
   
   public IllegalAction(String message)
   {
      super(message);
   }
   
   public IllegalAction(Throwable cause)
   {
      super(cause);
   }
   
   public IllegalAction(String message, Throwable cause)
   {
      super(message, cause);
   }
   
   public IllegalAction(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
   {
      super(message, cause, enableSuppression, writableStackTrace);
   }
}
