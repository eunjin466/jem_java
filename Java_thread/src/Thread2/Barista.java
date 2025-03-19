package Thread2;



public class Barista implements Runnable{
		private final Cafe cafe; // 바리스타가 일하는 카페
	
	public Barista(Cafe cafe) { // 바리스타가 일하는 카페를 넣어줘야 주문가능
		this.cafe= cafe;
	}

	@Override
	public void run() {
		try {
		while(true) {
			Order order = cafe.give();
			System.out.println("바리스타 제조: " + order.getOrderId() + " - "+order.getMenu() );
			
			Thread.sleep(3000);
			System.out.println("바리스타 제조완료: "+order.getMenu());
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
			
			
			
		
	}
}
// 클래스안에 초기화방법
// 1. 매게변수를 이용한 초기화
// 2. 명시적 을 이용한 초기화                                                                                                                                                                                                                
