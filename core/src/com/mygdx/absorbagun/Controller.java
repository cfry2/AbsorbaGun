package com.mygdx.absorbagun;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

/**
 * Created by cameron.fry on 30/10/18.
 */

public class Controller {
    private Character character;

    public Controller(Character character) {
        this.character = character;
    }

    public void handleInput() {

        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            character.jump();
        }

        if(Gdx.input.isKeyPressed(Input.Keys.D)) {
            character.movingForward = true;
        }
        else {
            character.movingForward = false;
        }

        if(Gdx.input.isKeyPressed(Input.Keys.A)) {
            character.movingBackward = true;
        }
        else {
            character.movingBackward = false;
        }
    }
}
