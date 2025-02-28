package interface4;

public class MainMt {

	public static void main(String[] args) {
		remoteCon [] rcon = new remoteCon[] {
				new Light(), new Tv(),
				new Aircon()
		};
		
		for(remoteCon con : rcon) {
			con.turnon();
			con.turnoff();
			
		}
		
		

	}

}
