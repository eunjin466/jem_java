package study0214;

import java.util.Scanner;

public class JavaTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		
//		문제 1 
//		학생 5명의 시험성적을 키보드를 통해 입력받고 
//		평균 점수를 구하여 출력하시오
//		반드시 시험성적은 배열에 저장
		
		
		int[] grade = new int[5];
		int avg = 0;
		int sum = 0;
		
				for(int i=0;i<5;i++) {
					System.out.println((i+1) +"번째 학생 성적 입력: ");
					grade[i] = sc.nextInt();
				}
	
				for(int i=0; i<grade.length;i++) {
					sum = grade[i] + sum;
					avg = sum / grade.length;
				
				}System.out.println("평균점수: " + avg);
				
				
//				문제 2
//				알파벳 문자 하나를 입력하세요
//				입력한 알파벳으로 시작하는 단어를 모두 찾아 출력하세요
//				그리고 출력한 단어가 총 몇개인지 출력하세요
				
				String[] word = new String[] {
						"apple", "banana", "cherry", "date", "elderberry", 
			            "fig", "grape", "honeydew", "kiwi", "lemon", 
			            "mango", "nectarine", "orange", "papaya", "quince", 
			            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
			            "watermelon", "xigua", "yam", "zucchini", "avocado", 
			            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
			            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
			            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
			            "mangosteen", "nectar", "orange", "peach", "pineapple", 
			            "pear", "plum", "pomegranate", "pear", "lime", 
			            "apricot", "banana", "papaya", "melon", "peach", 
			            "plum", "raspberry", "blueberry", "citrus", "mango", 
			            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
			            "apricot", "blackberry", "currant", "kiwi", "orange", 
			            "lemon", "watermelon", "melon", "tangerine", "apple", 
			            "date", "elderberry", "fruit", "peach", "fruit", 
			            "apple", "cherry", "fig", "honeydew", "jackfruit", 
			            "papaya", "blueberry", "plum", "pomegranate", "grape", 
			            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
			            "strawberry", "dragonfruit", "lime", "pear", "peach"
				};
				System.out.print("알파벳 입력: ");
				char alp = sc.nextLine().toLowerCase().charAt(0);
				
				// 알파벳을 무조건 소문자로 변환
				int total = 0;
				
				for(String str: word) {
					if( str.charAt(0) == alp ) {
						System.out.println(str); total++;
					}
				}
				System.out.println("총 단어갯수: " +total);
				
				
				
				
				
				
				
				
				
				
				
				
		
	}
}
