import java.awt.*;

public class Backgroud {
    private Render render2;

    public Backgroud() {
        this.render2 = new Render(Color.BLACK, 1024, 600);
    }

    public void render(Graphics graphics) {
        this.render2.render(graphics);
    }
}

