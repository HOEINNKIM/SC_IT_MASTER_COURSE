import java.util.Scanner;
public class Test_181001_02_answer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("메뉴번호 및 메뉴명을 입력받아서 출력하기");
		// 실행화면 :
		// 번호를 선택하시오
		// 1.메뉴등록, 2.출력, 0.종료
		// 번호 : 1(입력하는거에요)
		// 등록할 메뉴명을 입력하세요
		// 메뉴명 : 테스트메뉴(입력하는겁니다)
		// 가격을 등록해 주세요
		// 가격 : 10000(이렇게 입력을하면 됩니다)
		// 
		// 번호를 선택하시오
		// 1.메뉴등록, 2.출력, 0.종료
		// 번호 : 2(입력하는거에요)
		// 테스트메뉴 : 10000
		// 
		// 번호를 선택하시오
		// 1.메뉴등록, 2.출력, 0.종료
		// 번호 : 1(이미 3개의 메뉴가 등록된 후라면,)
		// 더이상 등록할 수 없습니다.
		// 
		// 번호를 선택하시오
		// 1.메뉴등록, 2.출력, 0.종료
		// 번호 : 0
		// (프로그램종료)
		int num = 0;
		String[] menuName = new String[3];
		int[] cost = new int[3];
		int count = 0;
		do {
			System.out.println("번호를 선택하시오");
			System.out.println("1.메뉴등록, 2.출력, 0.종료");
			System.out.print("번호 : ");
			num = input.nextInt();
			if (num == 0) {
				System.out.println("(프로그램종료)");
			} else if (num == 1) {
				// 이미 3개의 메뉴가 등록되었는지 체크
				if (count < 3) {
					// 메뉴등록
					System.out.println("등록할 메뉴명을 입력하세요");
					System.out.print("메뉴명 : ");
					String menu = input.next();
					System.out.println("가격을 등록해 주세요");
					System.out.print("가격 : ");
					int money = input.nextInt();
					// 배열에 등록
					menuName[count] = menu;
					cost[count] = money;
					// 배열의 등록 이후 처리
					count++;
				} else {
					System.out.println("더이상 등록할 수 없습니다.");
				}
			} else if (num == 2) {
				// 메뉴명의 첫번째에 해당하는 배열이 null인지 체크
				if (menuName[0] == null) {
					System.out.println("등록된 메뉴가 하나도 없네요.\n");
					continue;
				}
				// 메뉴들을 전체출력
				for (int i = 0; i < menuName.length; i++) {
					if (menuName[i] != null) {
						System.out.println(menuName[i] + " : " + cost[i]);
					}
				}
			} else {
				System.out.println("잘못 입력하셨네요.");
			}
			System.out.println();
		} while (num != 0);
	}
}
