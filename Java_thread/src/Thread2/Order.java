package Thread2;

import lombok.Getter;

@Getter

public class Order {
	
	private static int counter = 1;
	private final int orderId; // 주문번호
	private final String menu; // 주문메뉴
	
	public Order(String menu) {
		this.orderId = counter++;
		this.menu = menu;
	}
	
}