package step3_Manager;

import step3_VO.Book;

public class BookMgr {//도서배열 관리, 검색, 전체 출력 담당
	
	private Book [] bArray = new Book[100];
	private int index = 0;
	
	public void addBook(Book book) {	//도서 등록
		bArray[index++] = book;
	}

	public Book searchBook(String bookId) {	//도서 검색
		for(int i=0; i<index; i++) {
			
			if(bookId.equals(bArray[i].getBookId())) {
				return bArray[i];
			} else {
			}			
		}
		return null;//실수 많이 함
	}
	
	public void printAll() {
		for(int i=0; i<index; i++) {
			System.out.println(bArray[i]);				
		}
	}
}