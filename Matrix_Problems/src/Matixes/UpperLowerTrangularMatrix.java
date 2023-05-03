package Matixes;

import java.util.Scanner;

public class UpperLowerTrangularMatrix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N*N matrix");
		int n = scan.nextInt();

		System.out.println("Enter matrix element");
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
        
		int upper=0;
		System.out.println("Upper trangular matrix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i <= n - 1 - j) {
					System.out.print(matrix[i][j]);
					upper+=matrix[i][j];
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}

		int lower=0;
		System.out.println("Lower trangular matrix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= n - 1 - j) {
					System.out.print(matrix[i][j]);
					lower+=matrix[i][j];
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	System.out.println("Sum of upper and Lower trangular matrix: "+(upper+lower));
	}
}
