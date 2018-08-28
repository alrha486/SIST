import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Scrollable Statement
public class JdbcDemo6 {
	public static void main(String[] args) throws SQLException{
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
		ResultSet rs =stmt.executeQuery("SELECT *FROM Student");
//		rs.afterLast();
//		while(rs.previous()) {
//			System.out.println(rs.getString("hakbun"));
//		}
		
		rs.first(); // 첫번 째 행
		System.out.println(rs.getString("hakbun"));
//		rs.deleteRow();
//		rs.last(); // 마지막 행
//		System.out.println(rs.getString("hakbun"));
//		rs.absolute(3); // 지정 행
//		System.out.println(rs.getString("hakbun"));
//		rs.relative(-1);  // 현재행 -1 행
//		System.out.println(rs.getString("hakbun"));
		DBClose.close(conn);
	}
}
