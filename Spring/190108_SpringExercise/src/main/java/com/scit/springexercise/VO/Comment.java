package com.scit.springexercise.VO;

public class Comment {

	private String commentSeq;
	private String boardSeq;
	private String id;
	private String comments;
	private String inDate;
	private String parentSeq;
	
	public Comment() {}
	public Comment(String commentSeq, String boardSeq, String id, String comments, String inDate, String parentSeq) {
		this.commentSeq = commentSeq;
		this.boardSeq = boardSeq;
		this.id = id;
		this.comments = comments;
		this.inDate = inDate;
		this.parentSeq = parentSeq;
	}
	
	public String getCommentSeq() {
		return commentSeq;
	}
	
	public void setCommentSeq(String commentSeq) {
		this.commentSeq = commentSeq;
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
	
	public String getParentSeq() {
		return parentSeq;
	}
	
	public void setParentSeq(String parentSeq) {
		this.parentSeq = parentSeq;
	}
	
	@Override
	public String toString() {
		return "Comment [commentSeq=" + commentSeq + ", boardSeq=" + boardSeq + ", id=" + id + ", comments=" + comments
				+ ", inDate=" + inDate + ", parentSeq=" + parentSeq + "]";
	}
}