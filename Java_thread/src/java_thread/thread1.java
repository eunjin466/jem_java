package java_thread;

import java.util.Scanner;

public class thread1 {
	public static void main(String[] args) {
	
//		MyThread th1 = new MyThread("장은호");
//		th1.start();
//		
//		MyThread th2 = new MyThread("김명준");
//		th2.start();
//		
////		Test t = new Test();
////		t.testfor();
//		for(int i=1;i<=1000;i++) {
//			System.out.println("Main메서드");
//			try { Thread.sleep(100);
//			
//			}catch(Exception e) {
//				
//			}
//		}
		
		Dino[] 알 = new Dino[] {
				new Dino("티라노사우루스",10),
				new Dino("벨로시렙터",4), 
				new Dino("프테라노돈",6),
				new Dino("스테고사우루스",7)	
		};
		
		
		Create[] divice = new Create[알.length];
		for(int i=0;i<알.length;i++)
			divice[i] = new Create();
		
		divice[0].start(); divice[1].start();
		divice[2].start(); divice[3].start();
		// 부화시킬 공룡을 선택하여 부화 진행 할 것이다.
		// 스레드를 통해 각 공룡별 시간 만큼 동작 하도록 할것이다
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<알.length;i++) {
			System.out.print("1~4중에 하나: ");
			int select = sc.nextInt();
			
			Create.hatch(알[select-1]);
			System.out.println((i+1)+"번 부화장치 가동");
			
			System.out.print("계속 하시겠습니까?");
			if(sc.nextInt() != 1)
				break;
		}
		
		
	}
}
