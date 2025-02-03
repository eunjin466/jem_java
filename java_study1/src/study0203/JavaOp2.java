package study0203;

public class JavaOp2 {
	public static void main(String[] args) {
		
		// switch문
		// if문 
		
//		switch(메뉴선택) { 여러개의 선택지중 하나를 선택하게끔 하는 함수
//		case 파일열기:
//		case 파일저장:
//		case 종료:
//		}
		
		
//		switch( 10 ) {
//		case 1: 
//			System.out.println( "1을 선택");
//			break;
//		case 3:
//			System.out.println( "3을 선택");
//			break;
//		case 10:
//			System.out.println( "10을 선택" );
//			break;
//			}
//		
//		
//		switch ("가마") { 
//		case "가나다라":
//			System.out.println("1을 선택");
//		}
		
		switch (30) {
		case 10:
			System.out.println( "10을 선택");
		case 30:
			System.out.println( "30을 선택");
		case 20:
			System.out.println( "case에 표현하는 데이터는 정수,문자,문자열");
			break;
		case 50:
			System.out.println( "입력된 값에 맞는 case 실행은 " + "break 또는 } 까지 실행");
				break;
		default:
			System.out.println("case에 없는 값이야 다시");
	
		}
		
		
		
		
		
		
	}
}
