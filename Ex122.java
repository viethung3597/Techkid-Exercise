import java.util.Random;

public class Ex122 {
    static double random(double low,double high){
        double Random =Math.random() * high + low;
        return Random;
    }
    public static void main(String[] args) {
        System.out.println(random(0,50));
    }
}