package study0131;

import java.util.Scanner;

public class JavaOp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		
		
		
		
		
/*
		 변수 : 데이터(값)를 저장하기 위한 메모리 공간
		 변수이름 : 데이터가 저장돤 메모리 공간을 사용하기 위해서는 이름을 부여해야한다.
		
		 system.out.println( 1000 );
		 - 메모리 어딘가에 저장은 되지만 변수가 없어 찾지못해 재사용 불가
		 
		 int a = 1000;
		 system.out.println( a );
		 - a라는 변수에 저장후 출력해서 재사용 가능
		 
		 변수선언 : 데이터 타입 정하기, 변수이름 정하기
		 		-> 사용할 데이터에 맞춰서 정하기
		 		-> int num; 데이터타입 변수이름;
		 
		 데이터타입 변환(형변환)
		 	자동형변환 : 데이터타입이 작은 범위에서 큰범위로 데이터가 저장되는 경우
		 	예) float a = 10; -> 자동형변환 (실수타입으로)
		 	강제형변환 : 데이터타입이  큰범위에서 작은범위로 데이터가 저장되는경우
		 	예) int b = (int)2.14f; -> 강제형변환 (정수타입으로)
		 	
		 나누기 % : 나머지 구하기
		 ++ , -- : 증감연산자 ( 1씩 증가, 1씩 감소 )
		 
		 if문 
		  int money = 6400;
		  if (money >= 10000) {
		  system.out.println ( "충전안함 ");
		   }else {
		  	system.out.println("잔액부족" +(1000 - money) +"충전);
		  	money = (10000 - money) + money;
		  	}
		  	system.out.println("현재잔액:" + money); 
*/
		// 사각형의 너비와 높이이다.
		// 현재 사각형은 정사각형인가 직사각형인가?
	
//		int num=0;
//		
//		System.out.print("숫자입력: ");
//		num = in.nextInt();
//		
//		if(num % 2== 1) {
//			System.out.println("홀수");
//		}else {
//			System.out.println("짝수");
//		}
//		
//		
//		
//		int num =15;
//		if(num > 0) {
//				System.out.println("양수이다");
//		}else {
//			if(num < 0) {
//				System.out.println("음수이다");
//			}else {
//				System.out.println("0이다");
//			}
//		}
		
		
		
//		int score = 81; // 100~90은 A, 89~80은 B, 79~70은 C 나머지는 F
//		
//		if(score <= 100 && score >= 90) {
//			System.out.println(" A학점이다");
//		}
//		if(score >= 80) {
//			System.out.println("B학점이다");
//		}
//		if(score >=70) {
//			System.out.println("C학점이다");
//		} else {
//			System.out.println("F학점이다");
//		}
//		
	
		// 1 입력하면 데이터 저장이라고 출력
		// 2 입력하면 데이터 삭제 하고 출력
		// 3 입력하면 종료라고 출력
		// 1,2,3이 아닌 숫자는 잘못 입력했습니다 라고 출력
		
		int num = 0;
		System.out.println("메뉴를 선택: ");
		num = in.nextInt();
		
		if (num == 1) {
			System.out.println("데이터저장");
		}else if (num == 2) {
			System.out.println("데이터삭제");
		}else if (num == 3) {
			System.out.println("종료");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		
		
		
		
		
		
	}
}
