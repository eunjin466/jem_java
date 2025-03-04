package NEW;

public class Friand {
	String gender;
	int age;
	String name;
	
	Friand (){
		
	}
	Friand (String gender, int age, String name){
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	
	void getGender() {
		System.out.println( gender );
	}
	void getYear() {
		System.out.println(2025-age);
		
	}
}
