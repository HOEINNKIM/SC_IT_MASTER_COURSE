package apple;

import java.util.Scanner;

public class TestCompute {

	public static void main(String[] args) {
		//媛믪쓣 ?낅젰諛쏆븘 硫붿꽌???몄텧?섏뿬 泥섎━
		//議곌굔1.?낅젰諛쏆? 媛믪쓣 compute(item,tqy,price)?먯꽌 泥섎━
		//議곌굔2.怨꾩궛諛⑸쾿:湲덉븸=?섎웾X?④?
		//?ㅽ뻾寃곌낵:
		//-?낅젰-
		//?덈챸:apple
		//?섎웾:10
		//?④?:12000
		//
		//-異쒕젰-
		//?덈챸:apple
		//?④?:120000
		Scanner input = new Scanner(System.in);
		String item = input.nextLine();
		int qty = input.nextInt();
		int price = input.nextInt();
		Compute myCom = new Compute();
		myCom.compute(item, qty, price);
	}

}
