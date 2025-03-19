package Thread2;

public class Main {

	public static void main(String[] args) {
		
		
		Cafe cafe = new Cafe(); //카페 오픈
		
		Thread barista = new Thread(new Barista(cafe));
		Thread customer =new Thread(new Customer(cafe));
	
		
		barista.start(); // 바리스타 스레드 시작 - 제조할 준비 완료
		customer.start(); // 손님 스레드 시작 - 주문할 결심
		
		

	}

}
//		// Thread를 extends로 상속 받을시 
////		Customer c1 = new Customer();
////		c1.start();
//		
//		// Runnable을 implemnets로 인터페이스 연결시 (일반적으로 많이 사용함)
//		Thread c1 = new Thread(new Customer());
//		c1.start();
// JSP = java server page
// php = personal home page


// 카페에서 손님이 주문을 한다
// 주문을 하면 바리스타가 제조한다
// 몇명의 손님이 주문하든지 주문한 순서대로 바리스타들이 제조한다.
// 