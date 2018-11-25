package step3_VO;

public class TextBook extends Book {

	private String pageNum;

	public TextBook(String bookId, String title, String content, String pageNum) {
		super(bookId, title, content);
		this.pageNum = pageNum;
	}

	public TextBook(String bookId, String title, String content) {
		super(bookId, title, content);
	}

	public String getPageNum() {
		return pageNum;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	@Override
	public String toString() {
		return super.toString() + "TextBook [pageNum=" + pageNum + "]";
	}
	
	
	
}
