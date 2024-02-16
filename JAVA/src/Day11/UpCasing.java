package Day11;

import Day06.Ec04_01_AccessModifier.Person;
import Day06.Ec04_02_AccessModifier.Student;


public class UpCasing {
	public static void main(String[] args) {
		
		Person person = new Student ("김조은",20,1,"장보통신공학");
		
		System.out.println("neme : " + person.name );
		System.out.println("age:" + person.age );
		
		//Person 객체에서는 grade, major 변수 접근불가
		//System.out.println("grade : " + person.grade);
		//System.out.println("grade : " + person.grade);
		
		// 클래스를 업캐스팅 하면,
		// 변수는 부모 클래스에 있는 변수만 접근 가능하고,
		// 메소드는 자식 클래스의 메소드가 우선하여 실행된다.
		
		System.out.println(person);
		System.out.println(person.work());
		
		//바인딩 (binding) 
		// : 프로그램에서 사용되는 요소에 실제 값을 결정 짓는 행위
		// - 정적 바인딩
		// : 컴파일 시간에 결정
		//	 변수 등
		
		// - 동적 바인딩
		// : 실행 시간에 결정
		//	 오버라이딩 등 
		
		
	}
}
