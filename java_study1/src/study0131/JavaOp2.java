package study0131;

import java.util.Scanner;

public class JavaOp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		
		//싸다구 주차장 주차비 결제
		// 주차장의 기본요금은 1000원이고 기본시간은 30분이다.
		// 11분 주차해도 1000원이다.
		// 10분당 100원씩 추가요금
		// 34분 주차하면 1000원 , 40분 주차하면 1100원
		// 51분 주차하면 1200원
		// 2시간 주차시 기본요금은 1700원이다.
		// 2시간 10분 주차하면 1800원  3시간 21분 주차하면 2500원
		// 주차 몇분 했는지 입력하여 주차요금이 얼마인지 출력하세요
		
		
		int default_time = 30; //기본시간
		int cost = 1000; // 기본요금
		int pTime_min =0; // 주차시간
		int tenM = 100; // 10분에 100원 추가요금
		int pTime_h = 0;		
		
		System.out.print("주차시간(분): ");
		pTime_min =sc.nextInt();
		
		System.out.print("주차시간(시간): ");
		pTime_h =sc.nextInt();
		
		if(0>pTime_min && pTime_min <= 39) { // 기본요금 1000원
			
		} else if  {
			pTime_min = pTime_min - default_time;
			cost = (pTime_min/10)*tenM+cost;
		else if {
			
		}
			
			
		if(2 = pTime_h && pTime_min < 10) {
			
		}else {
			pTime_h = pTime_h - default_time;
			cost = (pTime_h/1)*
		}
		}System.out.println("주차요금: " +cost);
		
		
	
		
		
		
	
			
	}
}
