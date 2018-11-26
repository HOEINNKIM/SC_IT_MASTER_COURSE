import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection(){
		
		Connection conn = null; // 오라클 DB 연결용 객체

		try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hr";
			String password = "hr";
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 로딩 익셉션1
			conn = DriverManager.getConnection(url, user, password);//오라켈 접속 익셉션2
			
			System.out.println("접속 ok");
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패"); //익셉션 1
		} catch(SQLException se) {
			System.out.println("접속 실패"); //익센션 2
		}
		
		return conn;
	}	
}