package stringsProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Splict {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Input String: ");
		String str = scan.nextLine();
		List<String> list = splitString(str);
		for (String val : list) {
			if (val == "")
				System.out.println(-1);
			else
				System.out.println(val);
		}
	}

	static List<String> splitString(String S) {

		String S1 = S.replaceAll("[^a-zA-Z]", "");
		String S2 = S.replaceAll("[^0-9]", "");
		String S3 = S.replaceAll("[a-zA-Z0-9]", "");
		List<String> al = new ArrayList<String>(3);
		
		if (S1.length() == 0) al.add("-1");	
		else al.add(S1); 
			
		if (S2.length() == 0) al.add("-1");
		else al.add(S2);
		
		if (S3.length() == 0) al.add("-1");	
		else al.add(S3);
	
	return al;
	}
}
