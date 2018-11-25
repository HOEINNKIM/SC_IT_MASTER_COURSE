package step4_TestException;

public class TestException5 {
	public static void main(String[] args) {
		
		try {
			System.out.println(4/0);		
		
		}catch(NumberFormatException ae) {
//		}catch(ArithmeticException ae) {
			System.out.println("0?쇰줈 ?섎닃 ???놁뒿?덈떎.");
		} finally {	//?덉쇅泥섎━? 愿怨꾩뾾????긽 ?섑뻾?섎뒗 湲곕뒫??留먰븳??
			System.out.println("臾댁“嫄??ㅽ뻾");
		}
		System.out.println("?뺤긽 ?섑뻾");
	}

}
