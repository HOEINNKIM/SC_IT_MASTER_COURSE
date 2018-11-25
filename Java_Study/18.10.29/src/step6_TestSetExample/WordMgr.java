package step6_TestSetExample;

import java.util.HashSet;

public class WordMgr {

	public void printWordKind(String memo) {
		String[] str = memo.split(" ");
		HashSet set = new HashSet();
		for(int i = 0; i <str.length; i++) {
			set.add(str[i]);
		}
		//System.out.println(set);
		/*for(int i=0; i<str.length; i++) {
			set.iterator(); //반복자라는 키워드를 가짐
		}*/
	}

}
