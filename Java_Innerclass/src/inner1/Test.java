package inner1;

public class Test {

	static int count=1; // 클래스 변수
	int a; // 인스턴스 변수
	
	
	Test(){
		a = new A();
	}
	
	// 내부클래스의 정의
	class A{
		int num;
		void view() {System.out.println("내부클래스 메서드")
			;
	}
		
		void innerView() {
			this.a.view();
		}
	
	void setNum(int num) {
		this.a.num = num;
	}
	
	
	
	void sum() {
		int a,b;// 지역변수
	}
	
	
}
// 내부클래스 : 클래스 내부에 만드는 클래스

