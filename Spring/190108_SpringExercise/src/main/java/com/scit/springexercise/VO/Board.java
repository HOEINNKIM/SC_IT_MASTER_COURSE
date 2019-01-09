package com.scit.springexercise.VO;

public class Board {

	private String boardSeq;
	private String id;
	private String boardTitle;
	private String boardContent;
	private int hitCount;
	private String inDate;
	
	public Board() {}
	
	public Board(String boardSeq, String id, String boardTitle, String boardContent, int hitCount, String inDate) {
		this.boardSeq = boardSeq;
		this.id = id;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.hitCount = hitCount;
		this.inDate = inDate;
	}
	
	public String getBoardSeq() {
		return boardSeq;
	}
	
	public void setBoardSeq(String boardSeq) {
		this.boardSeq = boardSeq;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getBoardTitle() {
		return boardTitle;
	}
	
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	
	public String getBoardContent() {
		return boardContent;
	}
	
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	
	public int getHitCount() {
		return hitCount;
	}
	
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	
	public String getInDate() {
		return inDate;
	}
	
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	
	@Override
	public String toString() {
		return "Content [boardSeq=" + boardSeq + ", id=" + id + ", boardTitle=" + boardTitle + ", boardContent="
				+ boardContent + ", hitCount=" + hitCount + ", inDate=" + inDate + "]";
	}	
}