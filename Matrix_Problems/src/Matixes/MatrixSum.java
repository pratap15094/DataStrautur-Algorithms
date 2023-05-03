package Matixes;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int row= scan.nextInt();
		System.out.println("Enter column: ");
		int cal= scan.nextInt();
		int[][] matrix =  new int[row][cal];
		for(int i=0; i<row ;i++) {
			for(int j=0; j<row ;j++) {
				matrix[i][j]=scan.nextInt();
			}	
		}
		
		int res=0;
		for(int i=0; i<row ;i++) {
			for(int j=0; j<row ;j++) {
				res+=matrix[i][j];
			}	
		}
    System.out.println("Sum is: "+res);
	}
}
