package renderer;

import base.Vector2D;

import java.awt.*;

public class BackgroundRenderer implements Renderer {

    private int width;
    private int height;

    public BackgroundRenderer( int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void render(Graphics graphics, Vector2D position) {
        graphics.fillRect((int) position.x, (int) position.y, this.width, this.height);
    }
}
