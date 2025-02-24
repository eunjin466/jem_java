package study0224;

public class Member {
		String name;
		int age;
		String addr;
}
Member(){
	name = "아무개";
	age = 10;
	addr= "대전";
}
Member(String name, int age, String addr){
	this.name = name;
	this.age = age;
	this.addr = addr;
}

// 인스턴스 메서드
void setName (String name) {
	this.name = name;
	output(); // 클래스메서드 호출가능
	
}

//클래스 메서드

static void output() {
	setName("이순신"); //인스턴스 메서드 호출불가
	System.out.println(name); //인스턴스 변수 사용불가
}