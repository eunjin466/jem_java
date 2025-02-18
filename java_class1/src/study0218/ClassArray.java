package study0218;

public class ClassArray {
	public static void main(String[] args) {
		
		Member mem = new Member();
		
		mem.name = "정동해";
		mem.age = 26;
		mem.job = "군인...";
		
		
	Member[] members = new Member[5];
	// 5명의 정보 저장 가능은 함
	for(int i=0; i<members.length;i++)
	members[0] = new Member();
	
	members[0].job = "군인..";
	members[0].name = "정동해";
	members[0].age = 26;
	members[1].name = "이순신";
	members[1].age =  31;
	members[1].job = "군인";
	members[2].name = "문익점";
	members[2].job = "산업스파이";
	members[2].age =  45;
	
	for(int i=0; i<members.length;i++) {
		System.out.println( members[i].name);
		System.out.println( members[i].age);
		System.out.println( members[i].job);
	}

		
	}
}
