package study0205;

import java.util.Scanner;

public class Javaloop3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

	// 동전 앞면 뒷면 맞추기 게임
	// 내 돈이 바닥날때까지 게임진행
		
		System.out.println("당신의 머니는 얼마?: ");
		int money =scan.nextInt();
		final int 판돈 = 1000;
		int win = 0;
		
		while(true) {
			int coin = (int)(Math.random() * 2+1);
			System.out.println("1. 앞면, 2. 뒷면: ");
			int user = scan.nextInt();
			if( user == coin)
			{   System.out.println("정답");
				win++;
			}else 
				System.out.println("땡");
			money -= 판돈; // 1번 진행시 1000원 감소
			if(money < 판돈) break;
		}
		System.out.println("내돈은:" + money);
		System.out.println("정답 몇번: " + win);
		
		
		
		
		
		
		
		
		
		// 21~ 49   ->  * 29 +21
//		int com = (int)(Math.random() * 50+1);
//		
//		while(true) {
//			System.out.println("정수입력: ");
//			int num = scan.nextInt();
//			if(com == num) {
//				System.out.println(" 정답입니다 ");
//				break;
//			}
//			if(com > num )
//				System.out.println("업");
//			if(com < num )
//				System.out.println("다운");
//		}
//		
		
		
		
		
		// 과제 예시
//		System.out.println("정수입력: ");
//		int num = scan.nextInt();
//		
//		while(true) {
//			int com = (int)(Math.random() * 50+1);
//			if(com == num) {
//				System.out.println(" 정답입니다 ");
//				break;
//			}
//			if(com > num )
//				System.out.println("업");
//			if(com < num )
//				System.out.println("다운");
//		}
//		
		
		
//		for(초기값; 조건식; 증감식)
//		for(int i=1; i<=10; i++);
//		반복횟수가 정해져 있는경우 for문이 가독성이 좋다.
//		반복횟수가 없는 경우 while문이 가독성이 좋다.
		
		
//		int i=1; // 초기값
//		
//		while(i<=10) { // 조건식
//			System.out.println( i );
//			i++; // 증감식
//		}
//	
		
		
		
		
		
		
	}
}
