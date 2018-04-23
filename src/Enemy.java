import java.awt.*;

public class Enemy extends GameObject{
    public Vector2D velocity;

    public Enemy() {
        this.position = new Vector2D();
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources/images/circle.png", 20 , 20);
    }

    @Override
    public void run() {
        super.run();
        this.position.addUp(this.velocity);
    }

//    public void render(Graphics graphics) {
//        this.renderer.render(graphics, this.position);
//    }
}