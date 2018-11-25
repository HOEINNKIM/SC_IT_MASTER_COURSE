package step3;

import java.io.IOException;

public class TestSystemIn2 {
	/**
	 * 肄섏넄濡쒕????낅젰諛쏆븘 ?뚯씪??吏?띿쟻?쇰줈 異쒕젰?섎뒗 ?덉젣
	 * ?ㅽ뻾 ??
	 * 		?먯떖硫붾돱 ?낅젰 : (?ㅻ낫?쒖엯?? 吏쒖옣硫?
	 * 		吏쒖옣硫??낅젰?꾨즺!
	 * 		?먯떖硫붾돱 ?낅젰 : 吏щ퐬
	 * 		吏щ퐬 ?낅젰?꾨즺!
	 * 		?먯떖硫붾돱 ?낅젰 : exit
	 * 		二쇰Ц?꾨즺!
	 * @param args
	 */
	public static void main(String[] args) {
		ConsolMgr mgr = new ConsolMgr();
		try {
			mgr.menuOrder("C:\\java-io\\iotest\\step3\\filetest\\menu.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
