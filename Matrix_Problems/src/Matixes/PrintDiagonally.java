package Matixes;

import java.util.Scanner;

public class PrintDiagonally {


	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter N*N matrix:");
		int n = scan.nextInt();

		System.out.println("Enter matrix element");
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
				
        System.out.println("Matrix ");
        for(int k=0; k<=2*n; k++) {
        	int i = 0;
            while(i<=k) {
                int j = k-i;
                if(i<n && j<n){
                	System.out.print(matrix[i][j]+" ");
                }
                i++;
            }
        }
         
    }
}
