package step3_VO;

public class AudioBook extends Book {

	private int playTime;

	public AudioBook(String bookId, String title, String content, int playTime) {
		super(bookId, title, content);
		this.playTime = playTime;
	}

	public AudioBook(String bookId, String title, String content) {
		super(bookId, title, content);
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	@Override
	public String toString() {
		return super.toString() + "AudioBook [playTime=" + playTime + "]";
	}
	
	
}
