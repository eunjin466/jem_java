package generic3;

public class SnackBox<A> {
	A box;
	
	public void makeBox(A 과자봉지) {
		this.box = 과자봉지;
		System.out.println( "과자 박스만들기" );
		System.out.println(this.box);
	}

	public A getBox() {
		return this.box;
	}
}
