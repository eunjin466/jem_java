package interface4;

public class Tv implements remoteCon{

	@Override
	public void turnon() {
		System.out.println("켜짐");
		
	}

	@Override
	public void turnoff() {
		System.out.println("꺼짐");
		
	}

	
}