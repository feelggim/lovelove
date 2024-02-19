package Day12.Ex02_Wrapper;

public class CharacterEx {

	public static void main(String[] args) {
		
		// charcter 
		//char -> charcter
		//: 문자 타입인 char 기본 타입을 객체화한 클래스
		//* 주요 메소드
		//- 대소문자 변환
		//- 문자/숫자 인지 여부 확인
		
		char a = 'a';
		char A = 'A';
		
		System.out.println(Character.isUpperCase(a) );
		System.out.println(Character.isLowerCase(A) );
		
		char c1 = '5';
		char c2 = 'x';
		
		if (Character.isDefined(c1)) {
			System.out.println(c1+"은는 숫자입니다.");
		}
		
		if (Character.isAlphabetic(c2)) {
			System.out.println(c2+"은는 영문자입니다.");
			int count = 0;
			String str = "Hello The joune Acdemy";
			char[] arr = str.toCharArray();
			for (int i = 0; i < arr.length; i++) {
					if (Character.isUpperCase(arr[i])) {
						count++;
					

					}
				
			}
			
			System.out.println(str+ "-대문자 개수 : "+ count );
		} 

		}
		
		
	}


