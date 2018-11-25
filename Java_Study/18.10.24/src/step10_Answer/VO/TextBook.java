package step10_Answer.VO;

public class TextBook extends Book {
	private String pageNum;

	public TextBook(String bookId, String title, String content, String pageNum) {
		super(bookId, title, content);
		this.pageNum = pageNum;
	}

	public String getPageNum() {
		return pageNum;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", ?섏씠吏??" + pageNum;
	}
}
