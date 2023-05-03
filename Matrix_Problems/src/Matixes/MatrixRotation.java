package Matixes;

import java.util.Scanner;

public class MatrixRotation {

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
		
		//Transpose of matrix
		for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
		//Reverse the transpose of matrix
        for(int i = 0; i<n/2; i++){
            for(int j = 0; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-i-1][j];
                matrix[n-i-1][j] = temp;
            }
        }
        System.out.println("Matrix Rotate by 90 degree");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
    }
}
