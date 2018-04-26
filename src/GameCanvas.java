import base.GameObjectManager;
import game.background.Background;
import game.enemy.EnemySqwaner;
import game.player.Player;
import game.star.StarSqwaner;
import input.KeyInput;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {

    private BufferedImage backBuffered;
    private Graphics graphics;

    public GameCanvas() {
        this.setSize(1024, 600);
        this.setupBackBuffered();
        GameObjectManager.instance.add(new Background());
        this.setupPlayer();
        GameObjectManager.instance.add(new EnemySqwaner());
        GameObjectManager.instance.add(new StarSqwaner());
        this.setVisible(true);
    }

    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage(1024, 600, BufferedImage.TYPE_4BYTE_ABGR); //khoi tao object
        this.graphics = this.backBuffered.getGraphics();
    }

    private void setupPlayer() {
        Player player = new Player();
        player.position.set(200, 200);
        GameObjectManager.instance.add(player);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered, 0, 0, null);
    }

    public void renderAll() {
        GameObjectManager.instance.renderAll(this.graphics);
        this.repaint();
    }

    public void runAll() {
        GameObjectManager.instance.runAll();
        KeyInput.instance.reset();
    }

}
