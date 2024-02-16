package Day04;

import java.util.Iterator;

public class Ex04_forcach {

	public static void main(String[] args) {
		// 배열 선언 및 초기화
		String[] week = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		//foreach + ctrl+ space
		for (String day : week) {
			System.out.println(day+"");
			
		}
		System.out.println();
	
		//기본 ofr문
		for (int i = 0; i< week.length; i+=2) {
			System.out.println(week[i]+"");
	
		}
		System.out.println();
	}
}