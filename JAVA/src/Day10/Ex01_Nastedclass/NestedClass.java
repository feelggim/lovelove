package Day10.Ex01_Nastedclass;

public class NestedClass {

	public static void main(String[] args) {
		//아우터인 클래스인 A객체 생성
		
		A a = new A();
		a.a = 10;
		a.b = 20;
		System.out.println("A의 a"+a.a);
		System.out.println("A의 b"+a.b);
		a.aMethod();
		
		//이너 클래스인 B객체 생성
		A.B b = a.new B();
		b.x= 30;
		b.y= 40;
		System.out.println("B의 a"+b.x);
		System.out.println("B의 y"+b.y);
		b.bMethod();
		
	}

}
