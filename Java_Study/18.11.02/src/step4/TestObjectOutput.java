package step4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutput {
	/**
	 * 媛앹껜 吏곷젹?붾? ?섏뿬 ?뚯씪濡???ν븯???덉젣
	 * @param args
	 */
	public static void main(String[] args) {
		String path = "c://java-scm//iotest//objecttest//person.ser";
		File f = new File(path);
		f.getParentFile().mkdirs();
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			PersonVO pvo = new PersonVO("源吏??, "kim123456789");
			oos.writeObject(pvo);
			oos.close();
			fos.close();
			System.out.println("媛앹껜 吏곷젹???깃났~!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}





