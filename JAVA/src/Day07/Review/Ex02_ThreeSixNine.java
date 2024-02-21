package Day07.Review;

import java.util.Iterator;

public class Ex02_ThreeSixNine {
	
	public static void main(String[] args) {
		// 정수 1~100 까지의 수를 반복하여 출력하면서,,
		// 해당 수가 3 또는 6 또는 9가 될 때
		// 369의 개수 만큼 "*" 을 출력하는 프로그램 작성하시오.
		// ex) 3  -->  "*"
		
		//1. 정수를 1~100까지 출력
		//2. 해당 수가 369가 몇개인지 판단
		//3. 그 갯수만큼 출력한다
		
		for (int i = 1; i <= 100; i++) {
			//십의자리 수 : 해당 수(i) / 10 (정수 부분만)
			int ten = i / 10;
			//일의자리 수 : 해당 수(i) % 10
			int one = i % 10;
			
			boolean ten369 = (ten != 0) && (ten % 3 == 0);
			//boolean one369 = one == 3 || one == 6 || one == 9;
			boolean one369 = (one != 0) && (one % 3 == 0);
			//boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			
			if ( ten369 && one369 ) {
				System.out.print("**");
				System.out.println();
			} else if (ten369 || one369){
				System.out.print("*");
			} else {
				System.out.println(i);
			}
		}
		
	}

}
