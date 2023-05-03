package Matixes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class DuplicateRows {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter row of matrix: ");
		int row = scan.nextInt();
		System.out.print("Enter column of matrix: ");
		int column = scan.nextInt();
		int[][] matrix = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}

		ArrayList<Integer> ans = repeatedRows(matrix, row, column);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
		System.out.println();
	}

//	public static ArrayList<Integer> DuplicateColumns(int[][] matrix, int n, int m) {
//
//		LinkedHashMap<ArrayList<Integer>, Integer> map = new LinkedHashMap<ArrayList<Integer>, Integer>();
//		ArrayList<Integer> ans = new ArrayList<>();
//		for (int i = 0; i < n; i++) {
//			ArrayList<Integer> list = new ArrayList<>();
//			for (int j = 0; j < m; j++) {
//				list.add(matrix[i][j]);
//			}
//			if (map.containsKey(list))
//				ans.add(i);
//			else
//				map.put(list, i);
//		}
//		return ans;
//	}

	public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n) {

		LinkedHashMap<ArrayList<Integer>, Integer> map = new LinkedHashMap<ArrayList<Integer>, Integer>();
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < m; i++) {

			ArrayList<Integer> al = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				al.add(matrix[i][j]);
			}

			if (map.containsKey(al)) {
				ans.add(i);
			}

			else {
				map.put(al, i);
			}
		}
		return ans;
	}

}
