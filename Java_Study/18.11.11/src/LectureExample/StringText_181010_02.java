package LectureExample;

public class StringText_181010_02 {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println("Length : " + str.length());
		
		System.out.println(str.replace('l', 't'));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 4));
		
		System.out.println(str.indexOf("he"));
		System.out.println();
		System.out.println(str.indexOf("he",1));
		System.out.println(str.indexOf('l'));
		
		System.out.println(str.lastIndexOf('l', 4));
		System.out.println(str.lastIndexOf('l', 2));
		System.out.println(str.lastIndexOf('h', 1));
		
		String str1 = "mad dog";
		String str2 = "mad cat";
		
		System.out.println(str2.compareTo(str1));
		System.out.println(str1.compareTo(str2));
	}

}
