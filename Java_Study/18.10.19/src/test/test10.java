package test;

import java.util.Scanner;

public class test10 {
	/*
	 * 문제10] 4개의 값을 콘솔에서 입력받아 처리하세요
	    조건) 성별 : M 이면 "남자", 나머지 "여자"  (삼항연산자 이용)
		실행결과 :
		Input name: 장미란
		Input gender: F
		Input age:  25
		Input tall: 173.3 
		
		이름 : 장미란
		성별 : 여자 
		나이 : 25세
		신장 : 173.3cm  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input name : ");
		String name = sc.nextLine();
		System.out.print("Input gender : ");
		String gender = sc.nextLine();
		System.out.print("Input age : ");
		int age = sc.nextInt();
		System.out.print("Input tall : ");
		float tall =sc.nextFloat();
		
		System.out.println("이름 : "+name);
		System.out.println("성별 : " + (gender.equals("F") ? "남자" : "여자"));
		System.out.println("나이 : "+age);
		System.out.println("신장 : " + (String.format("%.1f", age)));
	}
}
