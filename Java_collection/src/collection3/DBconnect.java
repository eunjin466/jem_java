package collection3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnect {
	public Connection conn;	
	public Statement st;
	public ResultSet rs;
	
	public DBconnect() {
		connection();
	}
	
	private void connection() {
		//드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 계정 로그인
			String user = "jjam"; // 계정명
			String password = "1234"; // 비번	
			String url = "jdbc:mysql://localhost:3306/jjam"; // db주소
			conn = DriverManager.getConnection(url,user,password);
		}catch (Exception e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		}
		
	}
}
