package step3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DictionaryManager {
	HashMap<String, String> dictionary = new HashMap<>();
	
	
	public void addWord(String word, String description) {
		// 파라미터 단어와 설명글을 이용해서 연속된 데이터에 추가한다. "xxx라는 단어를 등록했습니다."
		// 단, 중복되지 않도록! 중복된다면, "등록되어 있는 단어입니다."
		if(dictionary.containsKey(word)) {
			System.out.println("등록되어 있는 단어입니다.");
		} else {
			System.out.println(word + "라는 단어를 추가했습니다.");
			dictionary.put(word, description);
		}		
	}

	public String searchWord(String word) {
		// 파라미터의 단어를 이용해서 "단어 : 설명글"의 String을 리턴해주세요.
		// 파라미터에서 들어온 단어가 존재하지 않는 경우, "등록되지 않은 단어입니다."
		String returnStr = "등록되지 않은 단어입니다.";
		if(dictionary.containsKey(word)) {
			String values = dictionary.get(word);
			returnStr = word + " : " + values;
			return returnStr;
		}
		return returnStr;
	}

	public boolean deleteWord(String word) {
		//들어온 파라미터에서 단어값을 이용해서 삭제하는데.. 삭제가 이루어졌다면 true, 안됐다면 false
		boolean flag = false;
		if(dictionary.containsKey(word)) {
			dictionary.remove(word);
			flag = true;
		} 
		return flag;			
	}
}
/* Iterator를 이용한 풀이
Set<String> set = dictionary.keySet();
Iterator<String> it2 = set.iterator();
while (it2.hasNext()) {
	String key = it2.next();
	if (key.equals(word)) {
		System.out.println("등록되어 있는 단어입니다.");
		break;
	}
}
dictionary.put(word, description);
System.out.println(word + " 라는 단어를 등록했습니다.");
*/


