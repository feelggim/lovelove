package Day05.clss;

// 상속
// -키워드 : 자식 클레스 extends 부모클래스
public class Richu extends Pikabhu {

	// 부모 생성자 그대로 만들기 :alt + shift+ S다음에 C
	public Richu() {
		super(300, "메가전기");
	}

	public Richu(int energy, String type) {
		super(energy, type);
	}

	// 메소드 오버라이딩

	@Override
	public String aAttack() {
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
		
	public String cAttack() {
		return "아이언테일";

	// 부모 클래스의 메소드를 자식 클래스에서 재정의하여
	// 부모 메소드를 무시하고 자식 메소드를 우선하여 실행함.

	// 메소드 오버라이딩
//	public String bAttack() {
//		return "볼트체인지";

		
	}
	
}
