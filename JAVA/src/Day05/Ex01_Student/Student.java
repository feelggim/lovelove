package Day05.Ex01_Student;

public class Student {

	// 학생의 속성 : 이름, 나이, 학번, 전공
	// 학생의 행동 : 공부하기, 성적 평균 구하기
	
	
	//변수
	String name;
	int age;
	String stdNm;
	String major;
	
	// 생성자
	public Student() {
		this("이름없음",1,"0000000","없음");
	}
	
	
	public Student(String name, int age, String stdNm, String major) {
		this.name = name;
		this.age = age;
		this.stdNm = stdNm;
		this.major = major;
	}

	
	

	//메소드
	// - 공부하기
	public void study(String suject) {
		System.out.println(suject + "(을/를) 공부합니다.");
		// void : 반환타입 없음을 의미함 -> return 을 생략해도 된다.
	}
	// - 성적 평균 구하기
	public double getAverage(int score1, int score2) {
		double average = 0.0;
		// 평균 = 합계 / 개수
		average = (score1 + score2) / 2.0;
		return average;
	}
	// 메소드 오버로딩
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		// 평균 = 합계 / 개수
		average = (score1 + score2 + score3) / 3.0;
		return average;
	}
	public double getAverage(int[] scores) {
		double average = 0.0;
		int sum = 0;
		for (int i : scores) {
			sum += i;
		}
			//평균
			// - 평균을 구해보세요
		average = (double)sum / scores.length;
			return average;
		
		
	}
}
