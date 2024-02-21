package Day03;

import java.util.Iterator;

public class Ex14_GugAll {
	
	public static void main(String[] args) {
		
		// (단) x (1~9)
		// 단에 대한 반복 	: 1~9
		// 각 단의 곱    	: 1~9
		
		//중첩 반복문
		// A X B
		// i : 단(A)
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9 ; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
				System.out.println("\t");
			}
			System.err.println();
			
		}
	}

}
