package exception5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int money =0;
//		int total = 0;
//		
//		try {
//			System.out.print("현금: ");
//			money = sc.nextInt();
//			total = money*5;
//			System.out.println("총 금액: "+ total);
//			
//		}catch( Exception e) {
//			System.out.println("숫자만 입력하세요");
//		}finally {
//			System.out.println("총 금액: " + total);
//		} // 파일열기, 데이터베이스 연결에서는 반드시 파일을 닫고,
//		 // 데이터 베이스 연결헤제 하는게 좋다
		
		String fileName = "c://test//data.txt";
		
		// 자동 자원 변환 : 파일열기와 같은 작업시 사용한 컴퓨터 지원(메모리, 버퍼 등)
		//			을 반환 해야 한다. 자동으로 반환 까지 해주는  try ~ catch 
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			 String line = br.readLine();
			 System.out.println( line );
		}
		
		
		
		
		
		
		
		
//		 try {
//		BufferedReader read = new BufferedReader(new FileReader(fileName));
//		String line = read.readLine();
//		System.out.println( line );
//		
//		 }catch( Exception e) {
//			 System.out.println("파일 열고 오류 읽기");
//			 e.printStackTrace();
//		 }finally {
//			 read.close();
//		 }
//		 }
//		
	}

}
