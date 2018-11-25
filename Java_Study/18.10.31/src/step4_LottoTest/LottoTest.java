package step4_LottoTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		LottoManager manager = new LottoManager();
		ArrayList<HashSet<Integer>> numbers = null;
		Scanner input = new Scanner(System.in);
		
		while(true){
			displayMainMenu();
			int num = input.nextInt();
			switch(num){
				case 1: System.out.print("구매하고자 하는 게임 횟수를 입력 하세요 :");
						int games = input.nextInt();
						numbers = new ArrayList<HashSet<Integer>>();
						for(int i=1; i<= games; i++){
							System.out.printf("[%d번째 게임] 직접선택(1)/자동선택(2):",i);
							int choice = input.nextInt();
							if(choice == 1) 
								numbers.add(manager.inputLottoNumbers());
							else if(choice == 2) {
								HashSet<Integer> auto = manager.makeLottoNumbers();
								System.out.printf("자동 선택 번호:%s%n", auto);
								numbers.add(auto);
							} else {
								System.out.println("-- 1 또는 2만 입력하세요 --");
								i--;
								continue;
							}//else								
						}//for
					break;
				case 2: System.out.println("== 구매한 로또번호 ==");
						if(numbers == null || numbers.size()==0){
							System.out.println("로또를 먼저 구매하세요!");
						} else {
							int index = 1;
							for(HashSet<Integer> lotto_num : numbers)
								System.out.printf("%d번째 게임: %s%n", index++, lotto_num);
						}
					break;
				case 3: HashSet<Integer> computer = manager.makeLottoNumbers();
						String s_rank [] = {"꽝","꽝","4등","3등","2등","1등"};
						if(numbers == null || numbers.size()==0){
							System.out.println("로또를 먼저 구매하세요!");
						} else {
							System.out.printf("금주 로또 당첨 번호는: %s%n", computer);
							ArrayList<Integer> result = manager.evaluateResult(computer, numbers);
							for(int i=0; i<numbers.size();i++){
								System.out.printf("%d번째 로또번호 맞춘 개수: %s, 당첨결과: %s%n",i+1, result.get(i), s_rank[result.get(i)]);
							}//for
						}//else
					break;
				case 4: System.exit(0);
					break;
				default: System.out.println("-- Input Error --");
			}//case
		}//while
	}
	
	public static void displayMainMenu(){
		System.out.println("========================");
		System.out.println("[행복 로또 게임을 시작하겠습니다.]");
		System.out.println("========================");
		System.out.println("1. 로또 구매");
		System.out.println("2. 구매한 로또번호 확인");
		System.out.println("3. 추첨결과 확인");
		System.out.println("4. 종료");
		System.out.print("메뉴을 선택하세요 :");
	}

}
