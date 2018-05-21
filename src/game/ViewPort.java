package game;

import base.Vector2D;
import renderer.Renderer;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class ViewPort {

    private Vector2D position;

    public ViewPort(){
        position = new Vector2D(2000,2000);
    }
    public Vector2D translate(Vector2D screenPosition){
       return screenPosition.subtract(this.position);
    }

}
