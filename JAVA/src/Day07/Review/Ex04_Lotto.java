package Day07.Review;

import java.util.Iterator;

public class Ex04_Lotto {
	
	public static void main(String[] args) {
		
		// Math.random() : 0.xxxxx ~ 0.9xxxxx 사이의 난수를 반환하는 메소드
		double random = Math.random();
		System.out.println(random);
		
		//1~6 사이의 정수 : 주사위
		//Math.random()							: 0.xxxxxx ~ 0.9xxxxxx
		//Math.random() * 10					: x.xxxxxx ~ 9.xxxxxx
		//(int) (Math.random() * 10)			: 0 ~ 9 (10개)
		//(int) (Math.random() * 6)				: 0 ~ 5 (6개)
		//(int) (Math.random() * 6) + 1			: 1 ~ 6 (6개)
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println("주사위 : " + dice);
		//1~45 사이의 정수
		int lotto = (int) (Math.random() * 45) + 1;
		System.out.println("로또 랜덤 번호 : " + lotto);
		
		// (공식) : int (int) (Math.random() * 개수) + [시작숫자]
		//1~20 사이의 랜덤수
		int rand = (int) (Math.random() * 20) + 1;
		
		// -20 ~ 20 사이의 랜덤수
		int rand2 = (int) (Math.random() * 41) + - 20;
		System.out.println("-20 ~ 20 : " + rand2);
		
		
		// 1~45 사이의 랜덤수 6개를 배열에 중복없이 오름차순으로 저장하시오.
	
		int[] arr = new int[6];
		int[] count = new int[46];
		//   20 15 19 20 41 30
		int a = 0;
		
		
		int min = Integer.MAX_VALUE;
		
		while(a < 6) {
			int r = (int) (Math.random() * 45) + 1;
			if (count[r] == 0) {
				count[r]++;    // count[20] = 1;
				arr[a] = r;    // a[0] = 20;
				a++;           // a = 1;
			}
			else continue;
			
			
			for (int i = 0; i < arr.length; i++) {	
				for (int j = 0; j < 6 ; j++) {
					if (min < arr[j]) {
						min = arr[j];
						System.out.println(min + " ");
					
				};
			}
		}
			for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
					}
		}
	}
}