package Day07.Review;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex_Lotto {

	public static void main(String[] args) {
		double random = Math.random();
		System.out.println(random);

		// 1~6사이의 정수 :주사위
		// Math.random : 0.XXXXX~0.9XXXXX
		// Math.random()*10 : X.XXXX~9.XXXX
		// (int) (Math.random() *10) :0~9 (10개)
		// (int) (Math.random() *6) :0~5 (5개)
		// (int) (Math.random() *6)+1 :1~6 (6개)

		int dice = (int) (Math.random() * 6) + 1;
		System.out.println("주사위 : " + dice);

		// 1~45 사이의 정수
		int lotto = (int) ((Math.random()) * 45 + 1);
		System.out.println("로또랜덤 번호 : " + lotto);

		// (공식) : (int) (Math.random()*[개수])+[시작숫자]

		// 1~20 사이의 랜덤수
		int rand = (int) (Math.random() * 20) + 1;
		System.out.println("\"1~20\" 뭐가나올까요 : " + rand);

		// -20 ~20 사이의 랜덤수
		int rand2 = (int) (Math.random() * 41) - 20;
		System.out.println("\"-20부터 +20까진\" 뭐가 나올까요 : " + rand2);

		// 1~45 사이의 랜덤수 6개를 배열의 중복없이 오름차순으로 저장하시오.
		// TreeSet을 사용하여 중복을 피하고 자동으로 오름차순으로 정렬

//------------------------------Set 방법----------------------------	
		Set<Integer> numbers = new TreeSet<>();

        // 랜덤한 숫자 6개를 Set에 추가
        while (numbers.size() < 6) {
        // 1부터 45까지의 랜덤한 숫자
        int number = (int) (Math.random() * 45) + 1; 
            numbers.add(number);
        }

        // Set을 배열로 변환
        Integer[] rbs = numbers.toArray(new Integer[0]);

        // 결과 출력
        for (int number : rbs) {
            System.out.print(number + " ");
        }
	}
}
//----------------------------------------------------------------		
////		 int i = 0;
//		int[] arr = new int[6];
//		int count = 0;
//		while (count < 6) {
////-----------1부터 45까지의 랜덤수 생성함
//			int number = (int) (Math.random() * 45) + 1;
//			boolean Ex = false;
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = 0; j < arr.length; j++) {
//				}
//			}
////-----------중복 체크
//			for (int i = 0; i < count; i++) {
//				if (arr[i] == number) {
//					Ex = true;
//					break;
//				}
//			}
//			if (!Ex) {
//				arr[count] = number;
//				count++;
//			}
//		}
////-----------오름차순 정렬하기
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i+1 ; j < arr.length; j++) {
//					if (arr[i] > arr[j]) {
//						int asdasdas = arr[i];
//						arr[i] = arr[j];
//						arr[j] = asdasdas; 		
//						
//					}
//			}
//		}
//			ㅠㅠㅠㅠ머르게씀
//		
////-----------배열 출력
//		System.out.print("[");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//			if (i < arr.length - 1) {
//				System.out.print(", ");
//			}
//		}
//		System.out.println("]");
//	}

// 1~45중복없이 오름차순대로 정리해서 출력하시오
