package com.scit.practice_190121_VO;

public class Board {

	private String boardSeq;
	private String title;
	private String content;
	
	public Board() {}

	public Board(String boardSeq, String title, String content) {
		super();
		this.boardSeq = boardSeq;
		this.title = title;
		this.content = content;
	}

	public String getBoardSeq() {
		return boardSeq;
	}

	public void setBoardSeq(String boardSeq) {
		this.boardSeq = boardSeq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Board [boardSeq=" + boardSeq + ", title=" + title + ", content=" + content + "]";
	}		
		
}
