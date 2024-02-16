package Day05.Ex03_Car;

public class Car {
	// 모델명, 속도
	String moedl;
	private int speed;
	// 생성자

	// -기본 생성자
	public Car() {
		super();
	}

	// / model 매개변수 생성자
	public Car(String moedl) {
		super();
		this.moedl = moedl;
	}

	// - 전체 매개변수 생성자

	public Car(String moedl, int speed) {
		super();
		this.moedl = moedl;
		this.speed = speed;
	}

	// getter : 변수의 값을 가져오는 메소드
	// setter : 변수의 값을 지정하는 메소드
	// 게터/세터/ :이름 : getxxx(), setxxx(값)
	// ex) getName(), setNama("김조은")
	// - get/set 뒤에 변수명을 첫글자를 대문자로 해서 정의하는 것이 관례
	// *getter/setter 메소드 자동완성 단축키 alt+shift+s+r

	public String getMoedl() {
		return moedl;
	}

	public void setMoedl(String moedl) {
		this.moedl = moedl;
	}

	public int getSpeed() {
		if (speed < 0) {
			speed = 0;
			System.out.println("속도는 음수불가능");
		}
		if (speed >= 300) {
			speed = 300;
			System.out.println("최대 속도는 300km/h입니다.");
		}
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
