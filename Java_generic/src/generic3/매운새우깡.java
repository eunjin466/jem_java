package generic3;

public class 매운새우깡 extends Snack{
	public 매운새우깡 ( String snackname, int price) {
		super (snackname, price);
	}

	
	@Override
	public String toString() {
		return "과자이름: " +snackname+ ", 가격: " +price+ "원";
	}
	
}
