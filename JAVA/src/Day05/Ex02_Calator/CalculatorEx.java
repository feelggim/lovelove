package Day05.Ex02_Calator;

import java.util.Scanner;

public class CalculatorEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.print("a : ");
		int num1 = sc.nextInt();
		System.out.print("b : ");
		int num2 = sc.nextInt();
		
		// 덧셈 메소드 호출
		int result1 = cal.plus(num1, num2);
		System.out.println("a + b = " + result1);
		
		
		int result2 = cal.mins(num1, num2);
				System.out.println("a + b = " + result2);
				
			
		System.out.print("x : ");		
		double x = sc.nextDouble();
		System.out.print("y : ");		
		double y = sc.nextDouble();
		
		double result3 = cal.multiple(x, y);
		System.out.println("x * y = " + result3);
		System.out.printf("x * y =  %5.2f\n", result3);
		
		double result4 = cal.divide(x, y);
		System.out.println("x / y = " + result4);
		System.out.printf("x / y =  %5.2f\n", result4);
		//printf("포맷", 변수) : %X.Y(리터럴)
		// - X : 양수 - 크기만큼 칸을 지정하고 오른쪽으로 정렬
		// 		 음수 - 크기만큼 칸을 지정하고 왼쪽으로 정렬
		// - Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
		// * (리터럴) : %d (정수), %f (실수), %s (문자열)
		
		double result5 = cal.remain(x, y);
		System.out.println("x % y = " + result5);
		
		int arr[] = {10,20,30,40,50};
		System.out.println("합계 : " + cal.sum(arr));
		System.out.println("평균 : " + cal.avg(arr));
		sc.close();
		
		
		
	}

}
