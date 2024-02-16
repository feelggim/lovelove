package Day11.Ex01_TryCath;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  예외처리 
 *  -InputMismath Exception
 *  : 입력 시, 자료형이 입력 메소드와 일치하지 않아서 발생하는 예외 상황
 * EX nextint (); 에 대하여 정수를 입력하징 낳고 다른 자료형 문자 등을 입력한 경우
 */
public class InputMismath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		String maenuName = "";

		do {
			System.out.println( " 1.java" );
			System.out.println( " 2.Oracle Db " );
			System.out.println( " 3.HTML " );
			System.out.println( " 4.JAvascript " );
			System.out.println( " 5.종료 " );
			System.out.println( " 입력 : " );

			// 예외 java. utiil.InputMismath
			// 예외 상황 : 숫자 입력 메소드에 문자를 입력한 경우 등

			try {
				menuNo = sc.nextInt(); // 예외 발생 가능성이 있는 문장
			} catch (InputMismatchException e) {
				// TODO: handle exception
				//숫자를 입력하지 않았으면 , 다시 반복해서 입력하도록
				sc.next();		//입력 스트림에서 남아 있는 엔터를 제거 
				System.err.println("0~5번사이의 정수를 입력 해 주세요");
				continue;
			}

			//종료 조건
			
			
			if ( menuNo == 0 )  break;
			
			
			switch ( menuNo ) {
			case 1: maenuName = "Java";					break;
			case 2: maenuName = "Oracle Db";			break;
			case 3: maenuName = "HTML";					break;
			case 4: maenuName = "JAvascript";			break;
			case 5: maenuName = "JAvascript";			break;
				
			}
			
			System.out.println(maenuName + "을/를 공부합니다." );
				
			
		}  while( true );

	sc.close();

 }
}


