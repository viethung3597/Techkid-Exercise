package game.enemy;

import base.GameObject;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import renderer.ImageRenderer;

import java.awt.*;

public class Enemy extends GameObject implements PhysicBody, HitObject {
    public EnemyMove enemyMove;
    public EnemyShot enemyShot;
    public BoxCollider boxCollider;

    public Enemy() {
        enemyMove = new EnemyMove();
        enemyShot = new EnemyShot();
        this.boxCollider = new BoxCollider(20, 20);
        this.renderer = new ImageRenderer("resources/images/circle.png", 20, 20,Color.CYAN);
    }

    public void run() {
        super.run();
        this.enemyMove.run(this);
        this.enemyShot.run(this);
        this.boxCollider.position.set(this.position);
    }

    @Override
    public void getHit(GameObject gameObject) {
        this.isAlive = false;
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}