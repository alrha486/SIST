import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo4 {
	public static void main(String[] args) throws SQLException{
		Connection conn = DBConnection.getConnection();
		Statement stmt = conn.createStatement();
		String [] idArray = {"aaa","bbb","ccc","ddd"};
		String [] nameArray = {"������", "������", "������", "���ȣ"};
		
		String sql = null; 
		for(int i=0; i<4 ; i++) {
			sql = "INSERT INTO Member(id,name)";
			sql += "VALUES('" + idArray[i] + "','" + nameArray[i] + "')";
			stmt.addBatch(sql);
		}		
		int [] array = stmt.executeBatch();
		if(array.length == 4) {
			System.out.println("�Է� ����");
		}else {
			System.out.println("�Է� ����");
		}
		if(stmt != null) {
			stmt.close();
		}
		DBClose.close(conn);
	}
}
