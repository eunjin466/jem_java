package study0210;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class JavaHW {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); 
	
	int[] number = new int[] {10,20,30,44,55,66,1000,2323};
		 for(int num:number) {
			 System.out.println(num);
		 }
	
		 
		 //문제 
		 // tall 배열은 A반 학생들의 키를 저장한것
		 // A반의 평균 이상 키를 찾아서 출력
		 
//		float[]tall = new float[] {167.2f,163.4f,175.7f,173.8f, 158.3f};
//		
//		float avg =0, sum =0;
//		for(float t: tall) {
//			sum = sum+ t; //총합 구하기
//			
//		}
//		avg= sum/tall.length; // 평균구하기
//		
//		for(float t:tall) {
//			if(avg<=t)
//				System.out.println( t );
//		}
	
		 
		 
		 //배열관련 메서드
		 int[]num  = new int[] {10,20,30,40,50,60,70};
		 System.out.println( Arrays.toString(num) );
		 // 자바에서 데이터 출력 메서드 이름은 toString
		 
		
		 int[] a = new int[7];
		System.out.println( Arrays.toString(a) );
		
		//배열복사
		// arraycopy ( 복사배열, 복사배열시작인덱스,저장배열,저장시작인덱스,크기);
		System.arraycopy(num, 0, a, 0, num.length);
		System.out.println(Arrays.toString( a ));
		
		//배열비교
		boolean isSame = Arrays.equals(num, a);
		System.out.println(isSame);
		
		
		// 배열 정렬
		 int[] arr = new int[] {25,45,78,92,12,01,56,42,41,97,95,23};
		 System.out.println(" ===== 정렬전 ===== ");
		 System.out.println( Arrays.toString(arr));
		 
		 Arrays.sort(arr);
		 System.out.println(" ===== 정렬 후 ===== ");
		 System.out.println(Arrays.toString(arr));
	
		 
//		 Arrays.sort(arr, Collections.reverseOrder() );
		 // comparator 구현필요
		 
		 String[] names = {"이순신","이성계","김춘추","정약용","문익점"};
		 System.out.println( Arrays.toString(names) );
		 
		 Arrays.sort( names );
		 System.out.println(Arrays.toString(names));
		 
		 Arrays.sort(names, Collections.reverseOrder() );
		 System.out.println(Arrays.toString(names));
	
	
	
	
	
	
//	
//	int[] c = new int[15];
//	int idx=0;
//	
//	while(true) {
//		int temp = (int)(Math.random()*50+1);
//		if(temp%2 == 0) {
//			boolean isSame = false; // 같은면 true, 다르면 false
//			for(int i=0;i<idx;i++) {
//				if(c[i] == temp) 
//					isSame=true;
//					
//				
//			}
//			if(!isSame)
//			c[idx] = temp;
//			
//		}
//		if(idx == c.length) break; // idx의 값이 배열크기와 같으면 배열의 마지막 공간까지 데이터 저장완
//	}
//	for(int i=0;i<c.length; i++) {
//		System.out.println(c[i]);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
