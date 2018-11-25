package calc;

public class TestCalc01 {
	public static void main(String[] args) {
		// main硫붿꽌?쒖뿉??媛곴컖 ?몄텧?섍퀬 怨꾩궛??寃곌낵瑜?return諛쏆븘 main硫붿꽌?쒖뿉??異쒕젰
		// ?몄텧?⑥닔 : sum(3,5) sub(7,2) mul(4,5) div(7,3)
		// ?ㅽ뻾寃곌낵 :
		// ?뷀븯湲?: 8
		// 鍮쇨린 : 5
		// 怨깊븯湲?: 20
		// ?섎늻湲?: 2.3333333
		
		Calc01 c = new Calc01();
		
		c.sum(3, 5);
		c.sub(7, 2);
		c.mul(4, 5);
		c.div(7, 3);
		System.out.println(c.sum(3, 5));
		System.out.println(c.sub(7, 2));
		System.out.println(c.mul(4, 5));
		System.out.println(c.div(7, 3));
	}
}
