public class Test_181002_02 {
	public static void main(String[] args) {
	//int 배열 a를 b로 복사

		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b = null;

		b =  new int[a.length];
			System.out.println(b.length);
		
		for(int i=0; i<a.length; i++){
			b[i] = a[i];
			System.out.print(b[i] + " ");
		}
		
			System.out.println();

		a[0] = 100;


		for(int i=0; i<a.length; i++){
		
			System.out.print(a[i] + " ");

		}

			System.out.println();

		for(int i=0; i<a.length; i++){
		
			System.out.print(b[i] + " ");

		}


	}
}
