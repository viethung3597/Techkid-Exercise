import java.awt.*;
import java.awt.image.BufferedImage;

public class Star {
    public Vector2D position;
    public BufferedImage image;
    public int width;
    public int height;
    public Vector2D velocityX;

    //constructor
    public Star(Vector2D position, int width, int height, BufferedImage image, Vector2D velocityX){
        this.position = position;
        this.width = width;
        this.height = height;
        this.image = image;
        this.velocityX = velocityX;
    }

    public void run(){
        this.position.subtractBy(this.velocityX);
    }

    public void render(Graphics graphics){
        graphics.drawImage(this.image, (int)this.position.x, (int)this.position.y, this.width, this.height, null);
    }
}
