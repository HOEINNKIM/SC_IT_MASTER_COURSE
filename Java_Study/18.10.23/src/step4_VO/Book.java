package step4_VO;

public class Book {

	private String bookId;// 占쎈즲占쎄퐣甕곕뜇??
	private String title;// 占쎌젫筌륅옙
	private String content;// 占쎄땀占쎌뒠

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
		return "占쎈즲占쎄퐣甕곕뜇??" + bookId + ", 占쎈즲占쎄퐣占쎌젫筌륅옙=" + title + ", 占쎈즲占쎄퐣占쎄땀占쎌뒠=" + content;
	}

}
