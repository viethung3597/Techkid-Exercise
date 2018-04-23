import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameWindow extends JFrame {
    private GameCanvas gameCanvas;
    private long lastTime = 0;

    public GameWindow() {
        //set size cho window
        this.setSize(1024, 600);
        this.setupGameCanvas();
        this.eventKeyboard();
        this.windowEvent();
        this.setVisible(true);//cho phép window hiển thị

    }

    private void setupGameCanvas() {

        this.gameCanvas = new GameCanvas();
        this.add(this.gameCanvas);
    }

    private void eventKeyboard() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {

                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

                }
//                Vector2D defaultVelocity = new Vector2D(3.5f,0);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                Vector2D defaultVelocity = new Vector2D(3.5f, 0);
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    gameCanvas.player.playerMove.angle += 5;

                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    gameCanvas.player.playerMove.angle -= 5;
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    defaultVelocity.set(10, 0);
                }
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    gameCanvas.player.playShoot.isPlayerShoot = true;
                }
                gameCanvas.player.playerMove.velocity.set(defaultVelocity.rotate(gameCanvas.player.playerMove.angle));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                Vector2D defaultVelocity = new Vector2D(3.5f, 0);
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    return;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    return;
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    defaultVelocity.set(3.5f, 0);
                }
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    gameCanvas.player.playShoot.isPlayerShoot = false;
                }
                gameCanvas.player.playerMove.velocity.set(defaultVelocity.rotate(gameCanvas.player.playerMove.angle));
            }
        });
    }

    private void windowEvent() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });

    }

    public void gameLoop() {
        while (true) {
            long currentTime = System.nanoTime();
            if (currentTime - lastTime >= 17_000_000) {
                this.gameCanvas.runAll();
                this.gameCanvas.renderAll();
                this.lastTime = currentTime;
            }

        }
    }
}
