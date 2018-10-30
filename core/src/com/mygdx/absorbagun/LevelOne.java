package com.mygdx.absorbagun;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by cameron.fry on 29/10/18.
 */

public class LevelOne implements Screen {
    final AbsorbaGun game;
    private Character character;
    private  Controller controller;

    private Rectangle platform;

    public LevelOne(final AbsorbaGun game) {
        this.game = game;
        character = new Character(200,0,50,70);
        controller = new Controller(character);
        platform = new Rectangle(300, 90, 200, 10);
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
        game.shapeRenderer.setColor(0, 0, 1, 1);
        game.shapeRenderer.rect(platform.getX(), platform.getY(),platform.getWidth(), platform.getHeight());
        game.shapeRenderer.end();
        game.batch.begin();
        game.batch.end();
        controller.handleInput();
        character.update(delta);

        if(platform.overlaps(character.box)) {
            if(character.box.y > platform.y) {
                character.onGround = true;
                character.setY(platform.y + platform.height);
            }
            else if((character.box.x + character.getWidth()) > platform.x && (character.box.x + character.getWidth()) < (platform.x + platform.width) && (character.getHeight() + character.box.y) > platform.y ) {
                character.setX(platform.x - character.getWidth());
            }
            else if ((character.box.x + character.getWidth()) > platform.x && (character.box.x + character.getWidth()) > (platform.x + platform.width) && (character.getHeight() + character.box.y) > platform.y) {
                character.setX(platform.x + platform.width);
            }
            else {
                character.setY(platform.y - character.getHeight());
            }

        }
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
