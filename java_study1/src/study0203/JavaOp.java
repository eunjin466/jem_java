package study0203;
import java.util.Scanner;

public class JavaOp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Math.random() 은  0.00000~ 부터 0.99999~ 까지이다.
		// 곱하기 계산과 더하기 계산으로 범위 지정 가능
//		int num = (int)(Math.random()*10);
//		
//		
//		System.out.println( num );
//		
		
//		int user = 0, coin =0;
//		System.out.println("1. 앞면, 2. 뒷면: ");
//		user = sc.nextInt();
//		
//		coin = (int)(Math.random()* 2+1);
//		
//		if(coin == user) {
//			System.out.println(" 정답! ");
//		}else {
//			System.out.println(" 땡! ");
//		}
//		
//		
		// 컴퓨터가 동전을  15개 갖고 있다.
		// 컴퓨터가 동전갯수가 짝인지 홀인지 맞추는 게임
		// 1. 짝 2. 홀 
		
	
//		System.out.println("1. 짝수, 2. 홀수");
//		 int user = sc.nextInt();
//		
//		int com = (int)(Math.random()* 15+1);
//		if(com%2 ==0 && user == 1) {
//			System.out.println(" 짝수 ");
//		}else if (com%2 == 1 && user == 1) {
//		
//		}else if (com%2== 2 && user == 2) {
//			System.out.println(" 홀수 ");
//		}else {
//			System.out.println("땡");
//		}
//		
		
		
		// 주사위 게임 (육면체)
		// 컴퓨터가 주사위를 던진다
		// 주사위 값이 3이하면 작은 값, 주사위 값이 4이상이면 큰값
		// 1 작다 2 크다
		// 주사위 값이 작은값인디 큰값인지 맞추세요
		
		System.out.println("1 작다, 2. 크다");
		int user = sc.nextInt();
		
		int dice = (int)(Math.random()* 6+1 );
		
		if (user == 1 || user == 2) {
			if(dice <=3 && user ==1)
			System.out.println(  "작다"  );
		else if(dice >=4 && user == 2) 
			System.out.println(  "크다"  );
		else 
			System.out.println(  "땡"  );
		}else {
		System.out.println( "잘못입력했습니다." );
		}
		
		
		
		
		
		
		
		
		
		
	}
}
