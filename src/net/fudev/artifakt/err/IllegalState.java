package net.fudev.artifakt.err;

public class IllegalState extends ArtifaktRuntimeException
{
   private static final long serialVersionUID = -2602167896056704703L;

   public IllegalState()
   {
   }
   
   public IllegalState(String message)
   {
      super(message);
   }
   
   public IllegalState(Throwable cause)
   {
      super(cause);
   }
   
   public IllegalState(String message, Throwable cause)
   {
      super(message, cause);
   }
   
   public IllegalState(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
   {
      super(message, cause, enableSuppression, writableStackTrace);
   }
}
