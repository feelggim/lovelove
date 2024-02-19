package Day12.Ex01_Object;


public Student(int i, String string) {

/**
 * Object 클래스 의equals () 메소드 활용
 */


class Student {
	int stuentId;
	String studentName;
	public Student(int stuentId, String string,studentName);
	
	@Override
	public String toString() {
		return "Student [stuentId=" + stuentId + ", studentName=" + studentName + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	//eausls() 를 오버라이딩
	// alt+쉬프트+s,v
	@Override
	public boolean equals(Object obj) {
		//두 객체가 의미상으로 일치하는지 여부를 true false 반환
		if (this == obj)
			return true;
		
		
		// null 체크 - 비교 대상이 null 인경우 비교 자체가 불가
		// * NullPointerException 발생가능
		if(obj == null) {
			return false;
		}
		
		
		//학번과 학생명이 모두 일치하는 경우
		Student student = (Student) obj;			//다운 캐스팅
		if(this.stuentId == student.stuentId && this.studentName.equals(student.studentName))
			return true;
		
	
		return super.equals(obj);
		
	}
	
	
	
}
public class ObjectEquals {

	public static void main(String[] args) {
		Student student = new Student (1001,"김조은");
		Student student2 = student;
		Student student3 = new Student (1001,"김조은");
		
		if (student == student2) {
			System.out.println("student 와 student2의 주소 레퍼런스가 같습니다.");
		} else {
			System.out.println("student 와 student2 의 주소 레퍼런스가 같습니다.");

		}
		System.out.println("========================");
		
		if (student.equals(student2)) {
			System.out.println("student와 student2는같습니다.");
			
		} else {
			System.out.println("student와 student2는 다릅니다.");

		}
		System.out.println("========================");
		
		//=======================================================
		
		//학생 1과 학생3의 레퍼런스 비교
		if (student == student3) {
			System.out.println("student 와 student2의 주소 레퍼런스가 같습니다.");
		} else {
			System.out.println("student 와 student2 의 주소 레퍼런스가 같습니다.");

		}
		System.out.println("========================");
		
		// 학생 1과 학생3의 인스턴스 비교
		if (student.equals(student3)) {
			System.out.println("student와 student2는같습니다.");
			
		} else {
			System.out.println("student와 student2는 다릅니다.");

		}
		System.out.println("========================");
		
		
		
	}

}
}

