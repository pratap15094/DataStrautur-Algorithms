package SEBI;

import java.util.Arrays;
import java.util.Scanner;

public class CipherTextCoversion {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String inputStr= scan.nextLine();
		inputStr = inputStr.toUpperCase();
		String res="";
		char[] ch = new char[26];
		for(int i=0;i<26;i++) {
			ch[i]=(char)(i+'A');
		}
		//System.out.println(Arrays.toString(ch));
		for(int i=0; i<inputStr.length(); i++) {
			char chs = Character.MIN_VALUE;
			if(i%2==0) {
				chs=(char)(inputStr.charAt(i)+i+1);
				if(chs>='A' && chs<='Z') {
					res+=chs;
				}else {
					res+=ch[i+1];
				}
			}else {
				chs=(char)(inputStr.charAt(i)-(i+1));
				if(chs>='A' && chs<='Z') {
					res+=chs;
				}else {
					res+=ch[i+1];
				}
			}
//		System.out.println(res);
		}
		System.out.println(res);
	}

}
