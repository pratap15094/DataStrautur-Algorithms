package DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
	
	public static void main(String args[]) {
		
		LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDates = LocalDate.of(2012, 04, 10);
        System.out.println(localDates);
        LocalDate localDate3 =LocalDate.of(2012, Month.APRIL, 06);
        System.out.println(localDate3);        
        LocalDate localDate6 = LocalDate.ofEpochDay(120);
        System.out.println(localDate6);       
      
        
//        System.out.println("Year Day Date " + LocalDate.ofYearDay(2018,15));
//        System.out.println("Epoch Day " + LocalDate.ofEpochDay(1));
  
//        System.out.println(" /*** Getting Values from Local Date ***/");
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getMonthValue());
//        System.out.println(localDate.getDayOfWeek());
//        System.out.println(localDate.getDayOfYear());
//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDate.getYear());
        //System.out.println("Day of Month using get : " + localDate.get(ChronoField.DAY_OF_MONTH));
        
//        System.out.println("/*** Modifying Values in Local Date***/");
//        System.out.println("Plus Weeks  : " + localDate.plusWeeks(1));
//        System.out.println("Plus Years : " + localDate.plusYears(1));
//        System.out.println("Plus Days " + localDate.plusDays(1));
//        System.out.println("Plus Months : " + localDate.plusMonths(1));
//        System.out.println("Minus Months : "+localDate.minusMonths(1));
//        System.out.println("Chrono Unit : " + localDate.minus(2, ChronoUnit.YEARS));
//        System.out.println("With Year : " + localDate.withYear(2019));
//        System.out.println("With Year Chrono Field : " + localDate.with(ChronoField.YEAR , 2019));
//        System.out.println("With Temporal Adjusters : " + localDate.with(TemporalAdjusters.lastDayOfMonth()));
//        System.out.println("With Temporal Adjusters : " + localDate.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY))); // maps to the first friday of the week
//         
//        
//        System.out.println("/*** Additional Support Methods ***/");
//        System.out.println("Not a Leap Year : " + localDate.isLeapYear());
//        LocalDate  localDate2 = LocalDate.of(2020,01,31);
//        System.out.println("Leap Year : " +  localDate2.isLeapYear());
//        System.out.println("isBefore : " + localDate2.isBefore(localDate));
//        System.out.println("isAfter : " + localDate2.isAfter(localDate));
//        System.out.println("isEqual : " + localDate2.isEqual(localDate));
        
        
       
//        System.out.println(" /*** Unsupported Scenarios ***/");
//        System.out.println("Chorion Unit : " + localDate.minus(2, ChronoUnit.SECONDS));
//        System.out.println("is Supported : " + localDate.isSupported(ChronoUnit.DAYS));
        
        
        
	}
}
