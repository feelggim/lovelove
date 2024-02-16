package _10000;

import java.util.Scanner;

public class _1356 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
		 {
			System.out.print("*");

			}
			System.out.println();
			
			for (int j = n; j >= i; i++) {
				System.out.print(" ");
			}
			System.out.println();

			sc.close();
		}

	}

}
