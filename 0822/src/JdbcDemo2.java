// 1. import �Ѵ�
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
	
	public static void main(String[] args) {
		DBConnection dbconn = new DBConnection(); 
		// ������ȣ�� �� properties���� ���� 
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = dbconn.getConnection();
		// Ŀ�ؼ� ����
			
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		//5. SQL ���� �����ϱ�
	      String sql = "SELECT * FROM city WHERE countrycode = 'KOR'";
	      try {         
	         rs = stmt.executeQuery(sql);
	         //6. ResultSet ��� ����
	         while(rs.next()){//���� ���ڵ尡 �� �̻� ���� �� ����.
	            String name = rs.getString("name");
	            int population = rs.getInt(5);//index ��ȣ == 5��°
	            System.out.printf("name = %s    population = %d \n", name ,population);
	         }
	      }catch(SQLException e) {
	         System.out.println(e);
	      }
	      
	      DBClose.close(conn,stmt,rs);
	   }
	}