package Day11.Ex02_UpDownCasting;

import Day06.Ec04_01_AccessModifier.Person;
import Day06.Ec04_02_AccessModifier.Student;

public class DownCasting {

	public static void main(String[] args) {
		//다운 캐스팅 (강제 형 변환
		// 전제 조건 : 업캐스팅
		// - 다운 캐스팅은 업 캐스팅된 부모 객체를 자식 객체로 변환하는것
		// - 업캐스팅 		: (부모) <- (자식)
		// - 다운캐스팅 	: (자식) <- (무모)
		char[] student = null;
		
		//업캐스팅
		Person person = new Student ("김조은",20,1,"컴퓨터공학과");
//		Person person = new Student ("김조은",20,);
		
		
		System.out.println(person);
		System.out.println(person.work());
		
		System.out.println(student);
		System.out.println(student.length);
		
		System.out.println("grade: " + Student.grade );
		System.out.println("major: " + Student.major );
		
		
	}

}
