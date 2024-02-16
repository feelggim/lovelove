package Day10.Ex02_AnonyMousObJect;

public class RemoteControl {

	public static void main(String[] args) {
		//인터페이스를 구현한 클래스 객체를 만드는 법
		// - 인터페이스 타입 객체명 = new 구현클래스 ();
		// RC 카
		RemoteControl carRc = new RcCar();
		carRc.turnOn();			// 시동 걸기 
		
		// 디폴트 메소드는 구현하지 않아도 (오버라이딩) 바로 호출 가능
		carRc.setspeed(true);   //주행모드
		carRc.turnoff(20);		//가속
		carRc.parking(true);	//주차
		carRc.turnoff();		//시동 끄기
		System.out.println();
		
		// static 메소드는 객체 생성 없이도 바로 호출이 가능
		RemoteControl.changeBattery();	//배터리 교체

		//드론
		RemoteControl droneRc = new Drone ();
		droneRc.turnON();
		droneRc.parking(false);
		droneRc.setspeed();
		droneRc.parking(true);
		droneRc.turnoff();
		System.out.println();
	}

}
