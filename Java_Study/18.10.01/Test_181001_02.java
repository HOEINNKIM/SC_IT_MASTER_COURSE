import java.util.Scanner;

public class Test_181001_02 {
	public static void main(String[] args) {
		System.out.println("메뉴번호 및 메뉴명을 입력받아서 출력하기");

		Scanner input = new Scanner(System.in);

		int num = 0;
		String[] menu = new String[3];		
		int[] price = new int[3];
		int count = 0;


		for(int i = 0; ; i++){
				
			System.out.println("번호를 선택하시오");
			System.out.println("1. 메뉴 등록, 2. 출력, 0. 종료");
			System.out.print("번호 : ");
			num = input.nextInt();
				
				if(num ==1){
				
					if(count >= 3){
					System.out.println("3개를 넘어 등록시도하였습니다.");
					break;
					}
										
			System.out.println("등록할 메뉴명을 입력하세요");
			System.out.print("메뉴명 : ");			
			
					if(i<=2){
						menu[i] = input.next();									
					}

			System.out.println("가격을 등록하세요");	
			System.out.print("가격 : ");
		
					if(i<=2){
						price[i] = input.nextInt();
								
					}	
				
				count += 1;								
				
				} else if(num == 2){
					
					for(int j=0; j<3; j++){
				
							if(menu[j]!=null){
							System.out.println(menu[j] + " : " + price[j]);
							}

					}												
				} else if(num == 0){
					break;
			
				} else {
					System.out.println("잘못 입력하였습니다.");										
				}	
		}	
	}
}
	/*
	실행화면 : 
	번호를 선택하시오
	1. 메뉴등록, 2. 출력, 0. 종료
	번호 : 1(입력하는것이다.);
	등록할 메뉴명을 입력하세요
	메뉴명 : 테스트메뉴(입력하는 것이다.);
	가격을 등록해 주세요
	가격 : 10000(이렇게 입력을 한다.)

	번호를 선택하시오
	1. 메뉴등록, 2. 출력, 0. 종료
	번호 : 2(입력하는 것이다.);
	테스트메뉴 : 10000

	번호를 선택하시오
	1. 메뉴등록, 2. 출력, 0. 종료
	번호 : 1
	메뉴명 : 메뉴는 3개만 등록되고, 3개가 등록되면서 1을 누르면 
	"더이상 등록할 수 없습니다.
	
	번호를 선택하시오
	1. 메뉴등록, 2. 출력, 0. 종료
	번호 : 0
	(프로그램 종료) System.exit(0);
	break쓰게하기
	
	*/
