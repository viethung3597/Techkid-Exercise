package background;

import base.GameObject;
import renderer.BackgroundRenderer;

import java.awt.*;

public class Background extends GameObject{

    public Background() {
        this.renderer = new BackgroundRenderer(Color.BLACK,5000,5000);
    }
}
