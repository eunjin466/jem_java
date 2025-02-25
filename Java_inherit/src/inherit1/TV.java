package inherit1;

public class TV extends Product{ // 자식 클래스

	public TV() {
		super(); //부모클래스의 생성자 메서드
		// super는 부모클래스의 객체를 의미한다.
	}
	public TV(String brand, int price, String name) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	
}

