package Day01;

import java.util.Scanner;

//import :외부 클래스를 포함시키기
//import :패키지명.클래스명;

//1.클래스|  :ctrl + space
//전체 import 2.ctrl + shift + O

public class EX02_Scanner {
 public static void main(String[] args) {
	 //객체 생성 키워드 :new
	 //클래스타입 객체명 =new 클래스명 ();
	 // Scanner : 표준입력 객체
	Scanner sc= new Scanner(System.in);
	
	//(에러)				-빨간색 밑줄로 표시
	//					:에러가 발생하면, 프로그램 실행 불가능
	
	//(경고)				-노란색 밑줄로 표시
	//					:경고가 발생해도 프로그램은 실행 가능
	System.out.println("a :");
	int a = sc.nextInt();			//nextInt() :정수하나를 입력 받
 	System.out.println("a : "+ a);
 	
 	//"문자열"
 	//:큰 따음표로 묶여있는 데이터
 	//"문자열" + 변수 (숫자)
 	//- 문자열과 숫자를 + (연결연산자)로 연결할 수 있다.
 	//이 때, 숫자 데이터는 문자열로 변환되어 연결된다.
 	
 	//close() : scnner 객체를 메모리에서 해제하는 메소드
 	sc.close();
 	//sc.nextInt();
 	//scnner 객체를 해제한 후에는 더이상 입력을 받을 수 없다.
 	
 }
 
}
