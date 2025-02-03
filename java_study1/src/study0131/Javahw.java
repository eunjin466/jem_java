package study0131;

import java.util.Scanner;

public class Javahw {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		
		
		
//		int default_time = 30; //기본시간
//		int cost = 1000; // 기본요금
//		int pTime_min =0; // 주차시간(분)
//		int tenM = 100; // 10분에 100원 추가요금
//		int pTime_h = 0;  // 주차시간(시간)
//		int H_cost = 1700; // 시간당 요금
//		
//		System.out.print("주차시간(분): ");
//		pTime_min =in.nextInt();
//		
//		System.out.print("주차시간(시간): ");
//		pTime_h =in.nextInt();
//		
//		
//		if(0>pTime_min && pTime_min <= 30) { // 기본요금 1000원
//			System.out.println(cost);
//		}else if (2 >= pTime_h && pTime_min < 10) {
//			pTime_h = pTime_h - default_time;
//			H_cost = (pTime_h/2) * tenM + H_cost;
//					
//		}else if (4 >= pTime_h && pTime_h < 1) {
//			pTime_h = pTime_h - default_time;
//			H_cost = (pTime_h/4) * tenM + H_cost;
//		}else if (5 >= pTime_h && pTime_h < 1) {
//			pTime_h = pTime_h - default_time;
//			H_cost = (pTime_h/5) * tenM + H_cost;
//		}
//		System.out.println("주차요금: " + (H_cost + cost));
//		
		 
		
		
		int phour,pmin; //주차시간,분
		int cost=1000; 
		int totalTime = 0; // 총 주차시간(분) - 기본시간을 제외한 나머지
		
		System.out.print("주차시간(  시간, 분): ");
		phour = in.nextInt(); //주차 몇시간 입력
		pmin = in.nextInt(); // 주차 몇 분 입력
		
		totalTime = phour*60 + pmin;
		if (phour >= 8) { // 8시간 이상 주차
			cost = 10000;
			totalTime = 0; // 8시간 이상 이라는 시간에 대해서 이미 요금계산완료
			
		}else if (phour >= 4) { // 4시간이상 주차시
			cost = 2500;
			totalTime -= 240;
		}else if (phour >= 2) { // 2시간 이상 주차시
			cost = 1700;
			totalTime -= 120;
		}else { // 2시간 미만
			totalTime= totalTime < 30 ? 0: totalTime -30;
		}
		
		int price = cost + (totalTime/10 * 100);
		System.out.println("주차요금: " + price + "원");
		
		
	}
}
