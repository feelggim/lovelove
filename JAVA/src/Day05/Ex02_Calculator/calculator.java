package Day05.Ex02_Calculator;

public class calculator {

	/**
	 * 계산기 -피연산자를 2개로 하는 계산기 -기능
	 * 
	 * 1.덧셈 :정수 2개 덧셈 2.뺄셈 :정수 인자1 - 인자2 연산을 하는 밸셈 3.곱셈 :실수 2개 곱셈 4.나눗셈 :실수 인자1 /
	 * 인자2 연산을 하는 나눗셈 5.나머지 :실수 인자1 % 인자2 연산을 하는 나머지 연산 6.합계 :배열을 매개변수로 전달받아, 모든 요소의
	 * 합을 구함 7.평균 : 배열을 매개변수로 전달 받아 모든 요소의 평균을 구함
	 * 
	 * *매소드명 : Plus, minus, multuple, divide, remain, sum, avg
	 * 
	 */

	// 덧셈

	// 변수
	int a = 0;
	int b = 0;

	// *******************

	// 1.덧샘
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}

	// 2.뺄셈
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	// 3.곱셈 : 실수 두개 곱셈
	public double multuple(double a, double b) {
		double result =a * b;
		return result;
	}

	// 4.나눗셈
	public double divide(double a, double b) {
		double result = a / b;
		return result;
	}

	// 5.나머지
	public double remain(double a, double b) {
		double result = a % b;
		return result;
	}

	// 6.합계
	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// sum = sum +arr [i]
			sum += arr[i];
		}
		return sum;
	}

	// 7.평균: for이치문
	public double avg(int[] arr) {
		int sum = sum(arr);
		double avg = 0.0;
		// 메소드 호출 : 메소드명 (전달인자1, 전달인자2);
			// sum +=i;

		avg = (double) sum / arr.length;
		return avg;
	}

}
