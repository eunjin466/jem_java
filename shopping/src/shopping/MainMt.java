package shopping;

import java.util.Scanner;

public class MainMt {
		private static Scanner sc = new Scanner(System.in);
		private static int Menu(Cart cart, String name,int price) {
			System.out.println("\n========= 메뉴 ==========\n");
			System.out.println("1. 상품 담기");
			System.out.println("2. 상품삭제하기");
			System.out.println("3. 상품 총 가격 확인하기");
			System.out.println("4. 종료");
			System.out.print("선택: ");
			int num = sc.nextInt();
			return num;
			
			if( num == 1) {
				Cart.cartIn(name);
			}else if( num == 2) {
				Cart.cartOut(name);
			}else if( num == 3) {
				shoppingMall.cartSum(price);
			}else {
				return 0;
			}
			return Menu(cart,name,price);
		}
		
		public static void main(String[] args) {
				
			Product p1 = new Product();
			p1.name = "트위드 자켓";
			p1.price = 79000;
			p1.amount = 2;
			
			Product p2 = new Product();
			p2.name = "검정청바지";
			p2.price = 45000;
			p2.amount = 5;
			
			
	}

}
