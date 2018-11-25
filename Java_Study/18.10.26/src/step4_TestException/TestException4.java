package step4_TestException;

public class TestException4 {

	public static void main(String[] args) {
		String s = "??;
		String sa[] = {"?섎굹", "??};
		try {
			System.out.println(sa[2]);
			int i = Integer.parseInt(s);			

		} catch(NumberFormatException ne){
			System.out.println("?뺤닔 臾몄옄?댁쓣 ?ｌ뼱???⑸땲??");
		} catch(Exception e) {
			//?덉쇅???먯씤怨?諛쒖깮寃쎈줈瑜?異쒕젰?쒕떎.
			e.printStackTrace();
			System.out.println("Exception 罹먯튂?덈떎! 諛섎쭚利?);
			System.out.println(e.getMessage());
		}
		System.out.println("?뺤긽?섑뻾");
	}
}
