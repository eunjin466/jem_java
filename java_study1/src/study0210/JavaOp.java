package study0210;

import java.util.Scanner;

public class JavaOp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("알파벳 입력: ");
		char alp = sc.nextLine().charAt(0);
		// 아스키 코드에서 A -65(10진수) , a - 97 (10진수)
		for(int i= 1;i<= 26;i++) {
			if( alp==(i+64) || alp==(i+96) ) {
				System.out.printf("알파벳 %c는  %d번째 알파벳\n",alp,i);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		int n1,n2,n3;
//	do {
//		
//		
//		n1 = (int)(Math.random());
//		n2 = (int)(Math.random());
//		n3 = (int)(Math.random());
//		
//	}while(! (n1 != n2 && n1 !=  n3 && n2 != n3) );
//	// 3개의 숫자가 중복없이 1~9중의 하나를 가진다.
//	while(true) { // 숫자 맞출때 까지 계속 입력해야 하니까 무한루프
//		System.out.print("숫자 세개: ");
//		int u1 = sc.nextInt();
//		int u2 = sc.nextInt();
//		int u3 = sc.nextInt();
//		
//		int str =0, ball = 0; // 스트라이크, 볼표현, 아웃은 계산으로
//		// 스트라이크 경우
//		if(n1 == u1) str++;
//		if(n2 == u2) str++;
//		if(n3 == u3) str++;
//		
//		// 볼인경우
//		if(n1 == u2 || n1 == u3) ball++;
//		if(n2 == u1 || n2 == u3) ball++;
//		if(n3 == u1 || n3 == u2) ball++;
//		
//		System.out.printf("%d스트라이크 %d볼 %d아웃\n", str, ball, 3-str-ball );
//		
//		if(str == 3)break;
//		 
//	}
//		
//		
	
		
	}

}
