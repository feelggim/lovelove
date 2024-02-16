package _10000;

import java.util.Scanner;

public class _1501{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int [n][n];
		int k = 1;
		
		for (int i = 0; i < arr.length ; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			sc.close();
	}
	}
			
		
			
	
	
	
			
		
		
		/*for (int i = 0; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.println(arr+"?");
			*/

			
