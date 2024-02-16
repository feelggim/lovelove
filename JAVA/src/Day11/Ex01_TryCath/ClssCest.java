package Day11.Ex01_TryCath;

/**
 * 
 * ---예외 처리 Class casst Exception : 클래스 간의 타입 변환시, 올바르지 않은 변환으로 인해 발생하는 예회 상황 -
 * 업캐스팅이 전제되지 않은 다운 캐스팅을 하는 경우 - 부모 자식의 관계가 아닌 클래스로 캐스팅 하는 경우
 */

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class ClssCest {
	// ( 부모 클래스 ) ( 자식클래스 )
	// Animal <-- Dog,Cat
	// Animal =Cat 으로 업캐스팅한 이후에
	// 다시 Animal 을 Dog 으로 다운캐스팅 할 수 없다.
	// -Cat Dog 로 타입 변환 할 수 없다.

	public static void main(String[] args) {

		Dog dog = new Dog();
		changeToDog(dog); // 가능

		Cat cat = new Cat();
		changeToDog(cat); // 불가능
	}

	public static void changeToDog(Animal animal) {
		// 예외 메세지 java.lang.Class casst Exception
		try {
			Dog dog = (Dog) animal;
		} catch (Exception e) {
			System.err.println("Cat을 Dog로 변환 할 수 없습니다.");

		}
	}

}
