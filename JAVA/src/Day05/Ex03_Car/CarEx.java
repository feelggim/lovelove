package Day05.Ex03_Car;

import Day05.Ex01_Student.Student;

public class CarEx {
	public static void main(String[] args) {

		// 객체 생성
		// - 클래스 타입 객체명
		Car car = new Car();
		car.moedl = "볼보";
		// car.speed = 200;
		// private 으로 지정한 변수는 외부에서 접근 불가능
		car.setSpeed(200);
		System.out.println("model: " + car.getMoedl());
		System.out.println("speed: " + car.getSpeed());

		car.setSpeed(-50);
		System.out.println("speed: " + car.getSpeed());

		car.setSpeed(400);
		System.out.println("speed: " + car.getSpeed());

		car.setSpeed(200);
		System.out.println("speed: " + car.getSpeed());

	}

}
