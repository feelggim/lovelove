package Day04;

import java.util.Iterator;
import java.util.Scanner;

public class Ex03_Min {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int min = Integer.MAX_VALUE;
		
		//입력과 최솟값 비교를 동시에 할 수도 있다.
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(" 최솟값 : " + min);
		
		
	}

}
