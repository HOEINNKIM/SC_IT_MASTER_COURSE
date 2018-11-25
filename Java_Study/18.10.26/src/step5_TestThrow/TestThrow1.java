package step5_TestThrow;

public class TestThrow1 {

	public static void main(String[] args) {

		Person p = new Person();
			
		try {
			p.setMoney(1);	
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	
		System.out.println("洹??댄븯 泥섎━?댁슜? ?뺤긽 泥섎━!");
	}
}
