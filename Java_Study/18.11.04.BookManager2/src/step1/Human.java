package step1;

/**
 * <pre>
 * SES(Soft Engineer School) 愿由??꾨줈洹몃옩??愿由ъ씤??Professor, Trainee, Staff) ?대옒?ㅼ쓽 ?덊띁 ?대옒??
 * 愿由ъ씤???대옒?ㅻ뱾??怨듯넻 ?띿꽦???대쫫, ?섏씠, 二쇰?踰덊샇瑜?硫ㅻ쾭 蹂?섎줈 媛뽯뒗??
 * </pre>
 * */
public class Human {

	private String name;  //愿由ъ씤???대쫫
	private int age;	  //愿由ъ씤???섏씠
	private String jumin; //愿由ъ씤??二쇰?踰덊샇
	
	/**
	 * 二쇱뼱吏??대쫫, ?섏씠, 二쇰?踰덊샇 ?뺣낫瑜?媛吏怨??덈줈??Human 媛앹껜瑜??앹꽦?쒕떎.
	 * @param name 援ъ꽦?먯쓽 ?대쫫
	 * @param age 援ъ꽦?먯쓽 ?섏씠
	 * @param jumin 援ъ꽦?먯쓽 二쇰?踰덊샇
	 * */
	public Human(String name, int age, String jumin) {
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	/**
	 * ?대쫫??議고쉶?쒕떎.
	 * @return Human 媛앹껜媛 媛吏怨??덈뒗 ?대쫫
	 * */
	public String getName() {
		return name;
	}

	/**
	 * ?덈줈???대쫫?쇰줈 蹂寃쏀븳??
	 * @param name 蹂寃쏀븯怨좎옄 ?섎뒗 ?덈줈???대쫫
	 * */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ?섏씠瑜?議고쉶?쒕떎.
	 * @return Human 媛앹껜媛 媛吏怨??덈뒗 ?섏씠
	 * */
	public int getAge() {
		return age;
	}

	/**
	 * ?덈줈???섏씠濡?蹂寃쏀븳??
	 * @param age 蹂寃쏀븯怨좎옄 ?섎뒗 ?덈줈???섏씠
	 * */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 二쇰?踰덊샇瑜?議고쉶?쒕떎.
	 * @return Human 媛앹껜媛 媛吏怨??덈뒗 二쇰?踰덊샇
	 * */
	public String getJumin() {
		return jumin;
	}

	/**
	 * ?덈줈??二쇰?踰덊샇濡?蹂寃쏀븳??
	 * @param jumin 蹂寃쏀븯怨좎옄 ?섎뒗 ?덈줈??二쇰?踰덊샇
	 * */
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
	/**
	 * Human 媛앹껜媛 媛吏怨??덈뒗 ?대쫫, ?섏씠, 二쇰?踰덊샇 ?뺣낫瑜?異쒕젰?쒕떎.
	 * */
	public void showInfo(){
		System.out.printf("?대쫫: %s, ?섏씠: %d, 二쇰?踰덊샇: %s", name, age, jumin);
	}
	
}
