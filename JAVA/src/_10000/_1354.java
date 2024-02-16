package _10000;

import java.util.Scanner;

public class _1354 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			// 안쪽 반복문 열 j
			for (int j = n; j <= i; j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}
