package study0217;

import java.lang.ProcessHandle.Info;

public class JavaMain {
	public static void main(String[] args) {
		

		// 데이터 저장 - 변수
		          
	Animal type = new Animal();
	type.name = "꼬꼬";
	type.type = "닭";
	 type.age = 1;
	 
	 System.out.println(type.age + " "+type.name + " " + type.type + " ");
		
		
		
		
		
	}

}

// 클래스 - 사용자정의 데이터 타입
// class 클레스이름 {     }
// 클래스이름은 무조건 대문자로

class Member {
	
}

//동물종류, 동물이름, 나이
//동물조율에는 개, 고양이,닭,토끼,코끼리 등등
//동물이름은 볼트,렉스,옹이,꼬끼오,총총이 등등
//나이는 하고싶은 나이 아무거나
//동물한마리에 대해서 데이터 입력하고 출력


class Animal {
	
	String type ;
	String name ;
	int age;
	
	
	
}

