package shopping;

public class shoppingMall {
	
	private Product p;
	public shoppingMall() { p = new Product(); }
	
	
	public static void cartSum(int price) {
		System.out.println("'총가격:'"+Product.name()+" 원");
		
	}

}
