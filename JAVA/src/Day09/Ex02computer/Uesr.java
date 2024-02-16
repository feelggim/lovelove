package Day09.Ex02computer;

public class Uesr {

	public static void main(String[] args) {
		Computar computer = new DsekTop();
		// Computar computer2 = new LapTop()
		// 추상 클래스는 객체로 생성 할 수 없다.
		
		Computar computer2 = new MacBook();
		LapTop laptop = new MacBook();
		MacBook macBook = new MacBook();
		
		
		computer.on();
		computer.toString();
		computer.off();
		computer.display();
		System.out.println();
		
		computer2.on();
		computer2.toString();
		computer2.off();
		computer2.display();
		System.out.println();
		
		laptop.on();
		laptop.toString();
		laptop.off();
		laptop.display();
		System.out.println();
		
		macBook.on();
		macBook.toString();
		macBook.off();
		macBook.display();
		System.out.println();
	}

}
