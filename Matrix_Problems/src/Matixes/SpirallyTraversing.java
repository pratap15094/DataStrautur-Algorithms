package Matixes;

import java.util.ArrayList;
import java.util.Scanner;

public class SpirallyTraversing {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int row = scan.nextInt();
		System.out.println("Enter column: ");
		int cal = scan.nextInt();
		int[][] matrix = new int[row][cal];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		ArrayList<Integer> list = SpirallyTraversing(matrix, row, cal);
		System.out.println(list);
	}

	public static ArrayList<Integer> SpirallyTraversing(int[][] matrix, int row, int cal) {

		ArrayList<Integer> list = new ArrayList<>();
		int top = 0;
		int bottum = row - 1;
		int left = 0;
		int right = cal - 1;
		while (top <= bottum && left <= right) {

			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			top++;

			for (int i = top; i <= bottum; i++) {
				list.add(matrix[i][right]);
			}
			right--;

			if (top <= bottum) {
				for (int i = right; i >= left; i--) {
					list.add(matrix[bottum][i]);
				}
				bottum--;
			}

			if (left <= right) {
				for (int i = bottum; i >= top; i--) {
					list.add(matrix[i][left]);
				}
				left++;
			}
		}
	return list;
	}
}
