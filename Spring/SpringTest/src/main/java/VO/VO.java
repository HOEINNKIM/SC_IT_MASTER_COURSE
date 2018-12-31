package VO;

public class VO {
	
	private String message;

	public VO() {}
	public VO(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "VO [message=" + message + "]";
	}
		
}
