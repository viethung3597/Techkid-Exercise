public class time {
    public static void main(String[] args) {
        int hour = 10;
        int minute = 4;
        int second = 15;

        int time = (hour * 3600 + minute * 60 + second);
        System.out.println("Night have passed: " + time + " s");

        int time2 = (24 * 3600 - time);
        System.out.println("Day remain: " + time2 + " s");
    }
}