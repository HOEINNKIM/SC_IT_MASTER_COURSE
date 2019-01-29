package com.supermarket.supermarket.UTIL;

public class PageNavigator {

	//����
	private int boardPerPage;	//1.�������� ���� ����
	private int pagePerGroup;	//2.������ �׷� �� �������� ����
	private int currentPage;	//3.���� ������
	private int totalRecord;	//4.��ü �Խñ� ��
	private int totalPage;		// ��ü ������ ��

	//���ؾ��� ��
	private int currentPageGroup;	//���� ������ �׷�
	private int startPageGroup;		//����׷��� ù������
	private int endPageGroup;		//����׷��� ��������
	private int startBoardPage;		//������������ ù �� ��ġ
	
	public PageNavigator(int boardPerPage, int pagePerGroup, int currentPage, int totalRecord) {
		this.boardPerPage = boardPerPage;
		this.pagePerGroup = pagePerGroup;
		this.totalRecord = totalRecord;
		
		//��ü �������� ��
		totalPage = (totalRecord + boardPerPage - 1)/boardPerPage;
		
		//���� �������� ���ǽ�
		if(currentPage < 1) {
			this.currentPage = 1;
		} else if(currentPage > totalPage){
			this.currentPage = totalPage;			
		} else {
			this.currentPage = currentPage;
		}
		
		//���� ���� ������ �׷�(0���� ���� ����)
		currentPageGroup = (this.currentPage-1) / pagePerGroup;
		
		//���� ���� �׷��� ù ������
		startPageGroup = currentPageGroup*pagePerGroup +1;
		if(startPageGroup < 1) {
			startPageGroup = 1;
		}
		
		//���� ���� �׷��� ��������
		endPageGroup = startPageGroup + pagePerGroup -1;
		if(endPageGroup > totalPage) {
			endPageGroup = totalPage;
		}
		
		//���� �������� ù �Խñ� ��ġ
		startBoardPage = (this.currentPage - 1) * boardPerPage;
		
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
	public int getStartBoardPage() {
		return startBoardPage;
	}
	public void setStartBoardPage(int startBoardPage) {
		this.startBoardPage = startBoardPage;
	}
	@Override
	public String toString() {
		return "PageNavigator [boardPerPage=" + boardPerPage + ", pagePerGroup=" + pagePerGroup + ", currentPage="
				+ currentPage + ", totalRecord=" + totalRecord + ", totalPage=" + totalPage + ", currentPageGroup="
				+ currentPageGroup + ", startPageGroup=" + startPageGroup + ", endPageGroup=" + endPageGroup
				+ ", startBoardPage=" + startBoardPage + "]";
	}	
}