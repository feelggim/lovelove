package Day07.Review;

public class Ex_05Language {

	public static void main(String[] args) {
		
		// 1,2,3,4,5
		// java, sal, html, css, javascript, dart
		
		//배열 선언 및 생성
		
		int count[] = new int [6];
		for (int i = 0; i < count.length; i++) {
			count[i] = (i+1);
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]+" ");
		}
		System.out.println();
		
		//배열 선언 및 초기화
		String languagep[ ] = {"Java","sql","html","css","javascript","dar"};
		
		//배열.length : 배열 요소의 개수
		for (int i = 0; i < languagep.length; i++) {
			System.out.println(languagep[i]+" ");
		}
		System.out.println();
		
		//foreach : 배열의 요소의 반복
				for (int i = 0; i < languagep.length; i++) {
					System.out.println(languagep[i]+" ");
				}
				System.out.println();
		}
	}


