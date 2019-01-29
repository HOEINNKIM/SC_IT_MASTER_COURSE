package com.scit.practice_190121.UTIL;

public class PageNavigator {

	//조건
	private int boardPerPage; //한 페이지당 게시글
	private int pagePerGroup; //한 그룹당 페이지
	private int currentPage; //현재 페이지
	private int totalRecord; //전체 게시글 수
	
	//구해야할 값
	private int totalPage; 		  //전체 페이지 수
	private int currentPageGroup; //현재 페이지 그룹
	private int startPageGroup;   //현재 그룹의 첫 페이지
	private int endPageGroup;	  //현재 그룹의 끝 페이지
	private int startOfBoardPage;   //현재 페이지의 첫 글 위치
	
	public PageNavigator(int boardPerPage, int pagePerGroup, int currentPage, int totalRecord) {
		this.boardPerPage = boardPerPage;
		this.pagePerGroup = pagePerGroup;
		this.totalRecord = totalRecord;

		this.totalPage = (totalRecord + boardPerPage - 1) / boardPerPage;
		
		if(currentPage < 1) {
			this.currentPage = 1;
		} else if(currentPage > totalPage) {
			this.currentPage = totalPage;
		} else {
			this.currentPage = currentPage;			
		}

		//0부터 시작하는 현재 페이지 그룹
		currentPageGroup = (this.currentPage - 1) / pagePerGroup;
		
		startPageGroup = currentPageGroup * pagePerGroup + 1;
		if(startPageGroup < 1) {
			startPageGroup = 1;
		}
		
		endPageGroup = startPageGroup + pagePerGroup - 1;
		if(endPageGroup > totalPage) {
			endPageGroup = totalPage;
		}
		
		startOfBoardPage = (this.currentPage - 1) * boardPerPage;
	}
	public int getBoardPerPage() {
		return boardPerPage;
	}
	public void setBoardPerPage(int boardPerPage) {
		this.boardPerPage = boardPerPage;
	}
	public int getPagePerGroup() {
		return pagePerGroup;
	}
	public void setPagePerGroup(int pagePerGroup) {
		this.pagePerGroup = pagePerGroup;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrentPageGroup() {
		return currentPageGroup;
	}
	public void setCurrentPageGroup(int currentPageGroup) {
		this.currentPageGroup = currentPageGroup;
	}
	public int getStartPageGroup() {
		return startPageGroup;
	}
	public void setStartPageGroup(int startPageGroup) {
		this.startPageGroup = startPageGroup;
	}
	public int getEndPageGroup() {
		return endPageGroup;
	}
	public void setEndPageGroup(int endPageGroup) {
		this.endPageGroup = endPageGroup;
	}
	public int getStartOfBoardPage() {
		return startOfBoardPage;
	}
	public void setStartOfBoardPage(int startOfBoardPage) {
		this.startOfBoardPage = startOfBoardPage;
	}
	@Override
	public String toString() {
		return "PageNavigator [boardPerPage=" + boardPerPage + ", pagePerGroup=" + pagePerGroup + ", currentPage="
				+ currentPage + ", totalRecord=" + totalRecord + ", totalPage=" + totalPage + ", currentPageGroup="
				+ currentPageGroup + ", startPageGroup=" + startPageGroup + ", endPageGroup=" + endPageGroup
				+ ", startOfBoardPage=" + startOfBoardPage + "]";
	}
}