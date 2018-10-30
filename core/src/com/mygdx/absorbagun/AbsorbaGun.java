package com.mygdx.absorbagun;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class AbsorbaGun extends Game {
	public SpriteBatch batch;
	public ShapeRenderer shapeRenderer;
	

	public void create () {
		batch = new SpriteBatch();
		shapeRenderer = new ShapeRenderer();
		this.setScreen(new LevelOne(this));
	}


	public void render () {
		super.render();
	}
	

	public void dispose () {
		batch.dispose();
	}
}
