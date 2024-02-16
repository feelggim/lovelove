package Day11.Ex01_TryCath;

import java.util.Scanner;

/**
 * 예외 처리 IndexOutOfBound -배열이나 문자열의 index 를 벗어난 예외
 * 
 */

public class IndexOutOfBound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열요소의 개수");

		int N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println("접근할 index:");
		int index = sc.nextInt();
		System.out.println("입력할 값 :");
		int input = sc.nextInt();

		// 예외 메시지가 뭐였고 어떻게 처리 해 줄 건지
		// 예외 상황 : 배열에 index 범위를 초과하여 접근한 경우 발생

		try {
			arr[index] = input;
			System.out.println("arr[" + index + "]" + arr[index]);
			sc.close();

		} catch (Exception e) {

			System.err.println("배열 index 의 범위를 초과하여 접근하였습니다.");
			System.err.println("(0~" + (N - 1) + ")사이의 정수 범위에서 입력해주세요.");
		}

		sc.close();
	}

}
