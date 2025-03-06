package HW;

import java.util.jar.Attributes.Name;

public class Main {

	public static void main(String[] args) {
		
		Food f = new Food();
		f.foodName = "스테이크";
		f.price = 150000;
		
		Member m = new Member();
		m.name = "정동해";
		m.보유자산 = 10000000;
		
		Lunch l = new Lunch();
		l.getEat(f.foodName,m.name,f.price);
		
		
		
		

	}

}
