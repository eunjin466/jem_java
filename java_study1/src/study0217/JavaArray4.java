package study0217;

import java.util.Scanner;

public class JavaArray4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
	
//	int[] game = new int[25];
//	
//	
//	// game 베열에 값채우기
//	for(int i=0; i<game.length; i++) {
//		 game[i] = (int)(Math.random() * 50+1);
//	
//		for(int k=0; k<i; k++) { //game배열에 숫자가 저장도있는 곳까지
//			if(game[k] == game[i]) { // 배열의 값중 temp와 같은게 있다면
//				i--; break;
//				
//				
//			}
//		}
//		
//		
//	}
////	System.out.println(Arrays.toString( game ));
//	
//
//	
//	
//	// 5줄 5칸 출력
//	for(int i=0; i<=4; i++) { //빙고판 출력
//		for(int k=0; k<=4; k++) {
//			if( game[i*5+k] ==0 )
//				System.out.printf(" %2s ", "■");
//			else
//			System.out.printf(" %2d ", game[i*5+k]);
//		}
//		System.out.println();
//	}
//	
//	System.out.print("숫자 입력: ");
//	int num = scan.nextInt(); // 빙고판에 있는 숫자 입력
//	
//	for(int i=0; i<game.length; i++) {
//		if( game[i] == num) { // 내가 입력한 숫자를 배열에서 찾기
//			game[i] = 0;
//			
//			
//		}
//	}
//	
//	
	
	int[] harvest = {9,10,11,8,7,5};
	int sum = 0;
	int avg =0;
	
	for(int i=0;i<harvest.length;i++) {
		sum = harvest[i] + sum;
				
	}for(int n=0; n<harvest.length; n++) {
		avg = harvest[n] * sum;
	} 
	
	
	
	
	
	
	}
	}


