package study0210;

import java.util.Scanner;

public class JavaArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		// 7개 정수를 저장 할 수 있는 배열을 선언하고
		// 정수 7개 입력한 뒤 모두 출력
		
		int[] num = new int[7];
	
		
		for(int i=0; i<num.length;i++) {
			System.out.println("정수입력: ");
			num[i] = sc.nextInt();
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		
		
		
		
		
	
	
	}

}
