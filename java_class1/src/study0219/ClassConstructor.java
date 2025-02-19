package study0219;

public class ClassConstructor {
	public static void main(String[] args) {
		
		
		
		Food f1 = new Food("돈까스",8000);
	// 기본 생성자 매서드가 존재하기에 Food() 실행됨
		
		System.out.println(f1.foodName);
		
		
		Product pd = new Product("바지",10);
		System.out.println(pd.pdName);
	}
}
