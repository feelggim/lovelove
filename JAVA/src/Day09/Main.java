package Day09;


import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import Day09.Ex02_Board.Board;

public class Main {

	public static void main(String[] args, Object result, Object deleteNo) {
		Boradinterpace boardInterface = new BoardAccess ();
		Scanner sc = new Scanner(System.in);		
		int menuNo;
		do {
			
		System.out.println("=======게시판=======");
		System.out.println("1.게시글 목록");
		System.out.println("2.게시글 목록");
		System.out.println("3.게시글 목록");
		System.out.println("4.게시글 목록");
		System.out.println("5.게시글 목록");
		System.out.println("0.프로그램 종료");
		System.out.println("메뉴번호 :");
		
		menuNo = sc.nextInt();
		sc.nextLine();			// 엔터를 입력버퍼에서 제거
		
		switch (menuNo) {
			case 1:		// 게시글 목록
						Board[] boardList = boardInterface.list();
						for (Board board : boardList) {
							System.out.println(board);
						}
						break;
			case 2: 	// 게시글 등록
						System.out.print("제목 : ");
						String title = sc.nextLine();
						System.out.print("작성자 : ");
						String writer = sc.nextLine();
						System.out.print("내용 : ");
						String content = sc.nextLine();
						
						Board board = new Board(title, writer, content);
						Board createdBoard = boardInterface.create(board);
						
						if( createdBoard != null ) {
							System.out.print("생성된 게시글 정보 : ");
							System.out.println(createdBoard);
						}
						break;
			case 3: 	// 게시글 조회
				 		sc.nextLine();
						System.out.print("조회할 글 번호 : ");
						int no = sc.nextInt();
						Board selectedBoard = boardInterface.read(no);
						if( selectedBoard != null ) {
							System.out.print("조회된 게시글 정보 : ");
							System.out.println(selectedBoard);
						}
						break;
			case 4: 	// 게시글 수정
						// 수정할 게시글 번호, 수정 게시글 정보 입력
						System.out.println("수정 할 글 번호 : ");
						int UpdateNo = sc.nextInt();
						System.out.println("제목 : ");
						String UpdateTitle = sc.nextLine();
						System.out.println("작성자 : ");
						String Updatewriter = sc.nextLine();
						System.out.println("내용");
						String UpdateContent = sc.nextLine();
						
//						Board updateBoard = new Board (UpdateTitle,UpdateTitle,Updatewriter,)
//						
//						int (return > 0) {
//							System.out.println("게시글 수정을 완료 하였습니다.");
//						} else {
//							System.out.println("게시글 수정에 실패 하였습니다.");
//						}
			
						
		
						break;
			case 5: 	// 게시글 삭제
						System.out.println("삭제할 글 번호");
						int dleate = sc.nextInt();
						sc.nextLine();
						result = Boradinterpace.delete(deleteNo);
						
						break;
			default:
						break;
		}
		
	} while (menuNo != 0);
	}
}
