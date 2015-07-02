package net.fudev.artifakt.script;

import java.io.File;
import java.io.Reader;

import javax.script.ScriptEngineFactory;

import net.fudev.artifakt.err.IllegalArgument;
import net.fudev.artifakt.graphics.g2d.Batch2D;
import net.fudev.artifakt.math.UDim;
import net.fudev.artifakt.math.UDim2;
import net.fudev.artifakt.math.Vec2;
import net.fudev.laye.LayeScriptEngine;
import net.fudev.laye.LayeScriptEngineFactory;

public final class LayeInterface
{
   // TODO new exception for Laye things
   
   private static final ScriptEngineFactory factory = new LayeScriptEngineFactory();
   
   public static LayeScriptEngine createLayeScriptEngine()
   {
      final LayeScriptEngine engine = (LayeScriptEngine) factory.getScriptEngine();
      
      engine.put(Batch2D.class);
      
      engine.put(Vec2.class);
      engine.put(UDim.class);
      engine.put(UDim2.class);
      
      return engine;
   }
   
   public static void createGlobalBindings()
   {
   }
   
   public static void newScript(final File scriptFile)
   {
      if (scriptFile.isDirectory())
      {
         throw new IllegalArgument("expected file, got directory.");
      }
      final String scriptFileName = scriptFile.getName();
      if (!scriptFileName.endsWith(".laye"))
      {
         throw new IllegalArgument(
               "expected a .laye file, got " + scriptFileName.substring(scriptFileName.lastIndexOf('.')));
      }
   }
   
   public static void newScript(final File root, final Reader source)
   {
   }
   
   private LayeInterface()
   {
   }
}
