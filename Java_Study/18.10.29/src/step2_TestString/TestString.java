package step2_TestString;

public class TestString {

	public static void main(String[] args) {
		String s1 = "아이유";
		System.out.println(s1.concat("짱")); //순간에만 새로 생성!
		System.out.println(s1);
		StringBuffer sb = new StringBuffer("아이유");
		System.out.println(sb.append("짱"));
		System.out.println(sb);
		//String api
		System.out.println(s1.length()); //길이 3
		System.out.println(s1.indexOf("유")); // 2
		System.out.println(s1.indexOf("z")); // -1 = 해당 키워드 존재X
		System.out.println(s1.charAt(1));
		System.out.println();
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(0));
		System.out.println();
		System.out.println(s1.substring(1, 2)); //의 앞까지만을 다룸
		System.out.println(s1.substring(0, 2));
	
		//StartWith 과 EndsWith
		System.out.println(s1.startsWith("아")); //첫글가 해당 글자로 시작하는가
		System.out.println(s1.startsWith("이"));
		System.out.println(s1.endsWith("유"));
		System.out.println(s1.endsWith("이유"));
		
		
		//trim() - 맨 뒤나 맨 앞의 빈칸을 지워줌
		String s2 = " 아이유 ";
		System.out.println(s1.equals(s2));
		String s3 = s2.trim();	
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.equals(s3));

		//split() - 지정한 문자열 기준으로 분리하여 배열로 리턴
		String s4 = "아이유,소녀시대,티아라";
		System.out.println(s4);
		String [] sa = s4.split(",");
		for(int i = 0 ; i <sa.length; i++) {
			System.out.println(sa[i]);
		}
	}
}
