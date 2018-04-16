import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player {
    public Vector2D position;
    public Color color;
    public Vector2D volocityX;
    public Vector2D velocityY;
    private Polygon polygon;
    private List<Vector2D> vertices;
    private Random random;

    public Player(Vector2D position, Color color, Vector2D volocityX, Vector2D velocityY){
        this.position = position;
        this.color = color;
        this.volocityX = volocityX;
        this.velocityY = velocityY;
        this.polygon = new Polygon();
        this.random = new Random();
        this.vertices = Arrays.asList(
                new Vector2D().rotate(230),
                new Vector2D(0 ,16).rotate(230),
                new Vector2D(20 , 8).rotate(230)
        );
        this.vertices.forEach(vector2D -> polygon.addPoint((int)vector2D.x, (int)vector2D.y));
    }

    public void render(Graphics graphics){
        this.update();
        this.run();
        graphics.setColor(this.color);
        graphics.fillPolygon(this.polygon);

    }
    private void update(){
        this.polygon.reset();
        Vector2D center = this.vertices
                .stream()
                .reduce(new Vector2D(), (v1, v2)-> v1.add(v2))
                .multiply(1.0f / (float) this.vertices.size());//tinh vector trong tam G
        Vector2D translate = this.position.subtract(center);
        this.vertices
                .stream()
                .map(vector2D -> vector2D.add(translate))// duyệt tất cả phần tử -> mỗi vector công thêm 1 vector khác
                .forEach(vector2D -> polygon.addPoint((int)vector2D.x, (int)vector2D.y));
    }
    public void run() {
            this.position.subtractBy(volocityX);
            if (this.position.x < 0){
                this.position.x = random.nextInt(1024);
            }
            this.position.subtractBy(velocityY);
            if (this.position.y < 0){
                 this.position.y = random.nextInt(600);
            }
    }

}
