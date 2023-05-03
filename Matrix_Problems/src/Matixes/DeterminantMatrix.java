package Matixes;

import java.util.Scanner;

public class DeterminantMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter N*N matrix: ");
		int n = scan.nextInt();

		System.out.println("Enter matrix element");
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		int determinant = determinantOfMatrix(matrix);
        System.out.println("Determinant: " + determinant);
	}

	 public static int determinantOfMatrix(int[][] matrix) {
	        int n = matrix.length;

	        // Base case: If the matrix is a 1x1 matrix, the determinant is just the single element
	        if (n == 1) {
	            return matrix[0][0];
	        }

	        int determinant = 0;

	        // Calculate the determinant using the first row of the matrix
	        for (int j = 0; j < n; j++) {
	            int[][] subMatrix = new int[n - 1][n - 1];
	            for (int i = 1; i < n; i++) {
	                for (int k = 0; k < n; k++) {
	                    if (k < j) {
	                        subMatrix[i - 1][k] = matrix[i][k];
	                    } else if (k > j) {
	                        subMatrix[i - 1][k - 1] = matrix[i][k];
	                    }
	                }
	            }

	            int sign = (j % 2 == 0) ? 1 : -1;
	            determinant += sign * matrix[0][j] * determinantOfMatrix(subMatrix);
	        }

	        return determinant;
	    }
}
