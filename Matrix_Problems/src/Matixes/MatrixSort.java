package Matixes;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSort {

	public static void main(String args[]) {

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

		int p = 0;
		int[] temp = new int[n * n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				temp[p++] = matrix[i][j];
			}
		}

		Arrays.sort(temp);

		int ans[][] = new int[n][n];
		p = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans[i][j] = temp[p++];
			}
		}

		System.out.println("Sorted matrix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}
