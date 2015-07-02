package net.fudev.artifakt.err;

public class AssertionFailure extends ArtifaktRuntimeException
{
   private static final long serialVersionUID = 5458871187517941239L;

   public AssertionFailure()
   {
   }
   
   public AssertionFailure(String message)
   {
      super(message);
   }
   
   public AssertionFailure(Throwable cause)
   {
      super(cause);
   }
   
   public AssertionFailure(String message, Throwable cause)
   {
      super(message, cause);
   }
   
   public AssertionFailure(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
   {
      super(message, cause, enableSuppression, writableStackTrace);
   }
}
