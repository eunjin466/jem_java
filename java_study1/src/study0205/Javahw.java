package study0205;

import java.util.Scanner;

public class Javahw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== UP & DOWN 게임 ====");
		System.out.println("숫자입력: ");
		int num = sc.nextInt();
		int max = 50, min =1, t =50; // t변수는 random() *t로 사용
		
		while(true) {
			System.out.println("범위: " + min +"~" + max);
			
			int com = (int)(Math.random()* 50+1);
			System.out.println("컴퓨터: " + com);
			if(com == num ) {
				System.out.println("정답입니다!");
			break;} // 반복문(while 종료)
			if (com > num )
				System.out.println("업");
			min = com +1;
			if(com < num)
				System.out.println("다운");
			max = com -1; // 다운일 경우 범위의 최대값 변경
			
		}
		
		
		
		
		
		
		
		
		
	}
}
