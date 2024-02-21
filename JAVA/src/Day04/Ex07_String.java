package Day04;

public class Ex07_String {
	
	public static void main(String[] args) {
		// String 은 참조 자료형
		// - 문자열 한 글자, 한 글자를 비교 시, equals() 를 사용
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
			
		
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println("a == c : " + (a == c));			// ture
		System.out.println("a == d : " + (a == d));			// false
		System.out.println("문자열 비교 : " + a.equals(d));		// ture
		
		System.out.println("e == f : " + (e==f));			// false
		System.out.println(e.equals(f));					// ture
			
		
	}

}
