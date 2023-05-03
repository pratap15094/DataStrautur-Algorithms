package SEBI;

import java.time.LocalDate;
import java.util.Scanner;

public class findDay {
	
	 public static void main(String[] args)  {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter year: ");
		 int year= scan.nextInt();
		 System.out.println("Enter Month: ");
		 int month= scan.nextInt();
		 System.out.println("Enter Day: ");
		 int day= scan.nextInt();
		 System.out.println(findDay(day, month, year));
	 }
	 
	 static String findDay(int Day, int Month, int Year){
	       LocalDate my_date = LocalDate.of(Year, Month, Day);
	       return my_date.getDayOfWeek().name();
	 }
}
