package java_thread;

public class Create extends Thread{
	
	public static Dino egg=null;
	public static void hatch(Dino dino) {
		egg = dino;
	}
		
	
	@Override
	public void run() {
		while(true) {
			
		try {
			Thread.sleep(50);
		}catch(Exception e) {
			
		}
			if(egg != null) {
				System.out.println("부화시작");
			try {	
				Thread.sleep(egg.getTime()*1000);
			}catch (Exception e) {}
				System.out.println(egg.getName()+ "공룡태어남");
				egg = null;
			
			
			}
		}
	}
}
