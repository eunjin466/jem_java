package inherit1;

public class Product { // 부모클래스
	protected boolean onoff = false;
	protected String brand; // 브랜드
	protected int price; // 가격
	protected String name; // 제품명 
	
	
	
	public void power() {
		onoff = !onoff;
		System.out.println("전원: " + onoff);
	}

}
