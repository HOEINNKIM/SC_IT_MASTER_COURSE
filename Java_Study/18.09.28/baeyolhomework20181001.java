class baeyolhomework20181001 {
 public static void main(String[] args) {
  int[] arr = {1, 3, 4, 8, 13, 17, 20};
  int minDistance = 0;
  String result = null;

  int c = 0;

  for (int i = 0; i < arr.length; i++) {
   for (int j = i + 1; j <arr.length; j++) {
    
		if (arr[i] - arr[j] > 0){
		 c = arr[i] - arr[j];
		} else{
		 c = -(arr[i] - arr[j]);    
		}
    

		if(minDistance == 0){
		 minDistance = c;
		 result = arr[i] + ", " + arr[j];

		} else {

			 if(minDistance > c){
			  minDistance = c;
			  result = arr[i] + ", " + arr[j];
			 } else{
			 
			 }
		}    
		
	}
   }
  
  System.out.println(result);
 }
} 
