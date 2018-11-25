package step5_1.TestObjectInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import step4_1.TestObjectOutput.PersonVO;

public class TestObjectInput {
/**
 * ?뚯씪濡쒕???媛앹껜瑜???쭅?ы솕?섏뿬 ?쎌뼱?ㅻ뒗 ?덉젣
 * @param args
 */
	public static void main(String[] args) {
		String path = "c:/java-scm/iotest/objecttest/person.ser";

		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			PersonVO pvo = (PersonVO) ois.readObject();
			System.out.println("??쭅?ы솕 ?깃났~!\n" + pvo);
			ois.close();
			fis.close();
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
