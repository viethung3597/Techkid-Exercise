import java.util.Random;

public class Ex123 {
    public static int randomInt(int low, int high){
        Random random = new Random();
        int x = random.nextInt(high - low + 1) + low;
        System.out.println(x);
        return x;
    };
}
