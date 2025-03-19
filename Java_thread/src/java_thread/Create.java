package java_thread;

public class Create extends Thread{
	
	public static Dino egg=null;
	public static void hatch(Dino dino) {
		egg = dino;
	}
		
	
	@Override
	public void run() {
		Dino myEgg = null; // 지역변수
		while(true) {
			
		try {
			Thread.sleep(50);
		}catch(Exception e) {
			
		}
// egg 에 값이 들어오고 myEgg에  null 인경우는 공룡알 부화 시작안한상태
// egg 에 값이 들어왔지만 myEgg변수가 값을 가진 경우는 부화시작한 상태
			if(egg != null && myEgg == null ) {
				myEgg = egg; // run 메서드 내부 변수에 값 전달
				egg = null; // 값 전달 했으니까 다시 null
				System.out.println(myEgg.getName()+"부화시작");
			try {	
				Thread.sleep(myEgg.getTime()*1000);
			}catch (Exception e) {}
				System.out.println(myEgg.getName()+ "공룡태어남");
				myEgg = null;  // 공룡이 태어났으니까 다음 알을 받기위해 null
			
			
			}
		}
	}
}
