package Matixes;

import java.util.ArrayList;
import java.util.Scanner;

public class BoundaryTraversal {

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
		ArrayList<Integer> list = new ArrayList<>();
		if (n == 1) {
			System.out.println(matrix[0][0]);
		} else {
			for (int j = 0; j < n; j++) {
				list.add(matrix[0][j]);
			}
			for (int i = 1; i < n - 1; i++) {
				list.add(matrix[i][n - 1]);
			}
			for (int j = n - 1; j >= 0; j--) {
				list.add(matrix[n - 1][j]);
			}
			for (int i = n - 2; i > 0; i--) {
				list.add(matrix[i][0]);
			}
			System.out.print(list + " ");
		}
	}
}
