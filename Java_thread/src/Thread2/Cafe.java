package Thread2;

public class Cafe {
	 private Order order;
	 private boolean orderPlace = false; // 주문했냐(true) 안했냐(false)
	 
	 public synchronized void placeOrder(String menu) { // 매장에서 먹기
		 
		 while(orderPlace) { // 주문이 들어오기 전까지 바리스타는 대기
			 wait();
		 }
		 
		 
		 order = new Order(menu);
		 System.out.println("손님 매장 주문: "+order.getOrderId()+ " - " + order.getMenu());
		 
		 orderPlace = true;
		 notify(); // 주문이 들어갔으니까 바리스타를 실행
		 
	 }
	 public synchronized Order give() throws InterruptedException {
		 while(!orderPlace) {
			 wait(); //주문이 들어오기 전까지 바리스타는 대기
			 
		 }
		 orderPlace = false;
		 notify();
		 return order;
	 }
	 
	 
	 
	 
//	 public void takeOrder(String menu) { // 포장해가기
//		 order = new Order(menu);
//		 System.out.println("손님 포장주문: "+order.getOrderId()+" - "+order.getMenu() );
//		 
//		 
//	 }
}
