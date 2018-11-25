package step6;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		File dir = new File("c://iotest2//newDir//test");
		System.out.println(dir.mkdirs()); // 理쒗븯???붾젆?좊━源뚯? ?쒕갑?? ?앹꽦 ???깃났?щ?瑜??깃났??true, ?ㅽ뙣??false濡?諛섑솚
		File nf = new File("c://iotest2//newDir//test//test.txt");
		try {
			System.out.println(nf.createNewFile()); // ?뚯씪?앹꽦. ?깃났?щ?瑜?true/ false濡?諛섑솚
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(nf.getName()); // ?뚯씪紐?異쒕젰
		System.out.println(nf.getPath()); // ?꾩껜寃쎈줈 + ?뚯씪紐?異쒕젰
		System.out.println(nf.getParent()); // ?뚯씪???꾩튂??寃쎈줈, ?붾젆?좊━留?異쒕젰
		System.out.println(nf.isFile()); // ?뚯씪?멸?? ?щ?瑜?true / false 濡?諛섑솚
		System.out.println(nf.isDirectory()); // ?붾젆?좊━?멸?? ?щ?瑜?true / false 濡?諛섑솚
		System.out.println(nf.canWrite()); // ?곌린 沅뚰븳???щ?瑜?true / false 濡?諛섑솚
		// ?붾젆?좊━???덈뒗 ?뚯씪 諛??붾젆?좊━瑜??뺤씤
		if (dir.isDirectory()) {
			String[] f = dir.list();
			for (int i = 0; i < f.length; i++) {
				System.out.println(f[i]);
			}
		}
		// file?대㈃ ?욎뿉 file : , ?붾젆?좊━?쇰㈃ ?욎씠 dir : ??遺숈뿬??異쒕젰?대낫?꾨씪
		//HINT : .listFiles() 硫붿냼?쒕? ?ъ슜?섏꽭??
		if (dir.isDirectory()) {
			File[] f = dir.listFiles();
			for (int i = 0; i < f.length; i++) {
				if(f[i].isFile()) {
					System.out.println("file : " +f[i].getName());					
				} else if(f[i].isDirectory()){
					System.out.println("dir : " + f[i].getName());
				}
			}
		}
	
	
	}

}
