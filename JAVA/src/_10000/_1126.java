package _10000;

import java.util.Scanner;

public class _1126 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[7]; // 로또번호 배열...
		int a; //
		int c = 0;
		int bun = 0;// 보너스번호
		String s = "";

		for (int i = 0; i < 7; i++) { // 로또번호 7개 입력...하구
			arr[i] = scan.nextInt();
		}
		// 지혜번호 6번 입력 for 쓰공..흠..이게맞누
		for (int i = 0; i < 6; i++) {
			a = scan.nextInt();
			for (int j = 0; j < 7; j++) {
				if (arr[j] == a) { // 로또번호
					if (j == 6)
						bun++; // 마지막로또번호 주희번호 에다가 보너스카운트+1하긔
					else
						c++; // 아니면 맞은 카운트+1
				}

			}
		} // 당첨 조건 출력
		if (c <= 2)
			s = "0";
		else if (c == 3)
			s = "5";
		else if (c == 4)
			s = "4";
		else if (c == 5 && bun == 0)
			s = "3";
		else if (c == 5 && bun == 1)
			s = "2";
		else if (c == 6)
			s = "1";
		System.out.printf("" + s);

		scan.close();
	}

}
