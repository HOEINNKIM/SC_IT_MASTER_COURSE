package step1_TestInterface;

public class TestInterface1 {
	
	public static void main(String[] args) {
		//?곸쐞 ?명꽣?섏씠????낆쑝濡??섏쐞 媛앹껜瑜?李몄“?????덈떎.
		Flyer f1 = new Bird();
		f1.fly();
		Flyer f2 = new SuperMan();
		f2.fly();
		//?곸쐞 ?명꽣?섏씠????낆쓽 諛곗뿴???먯떇媛앹껜瑜??붿냼濡??댁쓣 ???덈떎.
		Flyer fa[] = {new Bird(), new SuperMan()};
		for(int i=0; i< fa.length; i++) {
			fa[i].fly();
		}
	}
	
	
}
