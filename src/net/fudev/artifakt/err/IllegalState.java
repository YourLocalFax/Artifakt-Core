package net.fudev.artifakt.err;

public class IllegalState extends ArtifaktRuntimeException
{
   private static final long serialVersionUID = -2602167896056704703L;
   
   public IllegalState()
   {
   }
   
   public IllegalState(final String message)
   {
      super(message);
   }
   
   public IllegalState(final Throwable cause)
   {
      super(cause);
   }
   
   public IllegalState(final String message, final Throwable cause)
   {
      super(message, cause);
   }
   
   public IllegalState(final String message, final Throwable cause, final boolean enableSuppression,
         final boolean writableStackTrace)
   {
      super(message, cause, enableSuppression, writableStackTrace);
   }
}
