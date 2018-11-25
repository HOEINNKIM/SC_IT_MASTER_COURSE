package step3_TestStringEx;

public class FileMgr {
	public void printFileType(String str, String[] fa) {
		for(int i=0; i < fa.length; i++) {
			if(fa[i].endsWith(str)) {
				//1번째 방법
				//int ex = fa[i].indexOf(str);
				//System.out.println(fa[i].substring(0, ex-1));				
				//2번째 방법
				System.out.println(fa[i].replace("." + str, ""));
			}
		}
	}
}