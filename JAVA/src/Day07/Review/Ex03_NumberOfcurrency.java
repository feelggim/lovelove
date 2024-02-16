package Day07.Review;

import java.util.Scanner;

/**
 * 더조은컴퓨터아카데미에서 김조은 대리를 출장 보낸다. 이 때, 출장비를 다음과 같이 지급한다. 출장비 :537620 50000 : 10개
 * 10000 : 3개 5000 : 1개 1000 : 2개 500 : 1개 100 : 1개 50 : 0개 10 : 2개 5 : 0개 1 :
 * 1개 위와 같이 입력하면, 큰 화폐단위부터 계산하여,화폐단위별로 화폐 매수를 출력 하는 프로그램을 작성해보세여
 */

public class Ex03_NumberOfcurrency {
// 1. 출장비 입력 한다. 537620

// 2. 입력금액 입력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		Boolean sw = true;
		int input count,money,money = 5000;
		while (money >=1) {
// 3.화폐매수 계산
		count = input / money;
		System.out.println(money +"\t:" + count + "개");

// ㄴ3-1 화폐매수 계산수식

// ㄴ3-2.잔액 계산
		input = input - (money * count);

// ㄴ3-3.화폐 단위 변환
		if (sw)
			money = money / 5;
		else
			money = money / 2;
		sw = !sw;
	}

}
