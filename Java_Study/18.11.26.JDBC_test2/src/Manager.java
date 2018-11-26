import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Manager { // Task-related Object for Database (DAO : Data Access Object)

	public void select1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String sql = "SELECT * FROM MEMBER2";
			conn = DBConnection.getConnection(); // 1번째 : DB접속
			pstmt = conn.prepareStatement(sql); // 2번째 : SQL 구문 준비
			rs = pstmt.executeQuery(); // 3번째 : SQL 실행 후 결과값 담기

			while (rs.next()) {
				System.out.println("아이디는 : " + rs.getString(1));
				System.out.println("이름은 : " + rs.getString(2));
				System.out.println("비밀번호는 : " + rs.getString(3));
			}

		} catch (SQLException e) {
			System.out.println("SQL Exception Error ! ");
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
