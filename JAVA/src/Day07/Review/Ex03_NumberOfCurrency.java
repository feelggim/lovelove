package Day07.Review;

import java.util.Scanner;

/* 
 * 더조은컴퓨터아카데미에서 김조은 대리를 출장보낸다.
 * 이 때, 출장비를 다음과 같이 지급한다.
 * 출장비 : 537620
 * 50000		: 10개
 * 10000		: 3개
 * 5000			: 1개
 * 1000			: 2개
 * 500			: 1개
 * 100			: 1개
 * 50			: 0개
 * 10			: 2개
 * 5			: 0개
 * 1			: 1개
 * 위와 같이 입력하면,
 * 큰 화폐단위부터 계산하여, 
 * 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 */

public class Ex03_NumberOfCurrency {
	
	public static void main(String[] args) {
		
		//필요한 변수 : 입력금액, 화폐매수, 화폐단위
		int input, count, money = 50000;
		
		// 입력금액입력
		System.out.print("출장비 : ");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		boolean sw = true;
		
		while (money >= 1) {
			//화폐 매수계산
			count = input / money;
			System.out.println(money + "\t : " + count + " 개");
			
			// 잔액 계산
			input = input % money;
			
			if( sw ) {
				money = money / 5;
			}else {
				money = money / 2;
				sw = !sw;
			}
			
		}
	}
}


