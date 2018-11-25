package step4_TestException;

public class TestException2 {

	public static void main(String[] args) {
		String name = null;
		try {	// Exception 諛쒖깮 ?덉긽 吏?먯뿉 try濡?釉붾윮(={})
			System.out.println(name.length());
		}catch(NullPointerException ne) {	// catch 濡?Exception 媛앹껜瑜?泥섎━ = ?泥섎갑?덉쓣 ?뺤쓽
			//NullPointerException??遺紐⑥씤 Exception ?쇰줈??諛쏆쓣 ???덈떎.
			System.out.println("?뺤긽?섑뻾");			
		}
	}

}
