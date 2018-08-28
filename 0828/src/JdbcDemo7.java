import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo7 {
	public static void main(String[] args) throws SQLException{
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement(
			ResultSet.TYPE_SCROLL_SENSITIVE,
			ResultSet.CONCUR_UPDATABLE
				);
		String a = "วัม๖นฮ";
		ResultSet rs = stmt.executeQuery("SELECT *FROM Member");
		rs.first();
		rs.updateString(2, "วัม๖นฮ");
		rs.updateRow();
		
		
//		rs.first();
//		rs.deleteRow();		
//		rs.moveToInsertRow();
//		rs.updateString(1, "ggg"); 
//		rs.updateString(2,a);
//		rs.updateInt(3, 45);
//		rs.insertRow();
		
		DBClose.close(conn);
	}
}
