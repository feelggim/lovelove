package Day09.Ex02computer;

public abstract class Computar {

	// 추상 메소드를 정의하려면 abstract 키워드를 붙여준다
	// 추상 메소드를 정의하려면 클래스도 추상 클래스로 정의해야한다.

	public abstract void display();
	public abstract void typing();

	public void on() {
		System.out.println("전원을 켭니다.");
	}

	public void off() {
		System.out.println("전원을 끕니다.");
	}

}
