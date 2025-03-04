package inner1;

public class Test {

	static int count=1; // 클래스 변수
	int abc; // 인스턴스 변수
	
	
	//정적 내부클래스 (static)
	static class Dog{
		int year;
	}
	void setYear(int year) {
		Dog d = new Dog();
		d.year=year;
	}
// 정적내부클래스를 굳이 노출 하면서 객체를 만들고자 한다면 
	Test.Dog dof = new Test.Dog();
	 Test.origin(); // 클래스 메서드 실행은 객체없이 가능하다.
	
	Test(){
		a = new A();
	}
	static void origin() { //클래스 메서드
		
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

