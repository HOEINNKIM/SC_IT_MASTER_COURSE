import java.util.Random;

public class Test_181001_04 {
	public static void main(String[] args) {
		System.out.println("랜덤으로 문자열 10개 구해서 배열에 넣기");

		//0~9숫자 쓰게해서 오기
		int arr[] = new int[10];
		Random r = new Random();
		System.out.print("로또 번호 구하기 구하기 : ");


		for(int i = 0; i< 7; i++){		
		arr[i] = r.nextInt(45)+1;
		System.out.print(arr[i]);
		System.out.print(i<6 ? " " : "\n");

		}	
	}
}
