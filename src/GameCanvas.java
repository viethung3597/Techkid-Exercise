import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameCanvas extends JPanel {


    private  BufferedImage backBuffered ;
    private  Graphics graphics;
    private List<Star> stars;
    private List<Enemy> enemies;
    private Random random;
    private int count;
    private Backgroud backgrouds;



    public GameCanvas(){
        //set size
        this.setSize(1024 , 600);

        //khoi tao back buffered
        this.setupBackBuffered();
        this.stars = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.random = new Random();
        this.setVisible(true);//cho phép window hiển thị
    }
//    private void setupStar(){
//        this.star = new Star(900 , 600 , 5 , 5 , this.loadImage("resources/images/star.png"), 2);
//    }

    private void setupBackBuffered(){
        this.backBuffered = new BufferedImage(1024, 600, BufferedImage.TYPE_4BYTE_ABGR);
        this.graphics = this.backBuffered.getGraphics();
    }


    @Override
    protected void paintComponent(Graphics g) {
       // nơi vẽ toàn bộ mọi thứ
        g.drawImage(this.backBuffered, 0, 0, null);

    }
    public void renderAll(){
        this.drawBackgroud();
        //star
        this.stars.forEach(star -> star.render(graphics));
        //enemy
        this.enemies.forEach(enemy -> enemy.render(graphics));
        this.repaint();
    }
    public  void  runAll(){
        //cap nhat moi thu
        this.drawBackgroud();
        //star
        this.createStar();
        this.stars.forEach(star -> star.run());
        //enemy
        this.createEnemy();
        this.enemies.forEach(enemy -> enemy.run());
    }
    private void createEnemy(){
        if (this.count == 30){
            Enemy enemy = new Enemy(this.random.nextInt(1024), 600, this.loadImage("resources/images/circle.png"), 6, 6, this.random.nextInt(2)+1);
            this.enemies.add(enemy);
            this.count = 0;
        }else {
            this.count +=1;
        }
    }
    private void createStar(){
        if (this.count == 30){
        Star star = new Star(1024 , this.random.nextInt(600) , 5 , 5 , this.loadImage("resources/images/star.png"), this.random.nextInt(2)+1);
        this.stars.add(star);
        this.count = 0;
        }else{
            this.count +=1;
        }
    }
    private void drawBackgroud(){
        this.backgrouds = new Backgroud(1024, 600, Color.BLACK);
        this.backgrouds.render(this.graphics);
    }
    private BufferedImage loadImage(String path){
        try {
            return ImageIO.read(new File(path));
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
