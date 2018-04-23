import java.util.ArrayList;
import java.util.List;

public class PlayShoot {

    public List<BulletPlayer> bulletPlayers;
    public boolean isPlayerShoot = false;
    private FrameCounter frameCounter;

    public PlayShoot() {
        this.bulletPlayers = new ArrayList<>();
        this.frameCounter = new FrameCounter(10);
    }

    public void run(Player player) {
        if (this.isPlayerShoot) {
            if (this.frameCounter.run()) {
                for (int i = 0; i < 8; i++){
                    BulletPlayer bulletPlayer = new BulletPlayer();
                    bulletPlayer.position.set(player.position);
                    Vector2D vector2D = new Vector2D(7, 0);
                    Vector2D rotate = vector2D.rotate(player.playerMove.angle);
                    Vector2D rotateEnemy = vector2D.rotate(i*40);
                    bulletPlayer.velocity.set(rotate);
                    bulletPlayer.velocity.set(rotateEnemy);
                    this.bulletPlayers.add(bulletPlayer);
                    this.frameCounter.reset();
                }
            }
        } else {
            this.frameCounter.reset();
        }
    }
}