package com.mygdx.absorbagun;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by cameron.fry on 29/10/18.
 */

public class Character {
    private Vector2 position;
    private Vector2 velocity;
    private final float GRAVITY = -60f;
    private final float JUMP_SPEED = 200f;

    private int width;
    private int height;
    public boolean onGround = true;

    public Character(float x, float y, int width, int height) {
        velocity = new Vector2(0, GRAVITY);
        position = new Vector2(x, y);
        this.width = width;
        this.height = height;
    }

    public void update(float delta) {
        velocity.y += GRAVITY * delta;
        position.y += velocity.y * delta;
        System.out.println(velocity.y);

        if(position.y < 0) {
            position.y = 0;
            velocity.y = 0;
            onGround = true;
        }
    }

    public void jump() {
        if(onGround) {
            onGround = false;
            velocity.y = JUMP_SPEED;
        }
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
