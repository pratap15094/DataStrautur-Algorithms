package DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Weekend {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Date in this formate DD-MM-YYYY: ");
		String date = scan.nextLine();
		String[] arr1 = date.split("-");
		
		LocalDate localDate= LocalDate.of(Integer.parseInt(arr1[2]), Integer.parseInt(arr1[1]),
				Integer.parseInt(arr1[0]));
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
			System.out.println("WeekDay");
		}else {
			System.out.println("Non-WeekDay");
		}
	}

}
