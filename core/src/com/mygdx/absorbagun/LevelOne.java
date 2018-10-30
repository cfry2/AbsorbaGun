package com.mygdx.absorbagun;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by cameron.fry on 29/10/18.
 */

public class LevelOne implements Screen {
    final AbsorbaGun game;
    private Character character;
    public LevelOne(final AbsorbaGun game) {
        this.game = game;
        character = new Character(200,0,50,70);
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.2f, 1, 0.5f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        game.shapeRenderer.setColor(1, 1, 0, 1);
        game.shapeRenderer.rect(character.getX(), character.getY(), character.getWidth(), character.getHeight());
        game.shapeRenderer.end();
        game.batch.begin();
        game.batch.end();

        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            character.jump();
        }

        character.update(delta);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
