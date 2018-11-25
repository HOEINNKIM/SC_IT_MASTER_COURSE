package step10_Answer.Manager;

import step10_Answer.VO.Book;

public class BookMgr {// ?꾩꽌諛곗뿴 愿由? 寃?? ?꾩껜異쒕젰 ?대떦

	private Book[] bArray = new Book[100];
	private int index = 0;

	public void addBook(Book book) {// ?꾩꽌 ?깅줉
		bArray[index++] = book;
	}

	public Book searchBook(String bookId) {// ?꾩꽌寃??

		for (int i = 0; i < index; i++) {

			if (bookId.equals(bArray[i].getBookId())) {

				return bArray[i];
			}

		}
		return null;
	}

	public void printAll() {// ?꾩껜異쒕젰

		for (int i = 0; i < index; i++) {

			System.out.println(bArray[i]);

		}
	}

}
