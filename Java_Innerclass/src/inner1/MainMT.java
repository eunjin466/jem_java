package inner1;

public class MainMT {
	public static void main(String[] args) {
		
//		Test.A a = new Test.A();
		Test t = new Test();
		
		t.a.num = 10; // 내부클래스가 노출됨
		t.innerView();
		t.setNum(10);
		
		
//		
//		Test.A a = t.new A();
//		a.num = 10;
//		a.num = 20;
//		
	}

}
