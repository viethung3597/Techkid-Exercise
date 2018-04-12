import java.awt.*;
import java.awt.image.BufferedImage;

public class Enemy {
    public int x;
    public int y;
    public int width;
    public int height;
    public BufferedImage image;
    public int volocityX;
    public int volocityY;

    public Enemy(int x, int y, BufferedImage image, int width, int height ,  int volocityY){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.image = image;
        this.volocityY = volocityY;
    }

    public void run(){
        this.y -= volocityY;
    }

    public void render(Graphics graphics){
        graphics.drawImage(this.image, this.x, this.y, this.width, this.height, null);
    }
}
