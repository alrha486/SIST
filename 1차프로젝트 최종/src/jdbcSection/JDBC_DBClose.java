package jdbcSection;

import java.sql.SQLException;

public class JDBC_DBClose {
	public static void close() {
		try {
			if(JDBC_DBConnection.connProject != null) {
				JDBC_DBConnection.connProject.close();
				System.out.println("DB CLOSE");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
