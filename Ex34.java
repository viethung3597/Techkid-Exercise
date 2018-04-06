public class Ex34 {
    public static void printAmerican(){
        int date,year;
        String day,month;
        day = "Friday";
        date = 6;
        month = "April";
        year = 2018;
        System.out.println(String.format("American: %s, %s %s, %s",day, date, month, year));
    }
    public static void printEuro(){
        int date,year;
        String day,month;
        day = "friday";
        date = 6;
        month = "April";
        year = 2018;
        System.out.println(String.format("Euro: %s, %s %s, %s",day, date, month, year));
    }
    public static void main(String[] args) {
        printAmerican();
        printEuro();
    }
}
