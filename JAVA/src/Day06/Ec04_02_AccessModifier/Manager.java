package Day06.Ec04_02_AccessModifier;
import Day06.Ec04_02_AccessModifier.Student;

//------------------필기 덜함----------------------//
public class Manager {

	 	Student static void main (String[] args) {
				Student student = new Student();
				student.defaultSetting();
				System.out.println("name : "+ student.name );
				System.out.println("age : "+ student.name);
				//Manager 에서 sttdent 의 defult 접근지정자 변수인 heigth 를 접근 할 수 없는이유
				//- 같은 패키지에 있지만, 실질적으로 height d를 선언한 곳은
				// 다른 패키지인 Person 에서 선언을 했기 대문에 접근 불가
				//* 선언한 클래스를 기준으로 접근지정자가 접용된다.
				System.out.println("name : "+ student.name);
				System.out.println("name : "+ student.name);
				System.out.println("name : "+ student.name);
				System.out.println("name : "+ student.name);
				System.out.println();
				
		Person person = new Person("김조은",20,170,60);
		System.out.println("name : "+ student.name );
		System.out.println("name : "+ student.name);
		System.out.println("name : "+ student.name);
		System.out.println("name : "+ student.name);
		System.out.println("name : "+ student.name);
		System.out.println("name : "+ student.name);
		System.out.println();
		
//------------------------필기 덜함------------------------//
			}
		}

