package Control;

import java.util.Scanner;

import Service.ActiveService;
import Service.SchoolService;
import Service.MemberServie;

public class MyMain {
	private static Scanner sc = new Scanner(System.in);
	private static int menu() {
		
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 종료");
		System.out.print("선택: ");
		int num = sc.nextInt();
		return num;
		
		
	}
	

	public static void main(String[] args) {
			// 서비스 클래스들을 통해 로그인과 학교 찾기를 할것이다.
			ActiveService memberService = new MemberService<>();
			ActiveService schoolService = new SchoolService<>();
			
			
			// 메뉴
			while(true) {
				switch(menu()) {
				case 1 : //로그인
					break;
				case 2 : //회원가입
					break;
				case 3: // 종료
					return;
				default:
					System.out.println("잘못 선택 했습니다.");
				}
			}
			

	}

}
