package step2_TestInterface2;

public class TestInterface2 {

	public static void main(String[] args) {
		Flyer fa[] = new Flyer[5];
		fa[0] = new SuperMan();
		fa[1] = new Bird();
		fa[2] = new Eagle();	//Bird瑜??곸냽諛쏆븯?쇰?濡?Fly??낆쑝濡??몄떇?쒕떎.
		//fa[3] = new Animal; // Flyer? 愿怨꾧? ?놁쓬
		Fighter fg[] = new Fighter[5];
		fg[0] = new SuperMan();
		fg[1] = new Eagle();

	}

}
