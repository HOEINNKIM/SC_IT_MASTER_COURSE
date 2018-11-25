package step0;

/**
 * <pre>
 * SES(Soft Engineer School) 愿由??꾨줈洹몃옩??愿由ъ씤??以?援먯닔??????뺣낫瑜?愿由ы븯???대옒??
 * Human ?대옒?ㅻ? ?곸냽?섍퀬 ?덉쑝硫? Professor 媛앹껜??異붽??곸씤 ?뺣낫???꾧났??硫ㅻ쾭 蹂?섎줈 媛뽯뒗??
 * </pre>
 * */
public class Professor extends Human {
	private String major; //援먯닔???꾧났怨쇰ぉ

	/**
	 * 二쇱뼱吏??대쫫, ?섏씠, 二쇰?踰덊샇, ?꾧났怨쇰ぉ ?뺣낫瑜?媛吏怨??덈줈??Professor 媛앹껜瑜??앹꽦?쒕떎.
	 * @param name 援먯닔???대쫫
	 * @param age 援먯닔???섏씠
	 * @param jumin 援먯닔??二쇰?踰덊샇
	 * @param major 援먯닔???꾧났怨쇰ぉ
	 * */
	public Professor(String name, int age, String jumin, String major) {
		super(name, age, jumin);
		this.major = major;
	}

	/**
	 * ?꾧났怨쇰ぉ??議고쉶?쒕떎.
	 * @return Professor 媛앹껜媛 媛吏怨??덈뒗 ?꾧났怨쇰ぉ
	 * */
	public String getMajor() {
		return major;
	}

	/**
	 * ?덈줈???꾧났怨쇰ぉ?쇰줈 蹂寃쏀븳??
	 * @param major 蹂寃쏀븯怨좎옄 ?섎뒗 ?덈줈???꾧났怨쇰ぉ
	 * */
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	/**
	 * Professor 媛앹껜媛 媛吏怨??덈뒗 ?대쫫, ?섏씠, 二쇰?踰덊샇, ?꾧났怨쇰ぉ ?뺣낫瑜?異쒕젰?쒕떎. 
	 * */
	public void showInfo(){
		super.showInfo();
		System.out.printf(", ?꾧났: %s%n", major);
	}
	
}
