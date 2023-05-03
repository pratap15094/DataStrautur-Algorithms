package DateAndTime;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        // Get the current date and time
        Calendar calendar = Calendar.getInstance();
        
        //Print the date and time in various formats
        System.out.println("Current Date and Time: " + calendar.getTime());
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month (0-11): " + calendar.get(Calendar.MONTH));
        System.out.println("Day of Month: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Week (1-7): " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hour (0-23): " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
        System.out.println("Second: " + calendar.get(Calendar.SECOND));
        System.out.println("Millisecond: " + calendar.get(Calendar.MILLISECOND));
    }
}