package DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class NonWorkingDays {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter holidays: ");
		String holiday = scan.nextLine();
		String[] arr = holiday.split(",");

		System.out.print("Enter Date in this formate DD-MM-YYYY: ");
		String date = scan.nextLine();
		String[] arr1 = date.split("-");

		LocalDate localDate1 = LocalDate.of(Integer.parseInt(arr1[2]), Integer.parseInt(arr1[1]),
				Integer.parseInt(arr1[0]));
		LocalDate localDate = LocalDate.of(Integer.parseInt(arr1[2]), Integer.parseInt(arr1[1]),
				Integer.parseInt(arr1[0]));

		int nonWorkingDays = 0;
		while (localDate.getMonth() == localDate1.getMonth()) {

			DayOfWeek dayOfWeek = localDate.getDayOfWeek();
			if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
				nonWorkingDays++;
			}
			localDate = localDate.plusDays(1);
		}
		int res = nonWorkingDays + arr.length;
		System.out.println("nonWorkingDays: " + res);
	}
}
