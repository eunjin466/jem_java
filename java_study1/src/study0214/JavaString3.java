package study0214;

import java.util.Scanner;

public class JavaString3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
	
//		String str = "member"; //  String str = new String("member");
//		
//		
//		String names =  new String[5];
//		names[0] = new String("박문수"); 
//		
		
		
		
		String[] names = new String[5];
		names[0]	 = "정동해";
		names[1]	 = "서동진";
		names[2]	 = "이은진";
		names[3]	 = "이정훈";
		names[4]	 = "이서진";
		
//			boolean hasName = false;
//				for(String name : names) {
//					if(name.equals("김미란"))
//						hasName = true;
//					
//				}
//				if(hasName) System.out.println("이름등록 됨");
//				else System.out.println("등록 되지 않은 이름");
//		
//		
//		// 배열 -> 문자열 
//		String temp = String.join("," ,names);
//		boolean hasName = temp.contains("정동해");
//		// contain - 문자의 포함여부를 나타내는 메서드
		
	// 학과명, 조교, 전화, 위치
		
		String[][] dept = new String[4][];
		dept[0]= new String[] {"컴퓨터공학과","정보과학과","정보통신공학과","정보산업공학과","전자공학과","문헌정보학과","전기공학과"};
		dept[1]= new String[] {"이지은","김영미","박순애","이춘애","이미선","김기범","박준용"};
		dept[2]= new String[] {"3333","3334","3335","3336","3337","3338","3339"};
		dept[3]= new String[] {"T101","T201","T301","T401","T501","T601","T701"};
		
		// 정보통신공학과의 과사무실 위치와 조교 이름은?
		
		String search = "정보통신공학과";
		int idx = 0;
		for(int i=0;i<dept.length; i++) {
			for(int k=0;k<dept[0].length; k++) {
				if(dept[0][k].equals(search)) {
					idx = k; break;
				}
			}
		}
		if(idx == -1) // 만약 존재하지 않으면
		{
			System.out.println("등록 되지않은 학과 입니다.");
			 return; // return은 메서드를 종료시킨다. main 메서드가  종료 되면 프로그램 끝
		}
		
		System.out.println("조교: " +dept[1][idx] + ",사무실: "+dept[3][idx]);
	
		
		
		
		
		
		
		
		
		
		
		
				
		// 참조변수 : 특정 공간의 메모리주소만 저장할 수 있는 변수
//				- 참조변수는 배열의 주소를 가지는 참조변수와 객체의 주소를 가지는 참조변수가 있다
//				- 배열의 주소를 가지고 있는 참조변수는 참조변수 이름 [인덱스] 방식으로 사용
//				- 객체의 주소를 가지는 참조변수는 참조변수이름.xxxx 방식으로 사용
				
		// int a =10;
				
		
		
	}
}
