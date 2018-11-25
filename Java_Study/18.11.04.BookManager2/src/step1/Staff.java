package step1;

/**
 * <pre>
 * SES(Soft Engineer School) 愿由??꾨줈洹몃옩??愿由ъ씤??以??댁쁺吏꾩뿉 ????뺣낫瑜?愿由ы븯???대옒??
 * Human ?대옒?ㅻ? ?곸냽?섍퀬 ?덉쑝硫? Staff 媛앹껜??異붽??곸씤 ?뺣낫??遺?쒕? 硫ㅻ쾭 蹂?섎줈 媛뽯뒗??
 * </pre>
 * */
public class Staff extends Human {
	private String field; //?댁쁺吏꾩쓽 遺??

	/**
	 * 二쇱뼱吏??대쫫, ?섏씠, 二쇰?踰덊샇, 遺???뺣낫瑜?媛吏怨??덈줈??Staff 媛앹껜瑜??앹꽦?쒕떎.
	 * @param name ?댁쁺吏꾩쓽 ?대쫫
	 * @param age ?댁쁺吏꾩쓽 ?섏씠
	 * @param jumin ?댁쁺吏꾩쓽 二쇰?踰덊샇
	 * @param field ?댁쁺吏꾩쓽 遺??
	 * */
	public Staff(String name, int age, String jumin, String field) {
		super(name, age, jumin);
		this.field = field;
	}

	/**
	 * 遺?쒕? 議고쉶?쒕떎.
	 * @return Staff 媛앹껜媛 媛吏怨??덈뒗 遺??
	 * */
	public String getField() {
		return field;
	}

	/**
	 * ?덈줈??遺?쒕줈 蹂寃쏀븳??
	 * @param field 蹂寃쏀븯怨좎옄 ?섎뒗 ?덈줈??遺??
	 * */
	public void setField(String field) {
		this.field = field;
	}
	
	@Override
	/**
	 * Staff 媛앹껜媛 媛吏怨??덈뒗 ?대쫫, ?섏씠, 二쇰?踰덊샇, 遺???뺣낫瑜?異쒕젰?쒕떎.
	 * */
	public void showInfo() {
		super.showInfo();
		System.out.printf(", 遺?? %s%n", field);
	}
	
}
