package generic3;

public class 예감 extends Snack{
	
	public 예감 ( String snackname, int price) {
		super (snackname, price);
	}
	
	
	
	
	@Override
	public String toString() {
		return "과자이름: " +snackname+ ", 가격: " +price+ "원";
	}
}
