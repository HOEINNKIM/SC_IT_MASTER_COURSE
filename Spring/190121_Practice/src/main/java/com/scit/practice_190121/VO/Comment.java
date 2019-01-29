package com.scit.practice_190121.VO;

public class Comment {

	private String boardSeq;
	private String commSeq;
	private String id;
	private String comments;
	private String inDate;
	
	public Comment() {}

	public Comment(String boardSeq, String commSeq, String id, String comments, String inDate) {
		super();
		this.boardSeq = boardSeq;
		this.commSeq = commSeq;
		this.id = id;
		this.comments = comments;
		this.inDate = inDate;
	}

	public String getBoardSeq() {
		return boardSeq;
	}

	public void setBoardSeq(String boardSeq) {
		this.boardSeq = boardSeq;
	}

	public String getCommSeq() {
		return commSeq;
	}

	public void setCommSeq(String commSeq) {
		this.commSeq = commSeq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getInDate() {
		return inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	@Override
	public String toString() {
		return "Comment [boardSeq=" + boardSeq + ", commSeq=" + commSeq + ", id=" + id + ", comments=" + comments
				+ ", inDate=" + inDate + "]";
	}

	
	
}