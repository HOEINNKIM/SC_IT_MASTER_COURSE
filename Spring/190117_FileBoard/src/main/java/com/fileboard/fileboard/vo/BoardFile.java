package com.fileboard.fileboard.vo;

import org.springframework.web.multipart.MultipartFile;

public class BoardFile {

	private String fileSeq;
	private String boardSeq;
	private String orgname;
	private String name;
	private MultipartFile file;

	public BoardFile() {}
	public BoardFile(String fileSeq, String boardSeq, String orgname, String name, MultipartFile file) {
		this.fileSeq = fileSeq;
		this.boardSeq = boardSeq;
		this.orgname = orgname;
		this.name = name;
		this.file = file;
	}

	public String getFileSeq() {
		return fileSeq;
	}
	public void setFileSeq(String fileSeq) {
		this.fileSeq = fileSeq;
	}
	public String getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(String boardSeq) {
		this.boardSeq = boardSeq;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "BoardFile [fileSeq=" + fileSeq + ", boardSeq=" + boardSeq + ", orgname=" + orgname + ", name=" + name
				+ ", file=" + file + "]";
	}
}
