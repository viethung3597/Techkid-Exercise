import java.awt.*;
import java.awt.image.BufferedImage;

public class Star {
    public int x;
    public int y;
    public BufferedImage image;
    public int width;
    public int height;
    public int velocityX;

    //constructor
    public Star(int x, int y, int width, int height, BufferedImage image, int velocityX){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.image = image;
        this.velocityX = velocityX;
    }

    public void run(){
        this.x -= velocityX;
    }

    public void render(Graphics graphics){
        graphics.drawImage(this.image, this.x, this.y, this.width, this.height, null);
    }
}
