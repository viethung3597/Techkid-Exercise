import java.awt.*;
import java.awt.image.BufferedImage;

public class Star {
    public Vector2D position;
    public Vector2D velocity;
    private ImageRenderer renderer;

    //constructor
    public Star(){
        this.position = new Vector2D();
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources/images/star.png", 5 , 6);
    }

    public void run(){
        this.position.subtractBy(this.velocity);
    }

    public void render(Graphics graphics){
        this.renderer.render(graphics, this.position);
    }
}
