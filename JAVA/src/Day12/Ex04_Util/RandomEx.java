package Day12.Ex04_Util;

import java.util.Random;

/**
 * Random클래스
 * 타입별로 난수 랜덤수를 생성해주는 클래스임
 * 주요메소드로는
 * NextInt() 	:int 형 랜덤수를 반환하는 메소드
 * Nextboolean() 	:boolean 형 랜덤수를 반환하는 메소드
 * Nextdouble() 	:double 형 랜덤수를 반환 하는 메소드
 */

public class RandomEx {
	public static void main(String[] args) {
		Random random = new Random();
		
		boolean randomTF = random.nextBoolean();
		System.out.println("동전 앞 뒤 : "+randomTF);
		System.out.println("동전 던지기...");
		if( randomTF ) System.out.println("앞면");
		else System.out.println("뒷면");
		
		int fourByteRandom = random.nextInt();
		
		System.out.println("fourByteRandom"+fourByteRandom);
		
		// nextInt ( N ) 	: (0~N~-1) 사이의 난수를 반환
		// nextInt ( 6 )	: (0 ~ 5) 
		// nextInt ( 6 ) + 1: (1 ~ 6)
		//[공식]
		//random.nextInt(개수) + 시작숫자
		// 주사위 던지기 (1~6)
		int dice =random.nextInt(6) +1;
		System.out.println("주사위 : " +dice);
		
		int lotto = random.nextInt(45) +1;
		System.out.println("로또번호 :"+lotto);
		
		double randomdouble = random.nextInt();
		System.out.println("실수 랜덤 수 : " + randomdouble );
	}

}