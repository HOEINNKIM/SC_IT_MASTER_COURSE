package step7_TestSingleton2;

public class Company {

	private String info = "회사정보";
	
	//클래스 로딩 시에 초기화 되는 static을 이용해 단 한번만 생성.
	public Company company = new Company(); 
	// static으로 생성하는 이유 - getinstance 할때마다 새로운 객체를 생성하는 것을 막기 위해서? - 기존의 객체만 사용하게 하기 위해서?
	// 근데 이미 company는 getinstance 코드 상 위에서 설정을 한 것(마치 int i = 0으로 설정한 것 같이)인데 static 없으면 그래도 객체가 새로 생성되나?
	// set이 없어서 그런거지 set을 사용한다는 가정하에 static을 사용한 것인지?
		
	//외부에서 객체 생성을 못하도록 한다.
	public Company() {};

	// 외부에서 사용할 수 있는 static 메서드를 공유한다.
	public Company getInstance() {
		return company;
	};

	public String getInfo() {
		return info;
		
	}
	
}
