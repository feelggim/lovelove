package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {
	
	public static void main(String[] args) {
		// 학생의 성적을 입력받고, 성적에 따라 학점을 출력하시오.
		// 90점이상, A
		// 80점이상, B
		// 70점이상, C
		// 60점이상, D
		// 60점미만, F
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// 조건을 만족할 때, 실행할 실행문이 1문장이면 {} 생략가능
		char grade = 'A';
		if (90 <= score && score <= 100)	grade = 'A';
		if (80 <= score && score < 90) 		grade = 'B';
		if (70 <= score && score < 80) 		grade = 'C';
		if (60 <= score && score < 70)		grade = 'D';          
		if (60 > score && score >= 0)		grade = 'F';
			System.out.println("학점 : " + grade);
		
		// if~else if~else
		if (90 <= score && score <= 100) {
			grade = 'A';
		}else if(80 <= score) {
			grade = 'B';
		}else if (70 <= score) {
			grade = 'C';
		}else if (60 <= score) {
			grade = 'D';
		}else {
			grade = 'F';
		}System.out.println("학점 : " + grade);
		sc.close();	
	}
		
}

