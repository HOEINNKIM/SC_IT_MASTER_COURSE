package step3_TestStringEx;

public class TestStringEx {

	public static void main(String[] args) {
		FileMgr mgr = new FileMgr();
		String fa[] = {
			"삐삐.mp3",
			"a.txt",
			"오리날다.mp3",
			"야구동영상.avi",
			
		};
		//mp3를 갖고 있는 아이들의 제목만 출력
		mgr.printFileType("mp3", fa);
		
		
	}

}
