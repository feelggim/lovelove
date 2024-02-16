package Day05.Ex01_Student;

public class StuentEx {

	public static void main(String[] args) {

		// 객체 생성
		// - 클래스타입 객체명 = new 클래스명();
		Student student = new Student();

		// Student 의 변수에 접급하여,name, age, stNo, major 값을 지정해보세요.
		student.name = "김조은";
		student.age = 20;
		student.stdNo = "T100201";
		student.major = "컴퓨터공학과";
		int scores[] = { 100, 80, 90, 50, 75 };

		System.out.println("#####학생1#####");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 이름 : " + student.age);
		System.out.println("학생1 - 이름 : " + student.stdNo);
		System.out.println("학생1 - 이름 : " + student.major);

		student.study("자바 프로그래밍");
		System.out.println("학생 1 - 중간고사 점수 :" + student.getAverage(100, 90));
		System.out.println("학생 1 - 중간고사 점수 :" + student.getAverage(100, 85, 70));
		System.out.println("학생 1 - 최종점수:" + student.getAverage(scores));

		// 학생 2 (student2) 객체를 생성하면서, 아래와 같이 객체를 초기화 하세요
		// -이름 : 내이름
		// -나이 : 20
		// -학번 : T202012
		// -전공 : 내전공

		Student student2 = new Student("백승헌", 20, "T202012", "영어영문학과");
		System.out.println("#####학생1#####");
		System.out.println("학생2 - 이름 : " + student2.name);
		System.out.println("학생2 - 이름 : " + student2.age);
		System.out.println("학생2 - 이름 : " + student2.stdNo);
		System.out.println("학생2 - 이름 : " + student2.major);
		student.study("음운론");
	}
}
