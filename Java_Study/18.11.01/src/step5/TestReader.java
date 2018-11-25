package step5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\ioTest\\outer.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine(); // .readLine(); ?쒖쨪???쎌뼱以?
			while (str != null) {
				System.out.println(str);
				str = br.readLine();
			}
			br.close();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			System.out.println("?뚯씪??李얠쓣 ???놁냼");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("?쎄린瑜??ㅽ뙣?섏???);
			e.printStackTrace();
		}
	}

}
