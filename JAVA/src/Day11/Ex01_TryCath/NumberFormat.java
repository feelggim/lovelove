package Day11.Ex01_TryCath;

/*
 * - NumberFormatException
 * 숫자 형식이 아닌 숫자를 문자로 변형 할려고 할때 발생하는 오류
 *  : 문자열 숫자 "10" 가 아닌 문자열을 숫자타입으로 변환 시 발생하는 예외 상황
 */

public class NumberFormat {

	public static void main(String[] args) {
		
		String strNum = "10";
		int num = 10;
		
		System.out.println("10+20 =" + (strNum+20));
		System.out.println("10+20 =" + (num+20));
		
		String numberString = "10";
		String numberAndString = "A10";
		
		int num1 = Integer.parseInt (numberString);
		System.out.println("numberString + 5 ="+(numberString+5));
		
		int num2 =0;
		
		//예외 메세지 : java.lang.NumberFormatException: For input string: "A10"
		//예외 상황 : 문자열 숫자가 아닌 문자열을 숫자로 변환 할 수 없기 때문에 예외 발생
		
		
		try {
			
			num2 = Integer.parseInt (numberAndString);
		} catch (NumberFormatException e) {
			System.err.println("문자열숫자가 아닌 문자열은 숫자타입으로 변환 할 수 없습니다.");
		}
		System.out.println("num1 +10 = "+(num1+10));
		System.out.println("num2 : "+num2 );
		
		
	}

}
