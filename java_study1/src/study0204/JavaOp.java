package study0204;

import java.util.Scanner;

public class JavaOp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		// 반복문 - for, while, do ~ while
		// 몇번을 반복할 것인가, 몇번을 반복할 것인지 정하지않고 하는 경우와 반복횟수를 정하는 경우 
		// 주로 반복횟수가 정해진 경우는 for문 
		// 반복횟수기 정해져 있지 않은 경우는 while문
//		
//		System.out.print("숫자입력: ");
//		int num = scan.nextInt();
//	
//		
//		// for문의 ()안에 조건식에는 무조건 ;이 두개 들어가아햠(마지막 조건식엔 붙히지 않음)
//		for(int i = 1; i <= num; i++) {
//			System.out.println(i);
//		}
//		
//		for(int i=1; i<=num; i++) {
//			System.out.println("반복문!");
//		}
		
		
		
		// 6번 반복하는 반복문을 만들고 싶다.
		// 1부터 시작해서 6까지 1씩 증가
		// i=1; => 1부터 시작
		// i<=6; => 6까지 표현
		// i= i+1 / i++ => 1씩증가
//		
//		for(int i=1; i<=6; i++) {
//			System.out.println(i);
//		}
		
//		for(int i=5; i<=17; i++) {
//			System.out.println(i);
//		}
//		
		
		
		
		// 총합 구하기
		
//		int sum =0;
//		for(int num=1; num<=10; num++) {
//			sum = sum+num;
//		}
//		System.out.println("1부터 10까지 합: " +sum);
//	
	
		
		// 두개의 정수를 입력하여 두수중 작은 숫자부터 큰숫자 까지의 합을 구하시오
		// 예) 1번째 숫자를 21입력하고 2번째 숫자를 4입력했다면 4부터 21까지의 합 구하기
//		
//		int num1 =0, num2 =0;
//		int num3=0; //두숫자 중에서 작은수 저장은 num3
//		int num4 = 0; // 두숫자 중에서 큰수 저장은 num4
//		
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		
//		if(num1 > num2 ) {
//			num3 = num2;
//			num4 = num1;
//		}else {
//			num3=num1;
//			num4=num2;
//		}
//		int sum=0;
//		for(; num3 <= num4; num3++) {
//			sum= sum+ num3;
//		}
//			System.out.println(sum);
			
		
		
		// 내가 키보드로 입력한 숫자에 해당하는 구구단 출력하기
		
		System.out.println("숫자입력: ");
		int gugu =scan.nextInt();
		
		for(int i =1; i<=9; i++) {
			System.out.printf("%d * %d = %d \n",gugu,i,gugu*i);
		}
		
//		System.out.println("2*1= " + (2*1));
//		System.out.println("2*2= " + (2*2));
//		System.out.println("2*3= " + (2*3));
//		System.out.println("2*4= " + (2*4));
//		System.out.println("2*5= " + (2*5));
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
