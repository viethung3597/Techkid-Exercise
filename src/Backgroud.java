import java.awt.*;

public class Backgroud extends GameObject{
    public Backgroud() {
        this.renderer = new BackgroundRenderer(Color.BLACK, 1024, 600);
    }
}

