package com.mygdx.absorbagun.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.absorbagun.AbsorbaGun;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "AbsorbaGun";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new AbsorbaGun(), config);
	}
}
