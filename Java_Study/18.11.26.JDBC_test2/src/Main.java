import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Manager mg = new Manager();	//DAO 객체를 불러와 실행.
		/*ArrayList<Member> got = mg.select2();
		
		if(got!=null) {
			for(int i = 0 ; i < got.size(); i++) {
				System.out.println("ID(" + i + ") : " + got.get(i).getId());
				System.out.println("Name(" + i + ") : " + got.get(i).getName());
				System.out.println("Password(" + i + ") : " + got.get(i).getPassword());			
			}			

			int count = 1;
			for(Member i : got) {
				System.out.println("Select2 아이디는(" + count +")" + i.getId());
				System.out.println("Select2 이름은(" + count + ")" + i.getName());
				System.out.println("Select2 비번은 (" + count + ")" + i.getPassword());
				count++;
			}
		
		} else {
			System.out.println("값이 없음");
		}*/
		mg.insert();
	}
}