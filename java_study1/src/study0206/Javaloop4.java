package study0206;

import java.util.Scanner;

public class Javaloop4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		while(true) {
			System.out.println("정수입력: ");
			int num= sc.nextInt();
			
			if(num ==0) {
				System.out.println("총 숫자합: "+sum);
				System.out.println("끝"); break;
				
			}else {
				sum = sum+num;
				
			}
		}
		
		int lose = 0; 
		int same = 0;
		final int 내기 = 10;
		
		while(true) {
			System.out.print("1 가위,2 바위, 3 보");
			int user= sc.nextInt();
			int com = (int)(Math.random()* 3+1);
			
			if(user == 1 && com == 2 || user ==2 && com == 3 || user == 3 && com == 1) {
				System.out.println("졌당ㅠㅠ");
				lose++;
				
			}else if (user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2 ) {
				System.out.println("이겼당!!"); 
			}else {
				System.out.println("비겼당");
				same++;
				user = user - 내기;
				if(user < 내기); break;
			}
			
			System.out.println("진 횟수: " + lose );
			System.out.println("비긴 회수: " + same);
			
		}
		
		
		
		
		
		
		
		
//		int user = 0;
//		do {
//		while (true) {
//			System.out.print("1.가위, 2. 바위, 3. 보");
//			user= sc.nextInt();
////			if (user >=1 && user <=3) break;
//		}while( !(user>=1 && user <=3);)
//		System.out.println("가위바위보 진행");
		
		
		
		
		
		
		
		
		
//		int a= 100;
//		do {
//			System.out.println("do ~ while문");
//			
//			
//			
//		}while (a < 15);{
//	
//		}
		// 초기값 -> {  내용  } -> 조건식비교 -> 참이면 -> {  내용  }
	
		
		
		
		
		
		
		
		
//		
//		int i=1;
//		while (i<=3) {
//			int k=1;
//			while(k<=2) {
//				System.out.println("i= "+i+"      k="+k);
//			}
//			i++;
//		}
//		
//		
		
		
		
		
		
//		for(int i=1; i<=3; i++) {
//			for(int k=1; k<=2; k++) {
//				System.out.println("i= "+i+"    k="+k);
//					
//				}
//			}
	
	
	
	
	
	
	
	
	
	
	
	}

	}

