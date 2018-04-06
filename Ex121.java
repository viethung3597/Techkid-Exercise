public class Ex121 {
    public static void main(String[] args) {
        int[] cloneArray = {1, 2, 3, 4};
        int[] cloneArray2 = new int[4];
        for(int loop = 0; loop < 4; loop++) {
            cloneArray[loop] = cloneArray2[loop];
        }
        for(int loop = 0; loop < 4; loop++) {
            System.out.println(String.format(" %s -> %s ",cloneArray[loop], cloneArray2[loop]));
        }
    }
}
