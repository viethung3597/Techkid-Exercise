package game;

import Player.Player;
import base.GameObject;
import base.Vector2D;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class ViewPort {

    private Vector2D position;

    public ViewPort(){
        position = Vector2D.ZERO.clone();
    }

    public void follow(GameObject gameObject){
        position.x = gameObject.position.x;
        position.y = gameObject.position.y;

    }

    public Vector2D translate(Vector2D position){
       return position.subtract(this.position);
    }
}
