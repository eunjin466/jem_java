package customer;

import store.Banana;
import store.Fruit;
import store.Grape;
import store.Orange;

public class MainMethod {

	public static void main(String[] args) {
		// 바나나와 포도, 오렌지  갯수가 많이 필요하다면???
		// 바나나 - 15개 ,  포도 - 6개, 오렌지 - 54개
		// 망고, 수박, 토마토 등등등
//		Banana[] ba = new Banana[15];
//		
////		ba[0].makeJuice();  아직 banana객체없기에 null이기에 오류
//		
//		ba[0] = new Banana(2500,500);
//		ba[1] = new Banana(3500,500);
//		ba[2] = new Banana(4500,500);
//		ba[3] = new Banana(5200,500);
//		
//		ba[0].makeJuice();

		
		// 다형성  -  하나의 타입으로 여러 타입을 다룰 수 있다.
		//   상속 관계 , implements 

//		Fruit f = new Banana(2500,500); 
//		f.makeJuice();
//		Fruit g = new Grape(3500,400);
//		g.makeJuice();
		
		Fruit[] menu = new Fruit[10];
		// 데이터베이스 연결하기 ( 드라이버로드 )
//		com.mysql.cj.idbc.Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver")
//		menu[2].makeJuice();
//		menu[6].pieceFruit();
		
		Buyer ctm1 = new Buyer(10000); // 구매자
		
		for( Fruit m : menu ) {
			System.out.println( m );
			// 출력 결과 ->  바나나 2500원 350ml
		}
		
		System.out.println( ctm1 );
		
		// 출력 결과 -> 보유 머니 : 10000원 
		
		//System.out.println(" 보유머니 : " + ctm1.getMoney()  );
	}

}

/* 	자바프로그램에서 데이터베이스 사용하기
 	1. 데이터베이스와 연결하기 위한 드라이버 로드
 	2. 계정 로그인
 	3. 쿼리문 작성하여 주고 받고 하기

/*
 		int[] n = new int[]{1,2,3,4,55,11,22};
 		
 		for( int a : n ){
 			
 		}
 */



