package Day04;

// enum 열거 타입정의
//- 열거타입 이넘 파일로도 정의 할 수 있고,
//- 클래스 파일 내에서 정의 할 수도있다.

enum Test {
	A, B, C, D, E, F
};

public class Ex08_enum {

	public static void main(String[] args) {
		// ENUM열거 타입
		// - 요소들을 명명한 값으로 집합을 이루는 자료형
		//1.enum을 비교할 때는 값뿐만 아니라 타입도 비교한다.
		//2.enum의 상수값이 재정의되어도 다시 컴파일할 필요가 없다.
		
		// values() : 열거타입의 모든 요소를 배열로 변환
		Rainbow[] rainnow =Rainbow.values();
		
		for(Rainbow color : rainnow){
			System.out.println(color+ " ");
		}
		System.out.println();
		// ValueOf() 	: 전단될 문자열과 일치하는 열거타입 상수를 변환
		Rainbow G = Rainbow.valueOf("PURPLE");
		System.out.println("G :"+G);
		
		// ordinal() 	:해당 열거체 상수가 정의된 순서(index)를 반환
		int index = G.ordinal();
		System.out.println("PURPLE 의 index :" + index);
	}

}
