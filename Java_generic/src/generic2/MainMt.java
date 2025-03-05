package generic2;

public class MainMt {

	public static void main(String[] args) {
		
		
//		Bottle<String> b1 = new Bottle<String>();
//		// Bottle 클래스의 제네릭 타입으로 String 지정
//		// String item 으로 변경,
//		// make 메서드의 매개변수 String item으로 변경
//		
//		b1.make("레몬소주");
		
		
		Soju sj = new Soju("참이슬","진로",16);
		Bottle<Soju> 참이슬 = new Bottle<>();
//		참이슬.make( sj );
		Soju al = (Soju)참이슬.item;
		
		Makgeolli mg =  new Makgeolli("공주 밤막걸리","사곡 양조원",6);
		Bottle<Makgeolli> 밤막걸리 = new Bottle<>();
		밤막걸리.make( mg );

		Service 은호 = new Service();
		은호.drink(참이슬);
//		al.aa();
		
		Service 수영 = new Service();
		수영.drink(밤막걸리);
		
		
		Wine wn = new Wine("디안느 소비뇽","앙드레 뤼통",13);
		Bottle<Wine> 소비뇽 = new Bottle<>();
		소비뇽.make( wn );
		
		Bottle<Alcohol> 술병 = new Bottle<>();
		술병.make( wn );
		
//		술병 = 참이슬; //불가능
		
		Alcohol ach = sj; // 가능
		
		
		
		Bottle<Alcohol> 소주병 = new Bottle<>();
		소주병.make( sj );
		
		
		
//		Bottle<Toy> 티니핑 =  new Bottle<>();
//		티니핑.make(new Toy());
		
		
		
	}

}
