package Day09.Ex02_Board;

/**
 * 게시글 정보
 * -제목
 * -작성자
 * -내용
 * -등록일자
 * -수정일자
 * CRUD 등록 조회 수정 삭제
 */

public class Board {
	// 멤버 변수 (필드)
	private int on;
	private String title; 
	private String wrter; 
	private String content; 
	private String regDate; 
	private String updDate; 
	
	//기본 생성자
	public Board() {
		
	}
	// 매개변수가 있는 생성자
	public Board(String title, String wrter,String content) {
		
		this.title = title;
		this.wrter = wrter;
		this.content = content;
		
		
	}

public int getOn() {
		return on;
	}
	public void setOn(int on) {
		this.on = on;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWrter() {
		return wrter;
	}
	public void setWrter(String wrter) {
		this.wrter = wrter;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getUpdDate() {
		return updDate;
	}
	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}
	
//tostring
@Override
	public String toString() {
		return "Board [on=" + on + ", title=" + title + ", wrter=" + wrter + ", content=" + content + ", regDate="
				+ regDate + ", updDate=" + updDate + "]";
	}



{
		
	}

}
