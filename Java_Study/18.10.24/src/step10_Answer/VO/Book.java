package step10_Answer.VO;

public class Book {

	private String bookId;// ?꾩꽌踰덊샇
	private String title;// ?쒕ぉ
	private String content;// ?댁슜

	public Book(String bookId, String title, String content) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.content = content;
	}

	public Book() {
		super();
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
		return "?꾩꽌踰덊샇=" + bookId + ", ?꾩꽌?쒕ぉ=" + title + ", ?꾩꽌?댁슜=" + content;
	}

}
