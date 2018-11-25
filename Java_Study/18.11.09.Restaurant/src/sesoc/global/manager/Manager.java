package sesoc.global.manager;

import java.util.List;

import sesoc.global.vo.Food;
import sesoc.global.vo.Order;

public interface Manager {
	public void getFile();
	public List<Food> getFoods();
	public Order findOrder(int number);
	public void deleteOrder(int number);
	public void showAll();
	public boolean insertOrder(Order order);
	public void saveFile();
	public int[] calcSalesTotal();
}
