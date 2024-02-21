package Day06.Ex03_passingArgument;

import Day05.Class.Pikachu;

public class CallByReference {
	
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Pikachu pikachu = new Pikachu();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1);
			
		}
		System.out.println("------ main() 메소드 ------");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(pikachu);
		
		// 래퍼런스에 의한 호출 : Call By Reference
		// - 참조 자료형을 전달하는 방식
		setArr( arr );
		setObject ( pikachu );
		
		System.err.println("----- set**() 메소드 호출 후 ------");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(pikachu);
	}

	private static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) * 10;
			
		}
		System.out.println("----- setArr() 메소드 -----");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	private static void setObject(Pikachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "에스퍼";
		System.out.println("----- set Object() 메소드 -----");
		System.out.println(pikachu);
		System.out.println();
	}


}
