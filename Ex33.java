import java.util.Scanner;

public class Ex33 {
    public static void zool() {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Nhap so ma ban yeu thich : ");
        int a = keyboardScanner.nextInt();
        System.out.println("Nhap thu cung ma ban yeu thich : ");
        String b = new String();
        b = keyboardScanner.next();
        System.out.println("Nhap con duong ma ban da di : ");
        String c = new String();
        c = keyboardScanner.next();
    }

    public static void main(String[] args) {
        zool();
    }
}