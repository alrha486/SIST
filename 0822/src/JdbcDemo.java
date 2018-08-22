// 1. import �Ѵ�
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		// 2. jdbc mysql driver loading
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // com.mysql.jdbc.Driver Ŭ������ �޸𸮿� ���ε�
			System.out.println("Success");				// ���ε� �� DriverManager �� ����
		} catch (ClassNotFoundException e) { 
			System.out.println("Class�� ã�� �� �����ϴ�."); 
		}
		
		
		// 3. Database Connection 
		String url = "jdbc:mariadb://localhost:3306/world"; // jdbc URL
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, "root", "javamariadb"); 
			System.out.println("Connect Success");
		} catch (SQLException e) {
			System.out.println("Not Connect");
		}
		
		
		// 4. Statement ��ü ����		
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		//5. SQL ���� �����ϱ�
	      String sql = "SELECT * FROM city WHERE countrycode = 'KOR'";
	      ResultSet rs = null;
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
	      
	      try {
	    	  if(rs != null) rs.close();
	    	  if(stmt != null) stmt.close();
	    	  if(conn != null) conn.close();
	      }catch(SQLException e) {
	    	  System.out.println(e);
	      }
	      
	   }
	}