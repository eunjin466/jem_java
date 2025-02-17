package study0214;

import java.util.Scanner;

public class JavaHW {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
	
		
		int[][] board = new int[][]	
				{
			{0,0,0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,0,0,},
			{0,0,0,0,0,0,0,0,0,0,0,0,}
			
				};
				
				int x=0; y=0;
				while(true) {
					for(int i=0; i<board.length;i++) {
						for(int k=0;k<board.length;k++) {
							if(board[i][k] == 1)
								System.out.printf("●");
							if(board[i][k] == 0)
								System.out.printf("○");
						}
					}
					System.out.println();
				}
		
		
		
		
		
	}
}
