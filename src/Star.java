import java.awt.*;

public class Star extends GameObject {

    public Vector2D velocity;


    //constructor
    public Star(){
        this.position = new Vector2D();
        this.velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources/images/star.png", 5 , 6);
    }

    @Override
    public void run(){
        super.run();
        this.position.subtractBy(this.velocity);
    }
//    public void run(){
//        this.position.subtractBy(this.velocity);
//    }

}
