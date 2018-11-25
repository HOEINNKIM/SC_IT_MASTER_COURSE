﻿package step1;

/**
 * <pre>
 * SES(Soft Engineer School) 愿由??꾨줈洹몃옩???낅Т濡쒖쭅??愿由ы븯???대옒??
 * 二쇱슂 湲곕뒫?쇰줈???ㅼ쓬怨?媛숇떎.
 * 1. ?좉퇋 愿由ъ씤???깅줉
 * 2. ?깅줉?몄썝 寃??
 * 3. ?깅줉?몄썝 ??젣
 * 4. ?꾩껜 ?깅줉?몄썝 異쒕젰
 * </pre>
 * */
public class SESManager {
	private Human [] h; //愿由ъ씤??援먯닔, ?곗닔?? ?댁쁺吏? 媛앹껜瑜???ν븷 ???怨듦컙
	private int index;  //諛곗뿴??愿由ъ씤?먯쓣 ?깅줉????諛곗뿴 諛⑹쓽 ?꾩튂媛믪쑝濡??ъ슜??媛? 0遺???쒖옉?섏뿬 ?쒕챸???깅줉???뚮쭏??1??利앷?
	private final int MAX_SIZE = 50;	// 愿由ъ씤??理쒕? ????ш린
	
	/**
	 * 二쇱뼱吏?size??珥덇린媛믪쑝濡??덈줈??SESManager ?대옒?ㅼ쓽 媛앹껜瑜??앹꽦?쒕떎.
	 * @param size 愿由???곸씠 ?섎뒗 援먯닔, ?곗닔?? ?댁쁺吏?媛앹껜瑜???ν븷 Human ???諛곗뿴???ш린
	 * */
	public SESManager(){
		// 理쒕? ????ш린濡????怨듦컙??珥덇린?뷀븳??
		h = new Human[MAX_SIZE];
	}
	
	/**
	 * ?덈줈??Human 媛앹껜瑜??깅줉?쒕떎.
	 * @param human ?깅줉??Professor, Trainee, Staff ?대옒?ㅼ쓽 媛앹껜
	 * */
	public void insertHuman(Human human){
		// h??index ?꾩튂??human???ｊ퀬 index瑜??섎굹 ?섎┛??
		if (index >= MAX_SIZE) {
			System.out.println("[?먮윭] ???댁긽 ?ｌ쓣 ???놁뒿?덈떎. ?꾩슂 ?녿뒗 ?뺣낫瑜???젣??二쇱꽭??");
			return;
		}
		
		// 以묐났??二쇰?踰덊샇?몄? ?뺤씤
		Human find_h = findHuman(human.getJumin());
		if (find_h != null) {
			System.out.println("[?먮윭] ?대? ?깅줉??二쇰?踰덊샇?낅땲??");
			return;
		}
		
		// Human 媛앹껜瑜??깅줉?섍퀬 ?몃뜳?ㅻ? ?섎굹 ?섎┛??
		h[index++] = human;
	}

	/**
	 * ?깅줉??Human 媛앹껜瑜?寃?됲븳??
	 * @param jumin 寃?됲븷 Human??二쇰?踰덊샇
	 * @return Human 諛곗뿴???깅줉??媛앹껜??以??뚮씪硫뷀꽣濡??꾨떖??二쇰?踰덊샇? ?쇱튂?섎뒗 Human 媛앹껜, 寃??寃곌낵媛 ?놁쓣 ??null??諛섑솚?쒕떎.
	 * */
	public Human findHuman(String jumin){
		Human find_human = null;

		// h 諛곗뿴?먯꽌 jumin怨??쇱튂?섎뒗 Human媛앹껜瑜?寃?됲븳??
		for(int i = 0; i < index; i++) {
			if(jumin.equals(h[i].getJumin())) {
				// ?쇱튂?섎㈃ find_human 蹂?섏뿉 ?깅줉?쒕떎
				find_human = h[i];
				break;
			}
		}
		
		return find_human;
	}

	/**
	 * ?깅줉??Human 媛앹껜瑜???젣?쒕떎.
	 * @param jumin ??젣??Human??二쇰?踰덊샇
	 * @return 二쇱뼱吏?二쇰?踰덊샇? ?쇱튂?섎뒗 Human 媛앹껜????젣 寃곌낵, Human 諛곗뿴???깅줉??媛앹껜??以??뚮씪硫뷀꽣濡??꾨떖??二쇰?踰덊샇? ?쇱튂?섎뒗 Human 媛앹껜媛 諛쒓껄?섏뼱 ??젣瑜??깃났?섎㈃ true瑜?洹몃젃吏 ?딆쑝硫?false瑜?諛섑솚
	 * */
	public boolean deleteHuman(String jumin){
		boolean result = false;
		
		// ?꾩옱 ?몃뜳?ㅻ뒗 理쒓렐 異붽????곗씠???댄썑??怨듦컙??媛由ы궎怨??덇린 ?뚮Ц??-1???쒕떎
		for (int i = 0; i < index; i++) {
			
			// 二쇰?踰덊샇媛 ?쇱튂??寃쎌슦
			if(jumin.equals(h[i].getJumin())) {
				for(int j = i; j < index - 1; j++) {
					// ??젣???곗씠?곕? ?욎쑝濡??↔꺼????뼱?뚯?
					h[j] = h[j + 1];
				}
				
				result = true;
				index--;
			}
		}
		
		return result;
	}

	/**
	 * ?깅줉??紐⑤뱺 Human 媛앹껜 ?뺣낫瑜?異쒕젰?쒕떎.
	 * */
	public void showAll(){
		for(int i = 0; i < index; i++) {
			h[i].showInfo();
		}
	}
}


//index 媛믪쓣 以꾩씤?ㅺ퀬human 媛앹껜?먯꽌 ??낅맂 留덉?留?媛믪씠 ?щ씪吏??寃껋? ?꾨땲吏 ?딆쓣源?