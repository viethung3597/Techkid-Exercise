import java.awt.*;

public class Backgroud {
    public int width;
    public int height;
    public Color color;

    public Backgroud(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void render(Graphics g) {
        g.setColor(this.color);
        g.fillRect(0, 0, this.width, this.height);
    }
}

