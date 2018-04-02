public class date {
    public static void main(String[] args) {

        int date,year;
        String day,month;
        day = "monday";
        date = 2;
        month = "april";
        year = 2018;

        System.out.println(String.format("today: %s, %s %s, %s",day, date, month, year));

        int date2 = 16;
        String month2 = "july";
        int year2 = 2011;
        String day2 = "saturday";

        System.out.println(String.format("American format: %s, %s, %s, %s",day2, month2,date2,year2));
        System.out.println(String.format("EU format: %s, %s, %s, %s",day2, month2,date2,year2));

    }
}
