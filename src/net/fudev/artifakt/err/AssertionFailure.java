package net.fudev.artifakt.err;

public class AssertionFailure extends ArtifaktRuntimeException
{
   private static final long serialVersionUID = 5458871187517941239L;
   
   public AssertionFailure()
   {
   }
   
   public AssertionFailure(final String message)
   {
      super(message);
   }
   
   public AssertionFailure(final Throwable cause)
   {
      super(cause);
   }
   
   public AssertionFailure(final String message, final Throwable cause)
   {
      super(message, cause);
   }
   
   public AssertionFailure(final String message, final Throwable cause, final boolean enableSuppression,
         final boolean writableStackTrace)
   {
      super(message, cause, enableSuppression, writableStackTrace);
   }
}
