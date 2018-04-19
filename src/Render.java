import java.awt.*;
import java.awt.image.BufferedImage;

public class Render {
    private Color color;
    private int width,height;

    public Render(Color color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }
//    public void render2(Graphics graphics , Vector2D position){
//        graphics.render2(this.color, this.width, this.height, null);
//    }
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.fillRect(0, 0, this.width, this.height);
    }
}
