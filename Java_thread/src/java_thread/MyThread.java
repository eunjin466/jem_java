package java_thread;

public class MyThread extends Thread{
	
	public MyThread() {}
	public MyThread(String name) {
		super(name); //부모클래스(Thread)에 닉네임 저장
		
	}
	
	
	
	
	
	
	@Override
	public void run() {
	System.out.println("스레드시작");	
	for(int i=1; i<=10; i++) {
		System.out.println(i + this.getName());
		try{Thread.sleep(1000);}catch(Exception e) {}
	}
	
	}

}
 