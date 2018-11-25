package LectureExample;

public class Test_181012_02 {

	public static void main(String[] args) {
		//2李⑥썝 諛곗뿴 arr2???닿릿 紐⑤뱺 媛믪쓽 珥앺빀怨??됯퇏??援ы븯???꾨줈洹몃옩
		int[][] arr2= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
		};
		
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[1].length; j++) {
				sum += arr2[i][j];
				count += 1;
			}
			
		}

		double avg = (double)sum/count;
		
		System.out.println("珥앺빀 : " + sum);
		System.out.println("?됯퇏 : " + avg);
		
		
		//寃곌낵 : 325
		//?됯퇏: 16.25
		
	
		
	}

	
}
//arr2[i].length 濡?諛곗뿴 1踰덉㎏ 湲몄씠
//arr2[i].length ? arr2[j].length 濡??섎늿寃?(sum/arr2.length/arr2[i].length)