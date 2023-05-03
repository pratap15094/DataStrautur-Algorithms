package stringsProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class ExtractIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Input String: ");
		String str = scan.nextLine();
		ArrayList<String> ans = extractIntegerWords(str);
		 if(ans.size()==0)
             System.out.println("No Integers");
         else{
             for(int i=0;i<ans.size();i++)
                 System.out.print(ans.get(i)+" ");
             System.out.println();
         }
	}
	
	//extract all the integers from String
	public static ArrayList<String> extractIntegerWords(String s) { 
        
		ArrayList<String> list = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				sb.append(s.charAt(i));
			}else if(sb.length()>0) {
				list.add(sb.toString());
				sb=new StringBuffer();
			}
		}
		if(sb.length()>0) {
			list.add(sb.toString());
		}
	return list;
    }
}
