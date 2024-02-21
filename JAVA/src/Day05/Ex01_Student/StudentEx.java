package Day05.Ex01_Student;

public class StudentEx {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		
		
		// student 의 변수에 접근하여, neme, age, stuNm, major 값을지정해보세요.
		student.name = "김조은";
		student.age= 42;
		student.stdNm = "8760518";
		student.major = "컴퓨터 공학";
		
		int scores[] = {100, 80, 90, 50, 75}; // 학생1의 성적
		
		System.out.println("##### 학생 1 #####");
		System.out.println("학생 1 - 이름 : " + student.name);
		System.out.println("학생 1 - 나이 : " + student.age);
		System.out.println("학생 1 - 학번 : " + student.stdNm);
		System.out.println("학생 1 - 전공 : " + student.major);
		student.study("자바 프로그래밍");
		System.out.println("학생 1 - 중간고사 점수 : " + student.getAverage(100, 90));
		System.out.println("학생 1 - 기말고사 점수 : " + student.getAverage(100, 85, 70));
		System.out.println("학생 1 - 최종 점수 : " + student.getAverage(scores));
		
		
		Student student2 = new Student("백승헌", 20, "T2020012", "영어영문학과");
		int scores2[] = {55, 80, 60, 35, 90};
		
		System.out.println("##### 학생 2 #####");
		System.out.println("학생 2 - 이름 : " + student2.name);
		System.out.println("학생 2 - 나이 : " + student2.age);
		System.out.println("학생 2 - 학번 : " + student2.stdNm);
		System.out.println("학생 2 - 전공 : " + student2.major);
		student.study("음운론");
		System.out.println("학생 2 - 중간고사 점수 : " + student2.getAverage(100, 90));
		System.out.println("학생 2 - 기말고사 점수 : " + student2.getAverage(100, 85, 70));
		System.out.println("학생 2 - 최종 점수 : " + student2.getAverage(scores2));
		
		
	}
}
