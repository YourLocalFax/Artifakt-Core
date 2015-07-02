package net.fudev.artifakt.err;

public abstract class ArtifaktRuntimeException extends RuntimeException
{
   private static final long serialVersionUID = 8257640482185654461L;
   
   public ArtifaktRuntimeException()
   {
      super();
   }

   public ArtifaktRuntimeException(String message, Throwable cause, boolean enableSuppression,
         boolean writableStackTrace)
   {
      super(message, cause, enableSuppression, writableStackTrace);
   }

   public ArtifaktRuntimeException(String message, Throwable cause)
   {
      super(message, cause);
   }

   public ArtifaktRuntimeException(String message)
   {
      super(message);
   }

   public ArtifaktRuntimeException(Throwable cause)
   {
      super(cause);
   }

   @Override
   public String toString()
   {
      final String s = getClass().getSimpleName();
      final String message = getLocalizedMessage();
      return message != null ? (s + ": " + message) : s;
   }
}
