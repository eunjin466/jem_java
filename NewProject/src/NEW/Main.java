package NEW;

public class Main {

	public static void main(String[] args) {
		
		CUP cup1 = new CUP();
		cup1.ml = 500;
		cup1.type = "떡볶이";
		
		CUP cup2 = new CUP();
		cup2.ml = 300;
		cup2.type ="오렌지주스";
		
		CUP cup3 = new CUP();
		cup3.ml = 800;
		cup3.type ="딸기라떼";
		
		cup1.getType();
		
		CAR a = new CAR();
		a.km = 2;
		a.L = 10;
		a.type = "캐스퍼";
		a.color = "카키";
		a.count = 4;
		
		CAR b = new CAR();
		b.km = 4;
		b.L = 30;
		b.type = "그랜저";
		b.color = "흰색";
		b.count = 4;
		
		CAR c = new CAR();
		c.km = 6;
		c.L = 25;
		c.type = "스타렉스";
		c.color = "검정";
		c.count = 12;
		
		a.getPlan("정동해", "아저씨 돈까스");
		
		Friand f = new Friand("남자",24,"정동해");
		Friand r = new Friand("여자",25,"최지수");
		
		f.getGender();
		r.getGender();
		
		f.getYear();
		r.getYear();
		
		PLACE p = new PLACE("카페","스타벅스");
		PLACE l = new PLACE("음식점","아저씨돈까스");
	}

}
