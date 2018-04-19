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

    private void setupGameCanvas(){

        this.gameCanvas = new GameCanvas();
        this.add(this.gameCanvas);
    }

    private void eventKeyboard(){
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT){

                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){

                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    gameCanvas.player.playerMove.angle += 30;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    gameCanvas.player.playerMove.angle -= 30;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    return;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    return;
                }
            }
        });
    }
    private void windowEvent(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });

    }

    public void gameLoop(){
        while (true){
            long currentTime = System.nanoTime();
            if(currentTime - lastTime >= 17_000_000){
                this.gameCanvas.runAll();
                this.gameCanvas.renderAll();
                this.lastTime = currentTime;
            }

        }
    }
}
