package Day12.Ex02_Wrapper;

public class IntegerEx {

	public static void main(String[] args) {
		// int ->Integer
		//: 정수타입인int 기본 타입을 객체화한 클래스
		
		int a =10 ;
		Integer A = 100;
		//* 주요 메소드 
		// (문자열)-->(정수)
		// (정수) -->(문자열)
		// (정수) -->(다른타입)
		
		System.out.println(Integer.parseInt("28")+2);	//문자열을 정수로 변환할때 
		System.out.println(Integer.toString(28)+2);	 	//정수 -> 문자열
		System.out.println(A.doubleValue()+2.5);		//정수 -> 실수
		System.out.println(Integer.toBinaryString(28));	//10진수를 2진법 문자열로 변환
		System.out.println(Integer.bitCount(28));		//이진수 1비트 개수
		
		
		// deprecated?
		// :더이상 사용을 권장하지 않는 문법
		//Integer i =new Integer(10);
		//*이걸 Autu Boxing 이라부름
		//자바 5버전 부터는 객체로 생성하여 사용하지 않아도 자동으로 객체로 감싸준다
		Integer i = 10;
		int value = i.intValue();
		System.out.println("객체로 생성한 Integer :"+i);
		System.out.println("기본타입int :"+value);
	}

}
