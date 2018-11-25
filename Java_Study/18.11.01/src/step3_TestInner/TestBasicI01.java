package step3_TestInner;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestBasicI01 {

	public static void main(String[] args) {
		//File 을 생성하고 기록하는 기본예제
		
		try {
			//file에 연결되는 16bit짜리 출력 스트림 - node stream 계열
			FileWriter fw = new FileWriter("C:\\ioTest\\outer.txt");
			System.out.println("FileWriter 생성!");
			//process stream 생성자에 node stream 객체를 파라미터로 넣어줌
			PrintWriter pw = new PrintWriter(fw);
			pw.println("우사기데고자이스!");
			pw.close();
		} catch (IOException e) {
			System.out.println("IOException 이다닷");
			e.printStackTrace();
		}	
	}
}