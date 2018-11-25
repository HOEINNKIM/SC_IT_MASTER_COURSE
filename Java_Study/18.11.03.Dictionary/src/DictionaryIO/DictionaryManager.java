package DictionaryIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class DictionaryManager {
	String path = "c://java-scm//iotest//objecttest//dictionary.xyz";
	HashMap<String, String> dictionary = null;

	public DictionaryManager() {
		dictionary = new HashMap<>();
		
	}

	public void addWord(String word, String description) {
		// 파라미터의 단어와 설명글을 이용해서 dictionary에 추가한다. "word 라는 단어를 등록했습니다."
		// 단, 중복되지 않도록! 중복된다면, "등록되어 있는 단어입니다."		
		
		if (dictionary.containsKey(word)) {
			System.out.println("등록되어 있는 단어입니다.");
		} else {
			dictionary.put(word, description);
			System.out.println(word + " 라는 단어를 등록했습니다.");
		}
	}

	public String searchWord(String word) {
		// 파라미터의 단어를 이용해서 "단어 : 설명글"의 String을 리턴해주세요.
		// 파라미터에서 들어온 단어가 존재하지 않는 경우, "등록되지 않은 단어입니다."
		String returnStr = "등록되지 않은 단어입니다.";
		if (dictionary.containsKey(word)) {
			returnStr = word + " : " + dictionary.get(word);
		}
		return returnStr;
	}

	public boolean deleteWord(String word) {
		// 들어온 파라미터의 단어값을 이용해서 삭제하는데.. 
		// 삭제가 이루어졌다면 true, 안됐다면 false
		boolean flag = false;
		if(dictionary.remove(word) != null) {
			flag = true;
		}
		return flag;
	}

	public void fileWrite() {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dictionary);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void init() {

		File f = new File(path);
		f.getParentFile().mkdirs();
		try {
			if (f.exists()) {
				FileInputStream fis = new FileInputStream(path);
				ObjectInputStream ois = new ObjectInputStream(fis);
				dictionary = (HashMap<String, String>) ois.readObject();
				ois.close();
				fis.close();
			} else {
				f.createNewFile();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
