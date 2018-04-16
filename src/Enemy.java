import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Enemy {
    public Vector2D position;
    public int width;
    public int height;
    public BufferedImage image;
    public Vector2D volocityX;
    public Vector2D volocityY;


    public Enemy(Vector2D position, BufferedImage image, int width, int height , Vector2D volocityX, Vector2D volocityY){
        this.position = position;
        this.width = width;
        this.height = height;
        this.image = image;
        this.volocityX = volocityX;
        this.volocityY = volocityY;
    }

    public void run(){

        this.position.subtractBy(this.volocityX);
        this.position.subtractBy(this.volocityY);
    }

    public void render(Graphics graphics){
        graphics.drawImage(this.image, (int)this.position.x, (int)this.position.y , this.width, this.height, null);
    }
}
