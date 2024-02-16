package Day11;

import java.util.Iterator;
import java.util.Scanner;

public class Multicach {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("두자리의 수인 정수 2개를 입력해용");
			
			try {
				String str1 = sc.nextLine();
				String str2 = sc.nextLine();
				
				char[] char1 = str1.toCharArray();
				char[] char2 = str2.toCharArray();
				
				String[] input1 = new String [char1.length];
				String[] input2 = new String [char2.length];
				
				for (int i = 0; i < char1.length; i++) {
					input1[i] = char1[i] + "";
					
				}
				for (int i = 0; i < char2.length; i++) {
					input2[i] = char2[i] + "";
				}
				
				System.out.println(input1[0] + input1[1]);
				System.out.println(input1[0] + input2[1]);
				
				int value1 = Integer.parseInt(str1);
				int value2 = Integer.parseInt(str2);
				int result = value1 + value2;
				System.out.println(str1+ "+" + str2 +"="+ result);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("접근 할 수 없는 배열 index 범위입니다.(한 자리수 입력한경우)");
			} catch (NegativeArraySizeException e) {
				System.err.println("숫자로 변환할 수 없는 값입니다. (문자를 입력한 경우)");
			}
			 catch (Exception e) {
				 System.out.println("이 외의 알 수 없는 예외 발생");
			}
			
			sc.close();
			
	}
			
			
	}
