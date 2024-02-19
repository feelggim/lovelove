package Day12.Ex01_Object;


class piont {
	int x,y;
	piont(int x ,int y){
		this.x = x;
		this.y = y;
		
	}
	
	
}

/**
 *  clone 메소드를 사용하려면 Clonable 인터페이스를 구현한다.
 * 
 * 
 */

class Circle implements Clonable{



	Piont piont;			//중심점
	int radius;				//반지금
	
	Circle(int x ,int y,int radius){
		this.radius = radius;
		this.piont =new piont(x,y);

	
	
}

	// clone 메소드 오버라이딩
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

public static class ObjectClone {

	public static void main(String[] args) {
		Circle circle = new Circle (10,20,5);
		Circle copyCircle = circle.colne();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		
		// * clone () 메소드로 객체를 복제 하면, 같은 객체 정보를 가지는 새로운 인스턴스를 생성
		if( circle.equals(copyCircle) ) {
			System.out.println("circle 과 copyCircle 은 같은 객체입니다.");
		}
		
		// System.identityHashCode(객체)  : 객체의 해시코드를 반환
		System.out.println( System.identityHashCode(circle) );
		System.out.println( System.identityHashCode(copyCircle) );
		
		
	}

}
