package study0210;

import java.util.Scanner;

public class JavaArray2 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); 
		
		// 7개 정수를 저장 할 수 있는 배열을 선언하고
		// 정수 7개 입력한 뒤 모두 출력
		
//		int[] num = new int[7];
//	
//		
//		for(int i=0; i<num.length;i++) {
//			System.out.println("정수입력: ");
//			num[i] = sc.nextInt();
//		}
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
////		
//		int size=5;
//		
//		int[] age = new int[size];
//		// 정적 배열은 지정된 크기를 변경하기 어렵다
//		// 프로그램 실행시 컴파일 과정에서 배열의 크기가 정해져 있어야
//		// 그만큼 공간을 할장 받는데 배열의 크기가 확정되어 있지 않으면 
//		// 컴파일 과정에서 공산을 할당 받지 못한다.
//		// ( 윈도우에 의해 필요한 만큼 대여받는 건데 정확한 크기가 없으면 대여 안해줌.)
//		
////		age[0] = 10;
////		System.out.println(age[0]);
//
//		int[] sum = new int[3];
//		int[] a = new int[] {10,20,30}
//		int[] b = new int[] {1,5,9};
//		
//		// a 배열과 b 배열의 합을 sum에 저장
//		sum[0] = a[0] + b[0];
//		sum[1] = a[1] + b[1];
//		sum[2] = a[2] + b[2];
		
		//
//		int[] total = new int[10];
//		int[] a = new int[] {10,20,30,40,50};
//		int[] b = new int[] {55,44,33,22,11};
//		
//		for(int i=0; i<total.length; i++) {
//			total[i] = a[i];
//			total[i+5] = b[i];
//			
//			
//		}
//		for (int i=0; i<total.length; i++) {
//			System.out.println(total[i]);
//		}
//		
//		
		
		
//		for(int i =0; i<a.length; i++) {
//			total[i] = a[i];
//		}
//		for(int i=0; i=b.length; i++) {
//			total[i+5] = b[i]; // total[5]=b[0]	, total[6]=b[1]...
//			
//		}
		
		char[]name = new char[5];
		name[0] ='j';
		name[1] ='o';
		name[2] ='h';
		name[3] ='n';
		// name -> john 문자로저장
		// 문자열은 배열이지만 char 배열로는 온전한 문자열 입력이 어렵다.
		// 배열이기때문에 인덱스를 통해 문자 하나씩 입력 저장 해야한다,.
		// 그래서 자바에서는 문자열의 사용을 편하게 하기위해 String 클래스가 존재한다.
		// String클래스에는 내부적으로 char 배열 생성되도록 되어있다.
		
		
		 System.out.println(name);
		 System.out.println("member".length());
	
		String myname = "john";
		System.out.println(myname);
		myname = "설경구";
		System.out.println(myname);
		
		String youName = new String("박문수");
		System.out.println(youName);
	
//		int[] a = new int[] {11,20,55};
//		int[] b = new int[] {13,20,55};
//		
//		for(int i=0; i<a.length; i++) {
//			if(a[i] == b[i]) {
//				System.out.println("같은배열");
//			}else {
//				System.out.println("다른배열");
//			}
//		}
		
//		
//		char[] name1 = new char[] {'주','동','건'};
//		char[] name2 = new char[] {'장','동','건'};
//		
//		//name1과 name2의 이름은 같은 이름인가?
//		
//		boolean isSame = true;
//		for(int b=0; b<name1.length; b++) {
//			if( name1[b] != name2[b])
//				isSame=false;
//		}
//		if(isSame)
//			System.out.println("같은이름");
//		else
//			System.out.println("다른이름");
			
		String name1 = "이동건";
		String name2 = "이동건";
		
		if(name1.equals(name2) )
			System.out.println("같은이름");
		else
			System.out.println("다른이름");
		
		
		System.out.println( name1.compareTo(name2) );
		//comparTo : 0이라면 두 문자열 동일
		// 		양수 : 사전적 순서가 앞일 경우
		// 		음수 : 사전적 순서가 뒤일 경우
		
		
		
		
		
		
		
		
		
		
	}

}
