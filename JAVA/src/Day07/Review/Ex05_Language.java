package Day07.Review;

public class Ex05_Language {

	
	//1,2,3,4,5
	// java, sql html, css, javascript, dart
	public static void main(String[] args) {
		//배열 선언 및 생성
		int count[] = new int[6];
		for (int i = 0; i < count.length; i++) {
			count[i] = (i + 1);
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
		System.out.println();
		
		//배열 선언 및 초기화
		String language[] = {"java", "sql", "html", "css", "javascript", "dart"};
		
		for (int i = 0; i < language.length; i++) {
			System.out.print(language[i] + " ");
		}
		System.out.println();
		
		for (String lang : language) {
			System.out.print(lang + " ");
		}
		System.out.println();
	}
}