package step4_1.TestObjectOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutput {
/**
 * 媛앹껜 吏곷젹?붾? ?섏뿬 ?뚯씪濡???ν븯???덉젣
 * 
 */
	public static void main(String[] args) {
		String path = "c:/java-scm/iotest/objecttest/person.ser";
		File f = new File(path);
		f.getParentFile().mkdirs();
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			PersonVO pvo = new PersonVO("源?뚯씤", "湲곕ゼ??);			
			oos.writeObject(pvo);
			oos.close();
			fos.close();
			System.out.println("媛앹껜 吏곷젹???깃났~!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

