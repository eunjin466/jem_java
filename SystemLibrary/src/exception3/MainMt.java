package exception3;

public class MainMt {
	
	public static void main(String[] args) {
		
		int[] arr = {10,40,50,20};
		int num = 0;
		try {
		System.out.println( arr[5] );
		}catch( Exception e ) { System.out.println( "인덱스 범위"); }
		
		String str = "123ab";
		try {
			num = Integer.parseInt(str); //Integer.parseInt 는 문자열 -> 정수변환
		}catch( Exception e) {
			System.out.println("정수로 변환불가 - 정수만 입력");
		}
		System.out.println("정수: " + num);
		
		String word = "good bye!!";
		try {
		System.out.println(word.substring(word.indexOf("B")) );
		}catch( Exception e){
			
		}
		try {
		System.out.println(word.substring(word.indexOf("m")) );
		}catch( Exception e ) {
			
		}
		
		
	}

}
