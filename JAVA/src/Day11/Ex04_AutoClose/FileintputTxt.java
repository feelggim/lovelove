package Day11.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileintputTxt {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("test.txt");
			
			int read = 0;
			
			// fis.read() : .txt 파일의 데이터를 한 글자씩 읽어들어옵니다.
			//				*더이상 읽어올 데이터가 없으면 -1을 반환
			// 가져올 글자가 없을 때 까지 반복한다.
			while ( (read = fis.read())!= -1) {
				System.out.println((char)read);
				
			}
		} catch (FileNotFoundException e) {
			//FileNotFoundException :  파일이 존재하지 않을때 발생하는 예외
			e.printStackTrace();
			System.err.println("파일을 찾을 수 없습니당");
		}	// 파일을 입력 할 수 잇도록 변경
		  catch (IOException e) {
			// IOException : 입력 및 출력 과정에서 발생하는 예외
			e.printStackTrace();
			System.err.println("입출력 관련 예외 발생했어용");
		}
		
		finally {
			if (fis != null ) {
				try {					
					fis.close();	//close () 메모리 해제
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
