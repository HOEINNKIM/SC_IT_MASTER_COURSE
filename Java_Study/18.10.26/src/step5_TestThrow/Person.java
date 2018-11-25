package step5_TestThrow;

public class Person {
	int money;
	
	public void setMoney(int money) throws MyException {
		//money媛 ?뚯닔?대㈃ MyException 諛쒖깮
		//?몄텧??怨?硫붿꽌?쒓? 遺덈젮吏?怨??쇰줈 ?먮윭瑜??섏쭊?? (throws)

		if(money < 0 ) {
			throw new MyException("0???댄븯???좊떦 遺덇?!");
		}
		this.money = money;
	}
}