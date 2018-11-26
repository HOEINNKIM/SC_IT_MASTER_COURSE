import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	
	public ArrayList<Member> select2(){		//ArrayList를 메인으로 리턴
		ArrayList<Member> member = new ArrayList<Member>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			String sql = "SELECT * FROM MEMBER2";
			conn = DBConnection.getConnection(); // 1번째 : DB접속
			pstmt = conn.prepareStatement(sql); // 2번째 : SQL 구문 준비
			rs = pstmt.executeQuery(); // 3번째 : SQL 실행 후 결과값 담기

			while (rs.next()) {
				Member k = new Member(rs.getString(1),rs.getString(2),rs.getString(3));
				member.add(k);				
			}
			
		} catch (SQLException e) {
			System.out.println("SQL Exception Error ! ");
		} finally {
			close(conn, pstmt, rs);
		}
		return member;		
	}
	
	public void insert() {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			String sql = "INSERT INTO MEMBER2 VALUES(?, ?, ?)";
			//or "DELETE FROM MEMBER2 WHERE ID = ?"
			conn = DBConnection.getConnection(); // 1번째 : DB접속
			pstmt = conn.prepareStatement(sql); // 2번째 : SQL 구문 준비
			
			pstmt.setString(1, "red");		//1번째 컬럼값
			pstmt.setString(2, "green");	//2번째 컬럼값
			pstmt.setString(3, "blue");		//3번째 컬럼값
			pstmt.executeUpdate();			//SELECT문을 제외한 INSERT,UPDATE,DELETE문을 실행
			conn.commit();					//커밋
			
			System.out.println("INSERT 완료");
			
		} catch (SQLException e) {
			System.out.println("INSERT Error ! ");
		} finally {
			close(conn, pstmt);
		}
	}
		
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(conn!=null)conn.close();
			if(pstmt!=null)pstmt.close();
			if(rs!=null)rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close(Connection conn, PreparedStatement pstmt) {
		try {
			if(conn!=null)conn.close();
			if(pstmt!=null)pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
