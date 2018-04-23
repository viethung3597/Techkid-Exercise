import java.awt.*;

public class Player extends GameObject{
    public PlayerMove playerMove;
    public PlayShoot playShoot;

    public Player() {
        this.position = new Vector2D();
        this.playShoot = new PlayShoot();
        this.renderer = new PolygonRenderer(Color.RED,
                new Vector2D(),
                new Vector2D(0, 16),
                new Vector2D(20, 8)
        );
        this.playerMove = new PlayerMove();
    }

    public void run() {
        super.run();
        this.playerMove.run(this);
        ((PolygonRenderer)this.renderer).angle = this.playerMove.angle;
        this.playShoot.run(this);
        this.playShoot.bulletPlayers.forEach(bulletPlayer -> bulletPlayer.run());

    }

    public void render(Graphics graphics) {
        super.render(graphics);
        this.playShoot.bulletPlayers.forEach(bulletPlayer -> bulletPlayer.render(graphics));
    }


}