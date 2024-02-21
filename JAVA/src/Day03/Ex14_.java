package Day03;

import java.util.Iterator;
import java.util.Scanner;

public class Ex14_ {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(input + " * " + i + " = " + (input * i));
		}
	}

}
