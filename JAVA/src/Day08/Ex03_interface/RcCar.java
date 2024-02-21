package Day08.Ex03_interface;

// 인터페이스를 구현하는 키워드 : implements
public class RcCar implements RemoteControl {
	
	int speed;
	
	@Override
	public void turnOn() {
		System.out.println("RC카 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("RC카 전원을 켭니다.");
		
	}

	@Override
	public void setSpeed(int speed) {
		//최대 속력 이상을 넘지 못하게 지정
		if ( speed > RemoteControl.MAX_SPEED){
			this.speed = RemoteControl.MAX_SPEED;
		}else if (speed < RemoteControl.MIN_SPEED) {
			this.speed = RemoteControl.MIN_SPEED;
		}else {
			this.speed = speed;
		}
		System.out.println("현재 속도 : " + this.speed);
		
	}
	
	

	

}
