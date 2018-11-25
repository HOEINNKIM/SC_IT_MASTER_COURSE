import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleTest {
	public static void main(String[] args) {
		Connection conn = null; 		//DB 연결용 객체
		PreparedStatement pstmt = null; //SQL을 전달하는 객체
		ResultSet rs = null;			//select 값을 담을 객체
		
		try {

		//SQL 문장 만들어서 실행
		String sql = "SELECT * FROM REGIONS";
		
		conn = DBConnection.getConnection();	//DB 정보 담아서 연결
		pstmt = conn.prepareStatement(sql);	 //오라클에 SQL을 적는 행위와 같음
		rs = pstmt.executeQuery();	//오라클DB에 SQL 질의 -> 오라클DB에서 데이터 전송 //F9

		//REGIONS 테이블 COLUMN의 데이터 타입
		//칼럼 : REGION_ID NUMBER = int
		//칼럼 : REGION_NAME VARCHAR2 = String
		
		System.out.println("-------------------------------------------");
		while(rs.next()) {
			int region_id = rs.getInt(1);	
			//int region_id = rs.getInt(region_id);
			String region_name = rs.getString(2); 
			//String region_name = rs.getString(region_name);
			
			String result = region_id + " " + region_name + " ";
			System.out.println(result);
		}
		System.out.println("-------------------------------------------");
		
		
		} catch (SQLException e) {
			System.out.println("SQL 실패");
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}