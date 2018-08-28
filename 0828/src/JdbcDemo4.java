import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo4 {
	public static void main(String[] args) throws SQLException{
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		String [] idArray = {"aaa","bbb","ccc","ddd"};
		String [] nameArray = {"한지민", "이진웅", "서정은", "김민호"};
		
		String sql = null; 
		for(int i=0; i<4 ; i++) {
			sql = "INSERT INTO Member(id,name)";
			sql += "VALUES('" + idArray[i] + "','" + nameArray[i] + "')";
			stmt.addBatch(sql);
		}		
		int [] array = stmt.executeBatch();
		if(array.length == 4) {
			System.out.println("입력 성공");
		}else {
			System.out.println("입력 실패");
		}
		if(stmt != null) {
			stmt.close();
		}
		DBClose.close(conn);
	}
}
