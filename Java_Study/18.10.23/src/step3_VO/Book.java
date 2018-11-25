package step3_VO;

public class Book {

	private String bookId; // 도서번호
	private String title; // 제목
	private String content; // 내용

	public Book(String bookId, String title, String content) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.content = content;
	}

	public Book() {
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
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

	@Override
	public String toString() {
		return "도서번호 = " + bookId + ", 도서제목 = " + title + ", 도서내용 = " + content + "]";
	};

}