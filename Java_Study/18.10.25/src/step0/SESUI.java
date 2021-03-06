﻿package step0;

import java.util.Scanner;

/**
 * <pre>
 * SES(Soft Engineer School) 愿由??꾨줈洹몃옩???ъ슜???붾㈃(User Interface) ?대옒??
 * ?ъ슜?먮줈遺??泥섎━? 愿?⑤맂 ?낅젰??諛쏄퀬, SESManager ?대옒?ㅻ? ?듯빐 泥섎━??寃곌낵瑜?蹂댁뿬以??
 * </pre>
 */
public class SESUI {
	private SESManager manager = new SESManager(); //?붿껌怨?愿?⑤맂 泥섎━瑜??섍린 ?꾪빐 ?앹꽦??SESManager ?대옒?ㅼ쓽 媛앹껜
	private Scanner sc = new Scanner(System.in); //?ㅻ낫?쒕줈遺???뺣낫瑜??낅젰諛쏄린 ?꾪빐 ?앹꽦??Scanner ?대옒?ㅼ쓽 媛앹껜
	
	/**
	 * <pre>
	 * SES(Soft Engineer School) 愿由??꾨줈洹몃옩???ъ슜???붾㈃??援ъ꽦?섍퀬 ?ъ슜???낅젰???湲고븳??
	 * ?꾨줈洹몃옩? 醫낅즺 硫붾돱瑜??좏깮?섍린 ?꾧퉴吏 臾댄븳 諛섎났?섏뿬 泥섎━ ?쒕떎.
	 * </pre> 
	 * */
	public SESUI(){
		while(true){
			printMainMenu();
			int no = sc.nextInt();
			switch(no){
				case 1: insertHuman();
					break;
				case 2: System.out.print("|二쇰?踰덊샇 | ");
						String find_jumin = sc.next();
						Human find_h = manager.findHuman(find_jumin);
						if(find_h == null)
							System.out.println("寃??寃곌낵媛 ?놁뒿?덈떎.");
						else 
							find_h.showInfo();
					break;
				case 3: System.out.print("|二쇰?踰덊샇 | ");
						String delete_jumin = sc.next();
						boolean delete_result = manager.deleteHuman(delete_jumin);
						if(delete_result)
							System.out.println("?뺤긽?곸쑝濡???젣 ?섏뿀?듬땲??");
						else
							System.out.println("??뜲???곗씠?곌? ?놁뒿?덈떎.");
					break;
				case 4: manager.showAll();
					break;
				case 9: System.exit(0);
					break;
				default:
			}//switch
		}//while
	}
	
	/**
	 * <pre>
	 * SES(Soft Engineer School) 愿由??꾨줈洹몃옩???깅줉 硫붾돱?????泥섎━瑜??대떦?쒕떎.
	 * 愿由ъ씤??援먯닔, ?곗닔?? ?댁쁺吏???????깅줉???쒕툕 硫붾돱濡?蹂댁뿬二쇨퀬, ?낅젰諛쏆? Professor, Trainee, Staff 媛앹껜瑜?SESManager瑜??듯빐 ?깅줉?쒕떎.
	 * </pre>
	 * */
	public void insertHuman(){
		while(true){
			printInsertMenu();
			int no = sc.nextInt();
			switch(no){
				case 1: Professor p = makeProfessor();
						manager.insertHuman(p);
					break;
				case 2: Trainee t = makeTrainee();
						manager.insertHuman(t);
					break;
				case 3: Staff s = makeStaff();
						manager.insertHuman(s);
					break;
				case 4: return;
				default:
			}//switch
		}//while
	}
	
	/**
	 * SES(Soft Engineer School) 愿由??꾨줈洹몃옩??硫붿씤 硫붾돱瑜?異쒕젰?쒕떎.
	 * */
	public void printMainMenu(){
		System.out.println("?뚢????????????????????????????????);
		System.out.println("??Soft Engineer School 愿由??쒖뒪????);
		System.out.println("?붴????????????????????????????????);
		System.out.println("?뚢????????????????????????????????);
		System.out.println("??.?깅줉?????????????????????);	
		System.out.println("??.李얘린?????????????????????);	
		System.out.println("??.??젣?????????????????????);	
		System.out.println("??.?꾩껜異쒕젰???????????????????);	
		System.out.println("??.醫낅즺?????????????????????);
		System.out.println("?붴????????????????????????????????);
		System.out.print(" 硫붾돱 踰덊샇瑜??좏깮?섏꽭??> ");	
	}
	
	/**
	 * SES(Soft Engineer School) 愿由??꾨줈洹몃옩??愿由ъ씤???깅줉 ?쒕툕 硫붾돱瑜?異쒕젰?쒕떎.
	 * */
	public void printInsertMenu(){
		System.out.println("?뚢????????????????????????????????);
		System.out.println("?귙?????SES 愿由ъ씤???깅줉?????????);
		System.out.println("?붴????????????????????????????????);
		System.out.println("?뚢????????????????????????????????);
		System.out.println("??.援먯닔?????????????????????);	
		System.out.println("??.?곗닔?앫???????????????????);	
		System.out.println("??.?댁쁺吏꾠???????????????????);	
		System.out.println("??.?곸쐞硫붾돱???????????????????);
		System.out.println("?붴????????????????????????????????);
		System.out.print(" 硫붾돱 踰덊샇瑜??좏깮?섏꽭??> ");	
	}
	
	/**
	 * 援먯닔?뺣낫瑜??ㅻ낫?쒕줈 ?낅젰諛쏆븘 Professor 媛앹껜瑜??앹꽦?섏뿬 諛섑솚?쒕떎.
	 * @return ?ㅻ낫?쒕줈 ?낅젰諛쏆? ?대쫫, ?섏씠, 二쇰?踰덊샇, ?꾧났怨쇰ぉ ?뺣낫瑜?媛吏怨?Professor 媛앹껜瑜??앹꽦
	 * */
	public Professor makeProfessor(){
		Professor p = null;
		System.out.print("|?대쫫| ");
		String name = sc.next();
		System.out.print("|?섏씠| ");
		int age = sc.nextInt();
		System.out.print("|二쇰?踰덊샇| ");
		String jumin = sc.next();
		System.out.print("|?꾧났| ");
		String major = sc.next();
		p = new Professor(name, age, jumin, major);
		return p;
	}
	
	/**
	 * ?곗닔?앹젙蹂대? ?ㅻ낫?쒕줈 ?낅젰諛쏆븘 Trainee 媛앹껜瑜??앹꽦?섏뿬 諛섑솚?쒕떎.
	 * @return ?ㅻ낫?쒕줈 ?낅젰諛쏆? ?대쫫, ?섏씠, 二쇰?踰덊샇, ?숇쾲 ?뺣낫瑜?媛吏怨?Trainee 媛앹껜瑜??앹꽦
	 * */
	public Trainee makeTrainee(){
		Trainee t = null;
		System.out.print("|?대쫫| ");
		String name = sc.next();
		System.out.print("|?섏씠| ");
		int age = sc.nextInt();
		System.out.print("|二쇰?踰덊샇| ");
		String jumin = sc.next();
		System.out.print("|?숇쾲| ");
		String stdNo = sc.next();
		t = new Trainee(name, age, jumin, stdNo);
		return t;
	}
	
	/**
	 * ?댁쁺吏꾩젙蹂대? ?ㅻ낫?쒕줈 ?낅젰諛쏆븘 Staff 媛앹껜瑜??앹꽦?섏뿬 諛섑솚?쒕떎.
	 * @return ?ㅻ낫?쒕줈 ?낅젰諛쏆? ?대쫫, ?섏씠, 二쇰?踰덊샇, 遺???뺣낫瑜?媛吏怨?Staff 媛앹껜瑜??앹꽦
	 * */
	public Staff makeStaff(){
		Staff s = null;
		System.out.print("|?대쫫| ");
		String name = sc.next();
		System.out.print("|?섏씠| ");
		int age = sc.nextInt();
		System.out.print("|二쇰?踰덊샇| ");
		String jumin = sc.next();
		System.out.print("|遺?? ");
		String field = sc.next();
		s = new Staff(name, age, jumin, field);
		return s;
	}
}
