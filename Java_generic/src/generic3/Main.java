package generic3;

public class Main {

	public static void main(String[] args) {
	
//		SnackBox<String> a = new SnackBox<String>();
		
		
		
		
		포스틱 과자1 = new 포스틱("눈을감자",1800);
		포스틱 과자2 = new 포스틱("크라운산도",5000);
		SnackBox<포스틱>눈을감자	= new SnackBox<>();
		SnackBox<포스틱>크라운산도= new SnackBox<>();
		눈을감자.makeBox(과자1);
		눈을감자.makeBox(과자2);
		
		
		예감 칩1 = new 예감("오레오",2500);
		SnackBox<예감>오레오 = new SnackBox<>();
		
		오레오.makeBox(칩1);
		
		
		매운새우깡 깡1 = new 매운새우깡("고구마깡",1800);
		매운새우깡 깡2 = new 매운새우깡("양파깡",1500);
		SnackBox<매운새우깡>고구마깡 = new SnackBox<>();
		SnackBox<매운새우깡>양파깡 = new SnackBox<>();
		고구마깡.makeBox(깡1);
		양파깡.makeBox(깡2);
		
		
		
		
		
			
		
		
		
		
		
	}

}
