package study0220;

public class JavaMethod {
	// 매서드에 반환 값(출력값)이 없는 경우 void 타입으로 작성한다
	
	
	// 매서드 정의
	//반환과 매개변수 없는 매서드 형태
	// 외부 데이터도 필요없고 출력하는 값도 없기때문에
	// 대부분 단순 출력용이 많다. 메뉴같은거
	// 또는 클래스 객체의 매서드인경우에도 반환과 매개변수 없이 정의한다.
	
	static void output() {
		System.out.println(" 반환이 없는 ");
		System.out.println("매개변수도 없는 메서드");
	}
	// 반환없고 매개변수 있는 매서드
	// 매서드의 내용을 실행하는데 필요한 데이터를 가지고 있지 않다면
	// 매서드 외부에서 데이터를 가져와야한다.
	static void sum(int num1, float num2 ) { //두정수의 합 구해서 출력까지
		System.out.println("합: " + (num1 + num2));
		
	}
	
	// 반환이 있고 매개변수 필요없는 메서드 - int num = scan.nextInt();
	// 매개변수가 필요없기 때문에 자체적으로 필요한 데이터를 생성 할 수 있거나 
	// 클래스 객체가 가지고 있는 인스턴스 변수의 데이터를 가공
//	static void total() {
//		int a=10, b=20,c=30;
//		int tot = a+b+c;
//		return tot;
//	}
	
	// 반환, 매개변수가 있는 매서드 name.equals("박문수");
	static String game(int val) {
		if(val == 1)
		return "가위";
		if( val == 2)
		return "바위";
		if( val == 3)
		return "보";
		return "잘못입력"; // 반환이 있는 매서드에서 if문으로 return을 했다면
						// 참인경우에만 동작 할 수있기 때문에 별도의 return이 필요
		
	}
	
	// 두개 정수중 큰값을 출력하는거 만들기
	// 두 정수 비교하고 출력하는 매서드 필요
	// 반환없고 매개변수 있는 매서드로
	static void max(int n1, int n2) {
		if(n1 > n2)
			System.out.println("큰수: " + n1);
		else
			System.out.println("큰수: " + n2);
	}
	
	// 국어점수 : 88, 영어점수 : 91 , 수학점수: 74
	// 세과목의 총점과 평균을 구하시오
	// 총점 계산하는 메서드, 평균계산하는 매서드
	static void su(int t1, int t2, int t3) {
		int tt = t1 + t2 + t3;
		return tt; 
	}
	static void avg(int tt) {
		
	}
		
	public static void main(String[] args) {
		
		
		//출력
		output(); //  => 이렇게 작성헤야 output매서드가 실행된다
		System.out.println("하하하ㅏㅏ");
		
		sum(30,50);
		
		int  a=100, b=232;
		
		sum(a,b);
		
//		int num = total();
		
//		System.out.println( num );
		
		String res = game(2);
		System.out.println( res );
		
		max(150,200);
		
		int kor= 88, eng= 91, mat= 74;
		int totScore = tt(kor, eng, mat);
		System.out.println("총점: " + totScore);
		avg(totScore);
	}

}
