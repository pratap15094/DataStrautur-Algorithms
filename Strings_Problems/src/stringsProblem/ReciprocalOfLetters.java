package stringsProblem;

import java.util.Scanner;

public class ReciprocalOfLetters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Input String: ");
		String str = scan.nextLine();
		System.out.println("Resulted string: " + reciprocalString(str));
	}

	public static String reciprocalString(String s) {

		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) ('Z' + 'A' - ch);
			} else if (ch >= 'a' && ch <= 'z') {
				ch = (char) ('z' + 'a' - ch);
			}
			ans.append(ch);
		}
		return ans.toString();
	}
}
