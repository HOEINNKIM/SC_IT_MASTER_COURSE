package LectureExample;

public class StringText_181010_01 {

	public static void main(String[] args) {
		//String 占쏙옙占쏙옙
		String a = "ABCDEFG";
		System.out.println(a);
		String b = new String("ABCDEFG");
		System.out.println(b);
		System.out.println(a.equals(b));
		String c= "abcdefg";
		System.out.println(a.equals(c));

		//indexOf()
		System.out.println(a.indexOf("A"));
		System.out.println(a.indexOf("E"));
		System.out.println(a.indexOf("H"));
		
		//substring()
		System.out.println(a.substring(4));
		System.out.println(a.substring(1, 6));

		//replaceAll()
		System.out.println(a.replaceAll("EFG", "EFGH"));
		String s = "HelloWorld";
		System.out.println(s.replace('l', 'o'));
		
		//toUpperCase
		System.out.println(s.toUpperCase());
		//toLowerCase
		System.out.println(s.toLowerCase());
		
		//charAt
		String m = "abcdefg";
		System.out.println(m.charAt(6));
		
		//concat
		System.out.println(m.concat("hij"));

		//isEmpty
		System.out.println(m.isEmpty());
		String x = "";
		System.out.println(x.isEmpty());
	}

}
