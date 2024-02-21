package Day08.Ex03_interface;

public class RemoteControlEx {

	public static void main(String[] args) {
		//인터페이스를 구현한 클래스 객체를 법
		// - 인터페이스 타임 객체명 = new 구현클래스();
		// RC카
		RemoteControl carRc = new RcCar();
		carRc.turnOn();			// 시동걸기
		carRc.parking(false);	// 주행모드
		carRc.setSpeed(20);		// 가속
		carRc.parking(true);	// 주차
		carRc.turnOff();		// 시동 끄기
		System.out.println();
		
		// static 메소드는 객체 생성 없이도 바로 호출이 가능
		RemoteControl.changeBattery();
		
		// 드론
		RemoteControl droneRc = new Drone();
		droneRc.turnOn();
		droneRc.parking(false);
		droneRc.setSpeed(15);
		droneRc.parking(true);
		droneRc.turnOff();
		System.out.println();
	}
}

