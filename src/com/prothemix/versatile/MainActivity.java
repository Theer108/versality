package com.prothemix.versatile;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.BaseGameActivity;

import com.prothemix.versatile.util.SystemUiHider;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
public class MainActivity extends BaseGameActivity {
	final int mCameraWidth = 800;
	final int mCameraHeight = 480;
	public Scene mScene;
	
	@Override
	public EngineOptions onCreateEngineOptions()
	{
		Camera mCamera = new Camera(0, 0, mCameraWidth, mCameraHeight);
		final EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.LANDSCAPE_FIXED, new RatioResolutionPolicy(mCameraWidth, mCameraHeight), mCamera);
		return engineOptions;
	}
	
    
    @Override
    public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback)     throws Exception {

            pOnCreateResourcesCallback.onCreateResourcesFinished();
    }
   
    @Override
    public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws Exception {
            mScene = new Scene();

            pOnCreateSceneCallback.onCreateSceneFinished(mScene);
    }
   
    @Override
    public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback)     throws Exception {

            pOnPopulateSceneCallback.onPopulateSceneFinished();
    }

 
}
