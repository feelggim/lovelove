package Day05.clss;

public class Pikabhu {

	// 클래스 : 객체를 정의하는 설계도
	// 멤버 : 변수, 메소드

	// 변수

	public int energy;
	public String type;

	// 생성자
	// : 객체가 생성될 때, 실행되는 메소드다.
	// -객체의 변수를 초기화 하는 역할을 한다.
	// *생성자의 이름은 클래스명과 동일하다
	// -접근지정자 반환타입 메소드명 (매개변수){}
	// -접근지정자 생성자명 (매개변수) {}
	// **기본 생성자
	// : 매개변수가 없는 생성자

	// 생성자 자동 완성 단축키
	// : alt + Shift + S ,O
	public Pikabhu() {

		this (100,"전기속성");
	}

//	public Pikabhu() {
////		this.energy = 100;
////		this.type = "전기";
//		this(100,"전기");
//		//this() 메소드는 생성자 안에서만 사용해야 하고생성자 안에서 항상 첫문장이여야함.
//	}
//	// 메소드 오버로딩 : 짐을 또 쌓고 쌓는 모습 클래스명은 같지만 매개변수가 다름
//	// 오버로딩의 이점은 다형성을 구현 할 수 있다.
	public Pikabhu(int energy, String type) {
		System.out.println("매개변수가 있는 생성자가 실행됨...");
		this.energy = energy;
		this.type = type;

	}
	// 메소드
	// -접근지정자 반환타입 메소드명 (매개변수){}

	public String aAttack() {
		return "십만볼트";

		// 메소드

	}

	public String bAttack() {
		return "전광석화";

	}

	@Override
	public String toString() {
		return "Pikabhu [energy=" + energy + ", type=" + type + "]";
	}


	
	
}
