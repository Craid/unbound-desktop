package de.thm.sag.unbound.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import de.unbound.TestGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.vSyncEnabled = true;
		config.backgroundFPS = 12;
		config.foregroundFPS = 60;
		config.width = 1280;
		config.height = 900;
		new LwjglApplication(new TestGame(), config);
	}
}
