package dic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import step4.PersonVO;

public class DictionaryManager {
	String path = "c://java-scm//iotest//objecttest//dictionary.xyz";
	HashMap<String, String> dictionary = null;

	public DictionaryManager() {
		dictionary = new HashMap<>();
		
	}

	public void addWord(String word, String description) {
		// ?뚮씪誘명꽣???⑥뼱? ?ㅻ챸湲???댁슜?댁꽌 dictionary??異붽??쒕떎. "word ?쇰뒗 ?⑥뼱瑜??깅줉?덉뒿?덈떎."
		// ?? 以묐났?섏? ?딅룄濡? 以묐났?쒕떎硫? "?깅줉?섏뼱 ?덈뒗 ?⑥뼱?낅땲??"		
		
		if (dictionary.containsKey(word)) {
			System.out.println("?깅줉?섏뼱 ?덈뒗 ?⑥뼱?낅땲??");
		} else {
			dictionary.put(word, description);
			System.out.println(word + " ?쇰뒗 ?⑥뼱瑜??깅줉?덉뒿?덈떎.");
		}
	}

	public String searchWord(String word) {
		// ?뚮씪誘명꽣???⑥뼱瑜??댁슜?댁꽌 "?⑥뼱 : ?ㅻ챸湲"??String??由ы꽩?댁＜?몄슂.
		// ?뚮씪誘명꽣?먯꽌 ?ㅼ뼱???⑥뼱媛 議댁옱?섏? ?딅뒗 寃쎌슦, "?깅줉?섏? ?딆? ?⑥뼱?낅땲??"
		String returnStr = "?깅줉?섏? ?딆? ?⑥뼱?낅땲??";
		if (dictionary.containsKey(word)) {
			returnStr = word + " : " + dictionary.get(word);
		}
		return returnStr;
	}

	public boolean deleteWord(String word) {
		// ?ㅼ뼱???뚮씪誘명꽣???⑥뼱媛믪쓣 ?댁슜?댁꽌 ??젣?섎뒗??. 
		// ??젣媛 ?대（?댁죱?ㅻ㈃ true, ?덈릱?ㅻ㈃ false
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
