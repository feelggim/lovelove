package Day05.Class;

public class Jiwoo {

	
	public static void main(String[] args) {
		// 객체 생성
		// - 클래스타입 객체명 = new 클래스명();
		Pikachu pikachu = new Pikachu();
		
		// *.* <--- 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
		//		pikachu.energy = 100;
		//      pikachu.type = "전기";
				
		
		System.out.println("############# 피카츄 #############");
		System.out.println("에너지 : " + pikachu.energy); // class 변수.!
		System.out.println ("타입 : " + pikachu.type);
		System.out.println("공격 a : " + pikachu.aAttack());
		System.out.println("공격 b : " + pikachu.bAttack()); // 매개변수 ()안에 인자를 받아오면 값이 변할 수 있는 변수
		System.out.println();
		
		Pikachu pikachu20 = new Pikachu(150, "진화");
		System.out.println("############# 피카츄 #############");
		System.out.println("에너지 : " + pikachu20.energy); // class 변수.!
		System.out.println ("타입 : " + pikachu20.type);
		System.out.println("공격 a : " + pikachu20.aAttack());
		System.out.println("공격 b : " + pikachu20.bAttack()); // 매개변수 ()안에 인자를 받아오면 값이 변할 수 있는 변수
		System.out.println();
		
		Raicchu raichu= new Raicchu();
		System.out.println("############# 라이츄 #############");
		System.out.println("에너지 : " + raichu.energy); // class 변수.
		System.out.println ("타입 : " + raichu.type);
		System.out.println("공격 a : " + raichu.aAttack());
		System.out.println("공격 b : " + raichu.bAttack()); // 매개변수 ()안에 인자를 받아오면 값이 변할 수 있는 변수
		System.out.println();
		
		Raicchu raichu40= new Raicchu(300, "슈퍼전기");
		System.out.println("############# 라이츄(Lv.40) #############");
		System.out.println("에너지 : " + raichu40.energy); // class 변수.!
		System.out.println ("타입 : " + raichu40.type);
		System.out.println("공격 a : " + raichu40.aAttack());
		System.out.println("공격 b : " + raichu40.bAttack());
		System.out.println("공격 c : " + raichu40.cAttack());
		System.out.println();
		
		
	}
}
