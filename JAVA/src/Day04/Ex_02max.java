package Day04;

import java.util.Scanner;

public class Ex_02max {

	public static void main(String[] args) {

		// 첫째 줄에 입력할 개수 n 입력받고,
		// 둘째 줄에 N개의 정수를 공백을 두고 입력 받음
		// N개의 정수 중, 최대값을 출력함
		// (입력예시)
		// 5개의 배열을 만들어서
		// 90 60 70 100 55 점수 입력
		// (출력예시)
		// 최댓값 :100
		/*
		 * (순서도) 1. 정수 하나를 입력 2.입력 받은 정수를 변수 n에 저장(대입) 3.n번 반복 n개의 정수 입력 (변수가5면 5번)
		 * 4.입력받은 n개의 정수를 배열 arr에 저장. 5.배열 arr을 반복하여, 최댓값 변수 max 와 i 번째 배열 요소를 비교한다. 6.두
		 * 요소 중 더 큰 요소를 max 에 대힙한다. 7.반복이 끝나고, 변수 max 를 출력한다.
		 * 
		 */

		// 1. 정수 하나를 입력
		// 2.입력 받은 정수를 변수 n에 저장(대입)
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력 받을 데이터 갯수
		int arr[] = new int[N];
		// 최댓값 선언
		int max = Integer.MIN_VALUE;
		// 3.n번 반복 n개의 정수 입력 (변수가5면 5번)
		// 4.입력받은 n개의 정수를 배열 arr에 저장.
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
			// 5.배열 arr을 반복하여, 최댓값 변수 max 와 i 번째 배열 요소를 비교한다.
			// * 6.두 요소 중 더 큰 요소를 max 에 대힙한다.
		{
	    for (int i = 0; i < arr.length; i++) {
			 if (max < arr[i]) {
					max = arr[i];
				}
			}
			// 7.반복이 끝나고 변수 max 를 출력.
			System.out.println("최댓값:" + max);
			sc.close();
		}

	}

}
