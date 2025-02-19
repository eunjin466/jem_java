package study0218;

public class Member {
	String name; //이름,인스턴스 변수
	int age; // 나이
	String job; // 직업
	
	Member(){ //기본생성자 메서드
		this.name = "박문수";
		System.out.println(this);
		
	}
	Member(int age1, String job){
		this.age = age;
		this.job = job;
		
	}
	Member(int age,String job,String name){
		this.name = name;
		this.job = job;
		this.age = age;
	}
	
	
	
	
}

	
