package generic3;

public class 포스틱 extends Snack{
		public 포스틱 ( String snackname, int price) {
			super (snackname, price);
		}
		
		
		
		
		@Override
		public String toString() {
			return "과자이름: " +snackname+ ", 가격: " +price+ "원";
		}

}
