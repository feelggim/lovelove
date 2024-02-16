package Day04;

import java.util.Scanner;;

public class Ex05_arrays {

	public static void main(String[] args) {

		// 2c차원 배열 선언
		//-1차원 : 2  (2행)
		//-2차원 : 3	 (3열)
		int arr[][] = new int [2][3];
	
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		//첫 번째 차원의 배열에 접근할땐 arr.length 를 썻었지만
		//두 번째 차원의 배열에 접근할땐 arr[i].length 를 사용함
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		for (int i =0; i < arr.length; i++) {
			for (int j =0; j < arr.length; i++) {
				System.out.println(arr[i][j]+"");
			}
			System.out.println();
		}
		
		
		// 2차원 배열 선언 및 초기화
			int arr2[][] = {{1,2,3},{4,5,6}};
			
			for (int i =0; i < arr2.length; i++)
				for (int j =0; j < arr2.length; j++) {
				System.out.println(arr2[i][j]+"");
			}
			System.out.println();
		}
	
	}


