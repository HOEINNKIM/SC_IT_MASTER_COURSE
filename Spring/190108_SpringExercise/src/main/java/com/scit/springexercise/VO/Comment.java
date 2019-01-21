package com.scit.springexercise.VO;

public class Comment {

	private int commentSeq;
	private int boardSeq;
	private String id;
	private String comments;
	private String inDate;
	private int parentSeq;
	
	public Comment() {}
	public Comment(int commentSeq, int boardSeq, String id, String comments, String inDate, int parentSeq) {
		this.commentSeq = commentSeq;
		this.boardSeq = boardSeq;
		this.id = id;
		this.comments = comments;
		this.inDate = inDate;
		this.parentSeq = parentSeq;
	}
	
	public int getCommentSeq() {
		return commentSeq;
	}
	
	public void setCommentSeq(int commentSeq) {
		this.commentSeq = commentSeq;
	}
	
	public int getBoardSeq() {
		return boardSeq;
	}
	
	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
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
	
	public int getParentSeq() {
		return parentSeq;
	}
	
	public void setParentSeq(int parentSeq) {
		this.parentSeq = parentSeq;
	}
	
	@Override
	public String toString() {
		return "Comment [commentSeq=" + commentSeq + ", boardSeq=" + boardSeq + ", id=" + id + ", comments=" + comments
				+ ", inDate=" + inDate + ", parentSeq=" + parentSeq + "]";
	}
}