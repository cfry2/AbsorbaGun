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
    private final float GRAVITY = -100f;
    private final float JUMP_SPEED = 100f;
    public Rectangle box;
    private int width;
    private int height;
    public boolean onGround = true;
    public boolean movingForward = false;
    public boolean movingBackward = false;

    public Character(float x, float y, int width, int height) {
        velocity = new Vector2(0, GRAVITY);
        position = new Vector2(x, y);
        this.width = width;
        this.height = height;
        box = new Rectangle(position.x, position.y, this.width, this.height);
    }

    public void update(float delta) {
        velocity.y += GRAVITY * delta;
        position.y += velocity.y * delta;
        position.x += velocity.x * delta;

        if(movingForward) {
            velocity.x = 150f;
        }
        else if(movingBackward) {
            velocity.x = -150f;
        }
        else {
            velocity.x = 0;
        }

        if(position.y < 0) {
            position.y = 0;
            velocity.y = 0;
            onGround = true;
        }

        box.x = position.x;
        box.y = position.y;

    }

    public void jump() {
        if(onGround) {
            onGround = false;
            velocity.y = JUMP_SPEED;
        }
    }
    public void setY(float y) {
        position.y = y;
    }
    public void setX(float x) {
        position.x = x;
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
