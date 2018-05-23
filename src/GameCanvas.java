import Player.Player;
import base.GameObjectManager;
import game.ViewPort;
import input.KeyInput;
import input.KeyboardInput;
import scene.GameplayScene;
import scene.SceneManager;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {

    private BufferedImage backBuffered;
    private Graphics graphics;
    private ViewPort viewPort;
    private Player player;

    public GameCanvas() {
        this.setSize(2048, 1200);
        this.setupBackBuffered();
        this.player = new Player();
        SceneManager.instance.changeScene(new GameplayScene());
        this.viewPort = new ViewPort();
        this.setVisible(true);
    }

    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage( 2048, 1200, BufferedImage.TYPE_4BYTE_ABGR); //khoi tao object
        this.graphics = this.backBuffered.getGraphics();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d =(Graphics2D) g;
        g2d.drawImage(this.backBuffered, 0, 0, null);
    }

    public void renderAll() {
        GameObjectManager.instance.renderAll(this.graphics, viewPort);
        this.repaint();
    }

    public void runAll() {
        GameObjectManager.instance.runAll();
        SceneManager.instance.performChangeSceneIfNeeded();
        viewPort.follow(player);
        KeyboardInput.instance.update();
    }
}
