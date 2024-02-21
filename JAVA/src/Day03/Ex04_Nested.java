package Day03;

import java.util.Scanner;

public class Ex04_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// **중첩 if문 권장하지 않는다.
		//정보처리기사 자격증 학격기준
		// 4학년, 60점 이상 - 합격
		
		System.out.print("학년 : ");
		int year = sc.nextInt();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if ( year == 4 && score >= 60 ) {
			System.out.println("합격!");
		}else if ( year == 4 ){
			System.out.println("불합격!");
		}else {
			System.out.println("응시자격 요건에 해당되지 않습니다.");
		}
	}
}
