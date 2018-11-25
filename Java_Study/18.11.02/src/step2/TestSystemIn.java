package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestSystemIn {
	/**
	 * 肄섏넄濡쒕????곗씠?곕? ?낅젰諛쏅뒗 ?덉젣 System.in - InputStream - InputStreamReader -
	 * BufferedReader ?몃뱶 ?ㅽ듃由?8 -> 16 bit ?ㅽ듃由?蹂寃?readLine()
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 肄섏넄???곌껐?섎뒗 ?낅젰 ?ㅽ듃由??몃뱶 ?ㅽ듃由?
		InputStream is = System.in;
		// 8 -> 16 bit ?ㅽ듃由쇱쑝濡?蹂寃쏀븯???꾨줈?몄뒪 ?ㅽ듃由?
		InputStreamReader isr = new InputStreamReader(is);
		// readLine() 怨?媛숈? ?몃━??湲곕뒫??媛吏??꾨줈?몄뒪 ?ㅽ듃由?
		BufferedReader br = new BufferedReader(isr);
		try {
			while (true) {
				System.out.print("?댁긽?뺤쓣 ?낅젰?섏꽭??: ");
				String data;
				data = br.readLine();
				if (data.equals("exit")) {
					break;
				}
				System.out.println("?뱀떊???댁긽?뺤? " + data);
			}
			br.close();
			isr.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
