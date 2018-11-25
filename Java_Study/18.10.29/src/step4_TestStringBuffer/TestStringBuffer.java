package step4_TestStringBuffer;

public class TestStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("아이유");
		System.out.println(sb1.append("짱"));
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer("아이유짱");
		System.out.println(sb1 == sb2);
		//StringBuffer는 오버라이딩x -> Object의 equals와 동일, ==
		//String 은 equals를 오버라이딩 이미 해서 작성이 되어있으나
		//StringBuffer는 오버라이딩 되어 있지 않음.
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.toString().equals(sb2.toString()));
		System.out.println(sb1.replace(0, 2, "회인스아이"));
		System.out.println(sb1);
		System.out.println(sb1.delete(0, 3));
		System.out.println(sb1);
		StringBuffer sb3 = new StringBuffer("뻐이 장가 가네");
		System.out.println(sb3.reverse());
	}
}