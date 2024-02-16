package Day10.Ex01_Nastedclass;

/**
 * 중첩 클래스
 */
public class X {

	// 인스턴스 이너 클래스
	// *인스턴스 인어 클래스 안에서 Static 멤버 사용불가

	class Y {
		int value;

		Y() {
			System.out.println("X의 Y 객체 생성");

		}

		void method1() {

			System.out.println("Y의 매소드객체 생성");
		}

	}

	// Static 이너 클래스
	static class Z {

		int value1;
		static int velue2;

		Z() {
			System.out.println("X의 Z객체 생성");

		}

		void method1() {
			System.out.println("Z의 메소드");

		}

		static void method2() {

			System.out.println("Z의 static메소드");

		}

	}

	// 로컬 클래스
	// : 메소드 안에 정의한 클래스로
	// - 메소드가 실행될 때만 사용되는 이너 클래스

	void method() {
		// 로컬 클래스
		class L {
			int value1;
			// int static value2;
			public int valuel;

			L() {

				System.out.println("L객체 생성");
			}

			void method1() {

				System.out.println("L의 메소드");

			}

		}

		L l = new L();
		l.value1 = 10;
		System.out.println("로컬 클래스 L의 변수:" + l.valuel);
		l.method1();
	}
}