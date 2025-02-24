package study0221;

public class JavaMethod3 {
	static void findSubject(Courses[]arr) {
		for(int i=0; i<arr.length;i++) {
			if( arr[i].point == 2 ) {
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		
		
		Courses[]course = new Courses[] {
				new Courses(1,"정보사회와 컴퓨터",3),
				new Courses(2,"데이터베이스",3),
				new Courses(3,"자료구조",3),
				new Courses(4,"java",3),
				new Courses(5,"html",2)
				
		
		};
		
		
		findSubject ( course);
	// 학점이 2학점인 과목을 찾아라
	// 매서드의 내용은 course배열을 반복문으로 돌려서 
	// point가 2인거를 찾기위한 if문
	// 그리고 찾았으면 그자리에서 출력할 것인지 아니면 반환 할것인지
	// 
	
	}
}