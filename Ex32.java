public class Ex32 {
    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }
    public static void ping() {
        System.out.println(".");
    }
}
//Ex : 3.2.1
// Chương trình in ra : No , I wug .
//                      You wugga wug .
//                      I wug .

//Ex : 3.2.2
// main -> zoop -> baffle -> ping