package sesoc.global.ui;

import java.util.List;
import java.util.Map;

import sesoc.global.vo.Food;
import sesoc.global.vo.Order;

public interface UI {
	/**
	 * 음식을 주문하기 위한 메뉴 목록을 출력한 후
	 * 그 타입에 따라 주문객체를 생성하고 주문 객체가 생성되면
	 * 해당 주문객체를 Manager클래스의 ArrayList에 등록한다.
	 */
	public void insertOrder();
	/**
	 * 주문을 취소할 번호를 입력받아 그 번호에 해당하는 주문을
	 * 전체 주문목록이 저장되어있는 ArrayList에서 찾아
	 * Manager클래스에 삭제요청을 한다.
	 */
	public void deleteOrder();
	/**
	 * 프로그램의 첫번째 주메뉴 화면 출력
	 */
	public void printMainMenu();
	/**
	 * 주문을 위한 화면 출력
	 */
	public void printOrderMenu();
	/**
	 * 주문을 햇을경우 주문 객체를 생성하여 리턴한다.
	 * 음식 주문은 여러개가 가능하고 주문음식은 Map에 저장
	 */
	
	public void printFoodList();
	/**
	 * 주문받은 메뉴는 매개변수로 전달된 Map에 담고
	 * 음식이 주문될 때마다 음식 값을 누적하여 총액을 구한뒤 리턴
	 */
	public int foodOrdered(Map<Food, Integer> map);
	public Order makeOrder(int menuNum);
}
