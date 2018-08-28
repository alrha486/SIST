package 우편번호검색;

//DB 닫는 애
import java.sql.Connection;
import java.sql.SQLException;

public class DBClose {
	public static void close(Connection conn) {
			try {
				if(conn != null) conn.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
	}
}
