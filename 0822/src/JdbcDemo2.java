// 1. import 한다
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
	
	public static void main(String[] args) {
		DBConnection dbconn = new DBConnection(); 
		// 생성자호출 시 properties파일 세팅 
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = dbconn.getConnection();
		// 커넥션 세팅
			
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		//5. SQL 문장 실행하기
	      String sql = "SELECT * FROM city WHERE countrycode = 'KOR'";
	      try {         
	         rs = stmt.executeQuery(sql);
	         //6. ResultSet 결과 보기
	         while(rs.next()){//다음 레코드가 더 이상 없을 때 까지.
	            String name = rs.getString("name");
	            int population = rs.getInt(5);//index 번호 == 5번째
	            System.out.printf("name = %s    population = %d \n", name ,population);
	         }
	      }catch(SQLException e) {
	         System.out.println(e);
	      }
	      
	      DBClose.close(conn,stmt,rs);
	   }
	}