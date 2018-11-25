package step6_TestThrow2;

import java.io.FileNotFoundException;

public class TestThrow2 {

	public static void main(String[] args) {
		Editor e = new Editor();
		//議댁옱?섏? ?딅뒗 ?뚯씪紐낆쓣 ?낅젰??寃쎌슦 : 3 4 5
		//議댁옱?섎뒗 ?뚯씪紐낆쓣 ?낅젰??寃쎌슦 : 1 2 4 5

		try {
			e.read("c://setup.okr");
			System.out.println(2);
		} catch (FileNotFoundException e1) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		System.out.println(5);
	}
}
