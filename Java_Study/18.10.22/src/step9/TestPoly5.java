package step9;

public class TestPoly5 {

	public static void main(String[] args) {
		Employee e = new Employee("K1", "김회인", 200);
		Manager m = new Manager("K2", "기뫼인", 300, "영업부");
		Engineer en = new Engineer("K3", "기무웨인", 400, "자바");
		HrMgr mgr = new HrMgr();
		mgr.printAnnualSaraly(e);
		System.out.println(e.toString());
		mgr.printAnnualSaraly(m);
		mgr.printAnnualSaraly(en);
		

	
	}

}
