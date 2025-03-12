package shopping;

public class shoppingMall {
	
	private Product p;
	public shoppingMall() { p = new Product(); }
	
	
	public static void cartSum(int price) {
		System.out.println("'총가격:'"+Product.name()+" 원");
		
	}


	public void cartIn(String name) {
		System.out.println("장바구니에 담기");
		
	}


	public void cartOut(String name) {
		System.out.println("장바구니에서 삭제하기");
		
	}

}
