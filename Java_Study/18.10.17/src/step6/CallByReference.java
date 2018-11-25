package step6;

class CallByReference{

	int value; 					//저장할 멤버변수 할당
	

	CallByReference(int value) {
		this.value = value;
	}							//생성자 호출하여 멤버변수 초기화


	public static void swap(CallByReference x, CallByReference y) {
		int temp = x.value;
		x.value = y.value;
		y.value = temp;	
	}							//각 객체의 주소값(참조값 혹은 Reference)을 가지고 와서 swap 작업.




	public static void main(String[] args) {
		CallByReference a = new CallByReference(10);							//객체 a 생성
		CallByReference b = new CallByReference(20);							//객체 b 생성
		System.out.println("swap() 호출 전 : a = " + a.value + ", b = " + b.value);//swap 호출 전 a와 b의 값
		swap(a, b);																
					//swap 호출 -> 매개변수의 주소값을 바탕으로 swap매서드를 통해 값을 변환 -> 주소값에 해당하는 값이 변환되었으므로 매개변수로 사용된 a와 b의 값 치환
		System.out.println("swap() 호출 전 : a = " + a.value + ", b = " + b.value);//swap 호출 후 a와 b의 값
	}							

}	
