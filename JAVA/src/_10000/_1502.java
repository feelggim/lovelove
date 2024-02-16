package _10000;

import java.util.Scanner;

public class _1502 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int k = 1; // 받을꺼하나 생성하구..

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				arr[i][j] = k++;
		}
		//출력~~~~~~~~~~~~~~~
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
