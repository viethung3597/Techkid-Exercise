package game.player;

import base.GameObject;
import base.Vector2D;
import physic.BoxCollider;
import renderer.PolygonRenderer;

import java.awt.*;

public class Player extends GameObject {

    public PlayerMove playerMove;
    public PlayerShoot playerShoot;
    public BoxCollider boxCollider;

    public Player() {
        this.position = new Vector2D();
        this.boxCollider = new BoxCollider(10,10);
        this.renderer = new PolygonRenderer(Color.RED,
                new Vector2D(),
                new Vector2D(0, 16),
                new Vector2D(20, 8)
        );
        this.playerMove = new PlayerMove();
        this.playerShoot = new PlayerShoot();
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(position);
        this.playerMove.run(this);
        ((PolygonRenderer)this.renderer).angle = this.playerMove.angle;
        this.playerShoot.run(this);
    }
    public void getHit() {
        this.isAlive = false;
    }
}
