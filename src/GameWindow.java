import game.ViewPort;
import input.KeyInput;
import map.Map;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameWindow extends JFrame {

    private GameCanvas gameCanvas;
    private long lastTime = 0;

    public GameWindow() {
        // set size cho window
        this.setSize(3000, 3000);
        this.setupGameCanvas();
        this.eventKeyboard();
        addPlatforms();
        this.windowEvent();
        this.setVisible(true);
    }

    private void setupGameCanvas() {
        this.gameCanvas = new GameCanvas();
        this.add(this.gameCanvas);
    }

    private void addPlatforms() {
        Map map = Map.load("resources/Map/Map TLU.json");
        map.generate();
    }


    private void eventKeyboard() {
        this.addKeyListener(KeyInput.instance);
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
