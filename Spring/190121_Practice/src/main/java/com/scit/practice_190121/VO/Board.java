package com.scit.practice_190121.VO;

import org.springframework.web.multipart.MultipartFile;

public class Board {

	private String boardSeq;
	private String title;
	private String content;
	private String orgName;
	private String fileName;
	private String inDate;
		
	public Board() {}

	public Board(String boardSeq, String title, String content, String orgName, String fileName, String inDate) {
		super();
		this.boardSeq = boardSeq;
		this.title = title;
		this.content = content;
		this.orgName = orgName;
		this.fileName = fileName;
		this.inDate = inDate;
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

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getInDate() {
		return inDate;
	}

	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	@Override
	public String toString() {
		return "Board [boardSeq=" + boardSeq + ", title=" + title + ", content=" + content + ", orgName=" + orgName
				+ ", fileName=" + fileName + ", inDate=" + inDate + "]";
	}

}
