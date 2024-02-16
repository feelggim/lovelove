package Day09;

import java.awt.Robot;

import Day09.Ex02_Board.Board;

public class BoardAccess implements Boradinterpace{
	int count = 0;
    Board[] boardList = {
        new Board("제목01", "작성자01", "내용01"),
        new Board("제목02", "작성자02", "내용02"),
        new Board("제목03", "작성자03", "내용03"),
        new Board("제목04", "작성자04", "내용04"),
        new Board("제목05", "작성자05", "내용05"),
        
        /**
         *	게시글 등록  
         *
         */
    };

    @Override
    public Board create(Board board) {
        if (this.count == 5) {
            System.out.println("게시글 목록이 꽉 찼습니다.");
            return null;
        }
        // 게시글 등록
        int boardNo = ++count;
        boardList[count - 1] = board;
        String regDate = "2024/02/15 - 12:00";
        board.setRegDate(regDate);

        System.out.println(board);
        System.out.println("게시글이 등록되었습니다.");
        return board; // 수정: 등록된 board를 반환하도록 수정
    }

    @Override
    public Board[] list() {
        if (this.count == 0) {
            System.out.println("조회된 게시글이 없습니다.");
            return null;
        }
        System.out.println("게시글 목록을 조회합니다.");
        return boardList;
    }

    @Override
    public Board read(int no) {
        if (no > 5 || no < 1) {
            System.out.println("1~5번의 게시글만 존재합니다.");
            return null;
        }
        System.out.println(no + "번글을 조회합니다.");
        return boardList[no - 1];
    }

    @Override
    public int update(Board board) {
        int no = board.getOn(); // 수정할 게시글 번호
        if (no > 5 || no < 1) {
            System.out.println("1~5번의 게시글만 존재합니다");
            return 0;
        }
        // 게시글 수정
        board.setUpdDate("2024/02/15 - 14:00");
        boardList[no - 1] = board;
        return 1;
    }

    @Override
    public int dleate (int no) {
        if (no > 5 || no < 1) {
            System.out.println("1~5번의 게시글만 존재합니다");
            return 0;
        }

        // i 시작값: 삭제할 글 index + 1
        for (int i = no; i < boardList.length; i++) {
            // 바로 앞의 위치 = 현재 접근한 글 위치
            boardList[i - 1] = boardList[i];

            // 앞으로 당기고 남은 가장 마지막 글 위치는 비운다.
            boardList[count - 1] = null;

            // 삭제 후 게시글 개수 1 감소
            count--;

            return 1; // 삭제한 게시글 개수
        }
        return 0;
    }


	}
