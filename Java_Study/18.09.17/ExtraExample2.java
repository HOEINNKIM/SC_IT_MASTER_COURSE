public class ExtraExample2 {
	public static void main(String[] args) {
		for (int i=1; i<10; i++) {
			System.out.println(" ");



			for(int j=2; j<6; j++) {
			  System.out.print(j + " * " + i + " = " + (j * i) + "  ");
			}
		}
				
		System.out.println(" ");
		
		for (int i=1; i<10; i++) {
			System.out.println(" ");

			for(int k=6; k<10; k++) {
			  System.out.print(k + " * " + i + " = " + (k * i) + "  ");
			}
		}	
	}
}
