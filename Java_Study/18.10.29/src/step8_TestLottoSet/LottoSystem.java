package step8_TestLottoSet;

import java.util.Random;
import java.util.TreeSet;

public class LottoSystem {

	public TreeSet makeLotto() {
		TreeSet tree = new TreeSet();
		Random r = new Random();
		while(tree.size() < 6) {
			tree.add(r.nextInt(45) + 1);			
		}
		return tree;
	}
}