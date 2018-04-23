import java.awt.*;

public class BackgroundRenderer implements Renderer{
    private Color color;
    private int width,height;


    public BackgroundRenderer(Color color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }
    @Override
    public void render(Graphics graphics, Vector2D position) {
        graphics.setColor(this.color);
        graphics.fillRect(0, 0, this.width, this.height);
    }
}
