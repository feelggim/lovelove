package Day05.Ex03_Car;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		Car car2 = new Car("제네시스", 300);
		
		
		car.model = "볼보";
		
		//Speed(200);
		// private 으로 지정한 변수는 외부에서 접근 불가능
		car.setSpeed(200);
		System.out.println("model : " + car.getModel());
		System.out.println("speed : " + car.getSpeed());
		
		
		car.setSpeed(-50);
		System.out.println("speed : " + car.getSpeed());
		car.setSpeed(400);
		System.out.println("speed : " + car.getSpeed());
		car.setSpeed(200);
		System.out.println("speed : " + car.getSpeed());
		
	}
}
