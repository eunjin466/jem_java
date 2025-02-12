package study0212;

import java.util.Scanner;

public class JavaArray6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
	
//		
//		int[][]	board = new int[5][3];
//		// 1차원 배열 몇개? -> 5개
//		
//		
//		board[0][0] = 1;	board[0][1] =2;
//		board[0][2] = 3;	board[1][0] =4;
//		board[1][1] = 5;	board[1][2] =6;
//		board[2][0] = 7;	board[2][2] =10;
//		board[3][1] = 20;	board[3][2] =30;
//		board[4][0] = 50;	board[4][1] =100;
//		
//		for(int[] pArr : board) {//pArr에 저장되는것은 board[0],board[1],board[2],board[3],board[4]
//								 // board[0] -> 메모리주소
//				for(int num : pArr) {
// // num에 저장되는것 : board[0][0],	board[0][1],board[0][2].....
//					System.out.println(num + " ");
//				}
//				System.out.println();
//		}
		
		int[][] board = new int[][]
				{
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,2,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
				};
			
			int x=0, y=0;
			while(true){
			for(int i=0; i<board.length; i++) {
				for(int k=0; k<board[i].length; k++) {
					
					if(board[i][k] ==1)
						System.out.printf("■");
					if(board[i][k] ==0)
						System.out.printf(" ");
					if(board[i][k] ==2) {
						System.out.printf("@");
						x=k; y=i;
					}
				}
				System.out.println();
			}
			// 이동시키기 w,a,s,d
			System.out.print("방향입력: ");
			char key = input.nextLine().charAt(0);
			
			board[y][x]=0; // 현재 위치에 0으로 변경
			switch( key ) {
			case 'w': // y축 감소
				if(board[y-1][x] !=1) y--; break;
			case 's': // y축 증가
				if(board[y+1][x] !=1)y++; break;
			case 'a': // x축 감소
				if(board[y][x-1] !=1)x--; break;
			case 'd': // x축 증가
				if(board[y][x+1] !=1)x++; break;
			default :
				System.out.println("잘못입력");
			}
			board[y][x]=2; // 이동할 위치에 2로 변경
			}
					
		
		
				
		
		
			
	
	
	
	}
}
