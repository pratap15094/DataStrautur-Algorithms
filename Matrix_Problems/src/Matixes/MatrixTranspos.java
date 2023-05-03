package Matixes;

import java.util.Scanner;

public class MatrixTranspos {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of Matrix: ");
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter matrix element");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		System.out.println("Transpose of matrix");
		for(int i=0; i<n ;i++) {
			for(int j=0; j<n ;j++) {
				System.out.print(arr[i][j]+" ");
			}	
		System.out.println();
		}
	}
}
