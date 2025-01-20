package study0116;

public class test {
	// class 제목 표기는 카멜표기법으로 기입 (제목은 첫글자가 대문자로)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주석 - 설명이나 메모,코드대기 등등
		/*
		 * 여러줄 주석 - 주석은 프로그램으로 실행되지 않는다. 각 코드의 설명을 작성 하는 용도로 사용하면 됨 
		 * 
		 * 
		 */
		System.out.println("자바 이클립스 테스트");
		
		// 데이터를 사용하려면 변수를 선언해야한다.
		int age; 
		age = 100; // age 변수에 100 저장 (대입연산)
		age = 27;
		age = '가'; // 자바에서 ''표현은 문자를 의미
				   //"" 표현은 문자열을 의미

	System.out.println(27);
	System.out.println(27);
	byte num1=120;
	System.out.println( num1 );
	
	
	int num2 = 20; //변수를 선언하면서 데이터 저장 - 변수 초기화
	int num3 = 43;
	
	//num3은 43이다.라고 하면 안됨 num3과 43이 같다는 표현이라
	//	num3을 저장했다, num3에 43을 대입 했다.라고 표현한다.
	int sum = num2+num3;
	System.out.println( sum );
	
	
	int blue = 20;
	int red =15;
	int white =0;
	//	파란컵에 오렌지주스가 20ml가 있다
	// 빨간컵에 딸기주스가 15ml있다
//	파란컵에 딸기주스를, 빨간컵에 오렌지주스를 담으려면 어떻게 해야하는가?
//	bule , red 값 출력
	white = blue;
	blue = red;
	red = white;

	
	System.out.println( blue );
	System.out.println( red );
	
	
	int birth_year = 1991;
//	 김철수가 태어난 년도를 birth_year에 저장했다.
//	나이는?
	int myAge= 2025 - birth_year;
	System.out.println( myAge );
	
	// 변수란 데이터(값)을 저장 할 수 있는 메모리공간
	// 변수의 공간에는 데이터타입에 맞는 데이터만 저장 할수 있게 해줘야한다.
	// 변수의 선언은 데이터 타입 변수명 (예- int num;)
	// 변수의 이름은 카멜표기법이 일반적이다.
	// 변수이름은 변수의 사용목적에 맞는 이름으로 한다.(길어도됨)
	
	float fnum = 2.156f;
	// java에서는 실수를 표현할때 뒤에 꼭 f를 붙혀야한다.
	System.out.println(fnum);
	fnum = 2.123456789f;
	System.out.println(fnum);
	double dnum = 1.1234567890123456789;
	System.out.println(dnum);
	
	char ch = 'a';
	System.out.println(ch);
	ch = '가';
	System.out.println(ch);
	ch = 97;
	System.out.println(ch);
	ch = 'H';
	System.out.println( ch-'A');
	System.out.println('J' - 64);
	
	//string name = "홍길동"; // 문자열은 string 클래스 타입 사용

	
	
	boolean isApple = true; // 참, 거짓 값을 가지는 타입
	System.out.println(isApple);
	
	int a =2;
	
	int 한개피단축 =2;
	int 일년 =365;
	int 흡연기간 =20;
	int 하루담배 = 5;  // 하루에 5개피씩 매일 흡연
	
	int 단축수명 = 하루담배 * 한개피단축 * 일년 * 흡연기간;
	int 단축수명시간 = 단축수명/60;
	int 단축수명일 = 단축수명시간/24;
	System.out.println("총 단축시간(분):" + 단축수명);
	System.out.println(단축수명시간);
	System.out.println(단축수명일);
	
	
	}

}
