package Day03;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex12_For {

	public static void main(String[] args) {
		//for ( 1초기식 ; 2조건식 ; 4증감식 ) { 3실행문;}
		// - 실행순서 : 1 → 반복( 2 → 3 → 4 )
		
		
		 
		// 1. 1~10까지의 정수를 출력하시오.
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		// 2. 50~100까지의 정수를 출력하시오.
		for (int i = 50; i <= 100; i++) {
		System.out.println(i + " ");
		}
		System.out.println();
		
		// 3. 1~20까지의 정수중, 짝수만 출력하시오.	
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
			 System.out.print(i + " ");
			}	
		}
		
				
		// 4. 1~20까지의 정수중, 홀수만 출력하시오.		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
			
			 System.out.println(i + " ");
			}
			 i++;
		}
		
						
		
	}
}
