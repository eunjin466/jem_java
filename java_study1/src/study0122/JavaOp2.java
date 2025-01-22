package study0122;

public class JavaOp2 {
	public static void main(String[] args) {
		
		
		// 증감연산자 ++, --
		int a = 10, b = 10, result = 0;
		// ++ (증가)
		System.out.println("++ 전: " +a);
		a++;
		System.out.println("++ 후: " + a);
		
		++a;
		System.out.println("++a: " +a);
		
		
		// 증감연산자의  위치가 변수 앞, 변수뒤 차이
		a=10;
		result = a++;
		System.out.println("result = a++: " + result );
		result = ++b;
		System.out.println("result = ++b: " + result );
		
		//연산자가 뒤에 붙을 경우 (나중에 증가함)
		// r = a++;
		// r = a;
		// r = a+1;
		
		// 연산자가 앞에 붙을 경우 (우선적으로 증가함)
		// r = ++b;
		// r = b + 1;
		// r = b;
		
		// 연산자가 앞에 붙을때, 뒤에 붙을때 우선순위가 다름 (위치선정 조심)
		// 증감연산자를 변수 앞에 붙히면 우선순위가 상위권
		// 증감연산자를 변수 뒤에 붙히면 우선순위가 하위권
	
		
		
			
	}
}