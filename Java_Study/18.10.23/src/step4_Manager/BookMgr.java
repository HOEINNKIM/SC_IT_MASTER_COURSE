package step4_Manager;

import step4_VO.Book;

public class BookMgr {// 占쎈즲占쎄퐣獄쏄퀣肉??울옙?깍옙, 野껓옙占쎄퉳, 占쎌읈筌ｋ똻?㏆옙??占쎈뼖占쎈뼣

	private Book[] bArray = new Book[100];
	private int index = 0;

	public void addBook(Book book) {// 占쎈즲占쎄퐣 占쎈쾻嚥∽옙
		bArray[index++] = book;
	}

	public Book searchBook(String bookId) {// 占쎈즲占쎄퐣野껓옙占쎄퉳

		for (int i = 0; i < index; i++) {

			if (bookId.equals(bArray[i].getBookId())) {

				return bArray[i];
			}

		}
		return null;
	}

	public void printAll() {// 占쎌읈筌ｋ똻?㏆옙??

		for (int i = 0; i < index; i++) {

			System.out.println(bArray[i]);

		}
	}

}
