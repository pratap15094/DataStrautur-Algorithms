package Matixes;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter N*N size: ");
		int n = scan.nextInt();

		System.out.println("Enter matrix");
		int[][] matrix1 = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}

		int d1 = 0, d2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					d1 += matrix1[i][j];
				if (j == n - i - 1)
					d2 += matrix1[i][j];
			}
		}
		int sum = d1+d2;
		System.out.println("Sum of Diagonal: "+ sum);
	}
}