package Matixes;

import java.util.Scanner;

public class IdenticalMatrices {

	public static boolean isIdentical(int[][] matrix1, int[][] matrix2) {
		// Check if the matrices have the same dimensions
		if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			return false;
		}

		// Check each element of the matrices
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[0].length; j++) {
				if (matrix1[i][j] != matrix2[i][j]) {
					return false;
				}
			}
		}
	return true;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter matrix-1 details");
		System.out.println("Enter rows: ");
		int row1 = scan.nextInt();
		System.out.println("Enter column: ");
		int cal1 = scan.nextInt();
		int[][] matrix1 = new int[row1][cal1];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < cal1; j++) {
				matrix1[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter matrix-2 details");
		System.out.println("Enter rows: ");
		int row2 = scan.nextInt();
		System.out.println("Enter column: ");
		int cal2 = scan.nextInt();
		int[][] matrix2 = new int[row2][cal2];
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < cal2; j++) {
				matrix2[i][j] = scan.nextInt();
			}
		}
		
		boolean res = isIdentical(matrix1, matrix2);
		if(res==true) System.out.println("Identiacl Matrix");
		else System.out.println("Not identical matrix");
	}
}
