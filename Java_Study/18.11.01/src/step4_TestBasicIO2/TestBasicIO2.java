package step4_TestBasicIO2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBasicIO2 {

	public static void main(String[] args) {
		//파일을 읽는 노드스트림
		try {
			FileReader fr = new FileReader("C:\\\\ioTest\\\\outer.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없다.");			
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("읽기 실패");
			e.printStackTrace();
		}
	}

}
