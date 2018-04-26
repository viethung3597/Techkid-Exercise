package game.enemy;

import base.GameObject;
import base.GameObjectManager;
import game.player.Player;
import physic.BoxCollider;
import renderer.ImageRenderer;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Enemy extends GameObject {
    public EnemyMove enemyMove;
    public BoxCollider boxCollider;

    public Enemy() {
        this.enemyMove = new EnemyMove();
        this.renderer = new ImageRenderer("resources/images/circle.png", 20, 20);
        this.boxCollider = new BoxCollider(20, 20);
    }

    @Override
    public void run() {
        super.run();
        this.enemyMove.run(this);
        this.boxCollider.position.set(this.position);
        this.checkCollisionEnemy();
    }

    private void checkCollisionEnemy() {
        Player player = GameObjectManager.instance.checkCollisionEnemy(this.boxCollider);
        if (player != null) {
            player.getHit();
            this.getHit();
        }
    }

    public void getHit() {
        this.isAlive = false;
    }
}
