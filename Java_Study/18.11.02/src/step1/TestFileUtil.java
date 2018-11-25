package step1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFileUtil {
	public static void main(String[] args) {
		String path = "c://java-io//iotest//step2//filetest//test.txt";
		String path2 = "c://java-io//iotest//step3//filetest//test.txt";
		/////////////////////////////////////////////////////////////////////////////////////
		File f = new File(path);
		if (f.exists() == false) {
			// ?뚯씪???곸쐞 ?붾젆?좊━ 媛앹껜瑜??살뼱?ㅻ뒗 硫붿꽌?쒕? ?몄텧?섏뿬 媛앹껜瑜?由ы꽩諛쏅뒗??
			File dir = f.getParentFile();
			// ?붾젆?좊━ ?앹꽦硫붿꽌?쒕? ?댁슜???붾젆?좊━瑜?留뚮벀
			dir.mkdirs();
			// ?뚯씪???앹꽦
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("?뚯씪 ?앹꽦 ?꾩쨷 ?ㅻ쪟");
			}
		} else {
			System.out.println(f.getPath() + "媛 議댁옱?섎?濡??앹꽦?섏? ?딆쓬!");
		}
		/////////////////////////////////////////////////////////////////////////////////////
		File f2 = new File(path2);
		// path瑜??뺤씤???붾젆?좊━媛 ?놁쑝硫??앹꽦
		f2.getParentFile().mkdirs();
		try {
			// FileWriter瑜??댁슜???뚯씪???놁쑝硫??뚯씪?앹꽦
			FileWriter fw = new FileWriter(f2, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("?ъ씠肄붿삤~!");
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/////////////////////////////////////////////////////////////////////////////////////
		
	}
}




