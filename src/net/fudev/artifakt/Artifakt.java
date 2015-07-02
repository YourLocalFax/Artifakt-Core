package net.fudev.artifakt;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.GL20;

import net.fudev.artifakt.err.IllegalArgument;
import net.fudev.artifakt.state.GameState;
import net.fudev.artifakt.util.NotNull;
import net.fudev.artifakt.util.Nullable;

public final class Artifakt implements ApplicationListener
{
   public static final class Config extends LwjglApplicationConfiguration
   {
   }
   
   private static final Artifakt artifakt = new Artifakt();
   
   private static GameState state, nextState;
   private static long startTimeNanos;
   
   /**
    * Initialize Artifakt given the initial game state and default configuration. This is the same as calling
    * {@link Artifakt#create(GameState, Config)} with a <code>null</code> configuration.
    * 
    * @param initialState
    *           The state Artifakt will start in. Cannot be null.
    */
   public static void create(final @NotNull GameState initialState)
   {
      create(initialState, null);
   }
   
   /**
    * Initialize Artifakt given the initial game state and desired configuration.
    * 
    * @param initialState
    *           The state Artifakt will start in. Cannot be null.
    * @param config
    *           Artifakt configuration. If this is null, default configuration is used.
    */
   public static void create(final @NotNull GameState initialState, final @Nullable Config config)
   {
      if (initialState == null)
      {
         throw new IllegalArgument("Artifakt require a game state to run. No game state given to start with.");
      }
      state = initialState;
      new LwjglApplication(artifakt, config == null ? new Config() : config);
   }
   
   /**
    * Schedules the exit of Artifakt.
    */
   public static void exit()
   {
      Gdx.app.exit();
   }
   
   /**
    * @return How long Artifakt has been running, in seconds.
    */
   public static float getLifeTime()
   {
      return (startTimeNanos - System.nanoTime()) / 1_000_000_000.0f;
   }
   
   public static void switchState(final @NotNull GameState state)
   {
      if (state == null)
      {
         throw new IllegalArgument("Artifakt require a game state to run. No game state given to switch to.");
      }
      nextState = state;
   }
   
   private Artifakt()
   {
   }
   
   @Override
   public void create()
   {
      startTimeNanos = System.nanoTime();
      state.create();
   }
   
   @Override
   public void resize(final int width, final int height)
   {
      state.resize(width, height);
   }
   
   @Override
   public void render()
   {
      // Perform state switching.
      if (nextState != null)
      {
         state.dispose();
         state = nextState;
         state.create();
         state.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
      }
      
      state.update(Gdx.graphics.getDeltaTime());
      
      Gdx.gl.glClearColor(0, 0, 0, 1);
      Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
      
      state.render();
   }
   
   @Override
   public void pause()
   {
   }
   
   @Override
   public void resume()
   {
   }
   
   @Override
   public void dispose()
   {
      state.dispose();
      if (nextState != null)
      {
         nextState.dispose();
      }
   }
}
