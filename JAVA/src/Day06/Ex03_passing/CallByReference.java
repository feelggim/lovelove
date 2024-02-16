package Day06.Ex03_passing;

import Day05.clss.Pikabhu;

public class CallByReference {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Pikabhu pikachu = new Pikabhu();

		// arr[] : [1][2][3][4][5]

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
		}

		System.out.println("-------main() 메소드 ------");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println(pikachu);

		// 레퍼런스에 의한 호출 : Call Bt Reference
		// -참조 자료형을 전달하는 방식

		setArr(arr);
		setObject(pikachu);
	}

	private static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
		// 10 20 30 40 50
			arr[i] = (i + 1) * 10;
		}
		{
			System.out.println("------- setArr() 메소드 ------");
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private static void setObject(Pikabhu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "에스퍼";
		System.out.println("------- setObject() 메소드 ------");
		System.out.println(pikachu);
		System.out.println();

	}

}
