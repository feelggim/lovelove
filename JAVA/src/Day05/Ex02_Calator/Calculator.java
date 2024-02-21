package Day05.Ex02_Calator;


/*
 *  계산기
 *  - 피연산자를 2개로 하는 계산기
 *  - 기능
 *  	1. 덧셈		: 정수 2개 덧셈
 *  	1. 뺄셈		: 정수 2개 인자1 - 인자2 연산을 하는 뺄셈
 *  	1. 곱셈		: 실수 2개 곱셈
 *  	1. 나눗셈		: 실수 2개 나눗셈
 *		5. 나머지 	: 실수 인자1 % 인자2 연산을 하는 나머지 연산  
 *		6. 합계		: 배열을 매개변수로 전달받아, 모든 요소의 합을 구함
 *		7. 평균		: 배열을 매개변수로 전달받아, 모든 요소의 평균을 구함
 *
 *		* 메소드명
 *		: plus, minus, multiple, divide, remain, sum, avg
 */
	
public class Calculator {

	
	public int plus(int a, int b) {
		int sum = a + b;
		return sum;
	}
	public int mins(int a, int b) {
		int min = a - b;	
		return min;
	}
	public double multiple(double a, double b) {
		double mul = a * b;
		return mul;
	}
	public double divide(double a, double b) {
		double div = a / b;
		return div;
	}
	public double remain(double a, double b) {
		double rem = a % b;
		return rem;
	}
	public double sum(int[] number) {
		double sum = 0;
		for (double i : number) {
			sum += i;
		}
		return sum;
	}
	public double avg(int[] number) {
		double sum = sum(number);					//메소드 호출 : 메소드명( 전달인자 1, 전달인자 2 );
		double avg = (double)sum / number.length;
		return avg;
	}
}





