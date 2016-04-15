package de.thm.sag.unbound.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import de.unbound.TestGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.useGL30 = true;
		config.useHDPI = true;
		config.width = 800;
		config.height = 600;
		config.title = "Unbound";
		config.resizable = false;
		
		new LwjglApplication(new TestGame(), config);
	}
}
