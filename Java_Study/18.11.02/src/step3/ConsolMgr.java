package step3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConsolMgr {
	public void menuOrder(String path) throws IOException {
		// ?ㅻ낫?쒕줈遺?곗쓽 ?낅젰愿??
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		// ?뚯씪愿??
		File f = new File(path);
		f.getParentFile().mkdirs();
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);
		while(true) {
			System.out.print("?먯떖硫붾돱 ?낅젰 : ");
			String data = br.readLine();
			if (data.equals("exit")) {
				System.out.println("二쇰Ц?꾨즺!!!");
				break;
			}
			pw.println(data);
			System.out.println(data + " ?낅젰?꾨즺!");
		}
		br.close();
		isr.close();
		is.close();
		pw.close();
		fw.close();
	}
}
