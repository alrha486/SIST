import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
		private Properties dbinfo;
		
		public DBConnection() {
			this.dbinfo = new Properties();
			File file = new File("./dbinfo.properties");
			try {
				this.dbinfo.load(new FileInputStream(file));
			} catch (IOException e) {
				System.out.println("파일을 찾을 수 없습니다.");
				System.exit(-1);
			}
		}	

	public Connection getConnection() {
		Connection conn = null; // connection은 url, id, pw으로 연결
		try {
			conn = DriverManager.getConnection(dbinfo.getProperty("DBURL"), // url
												dbinfo.getProperty("DBUSER"), // user
												dbinfo.getProperty("DBPWD"));  // pwd
			System.out.println("Connect Success");
		} catch (SQLException e) {
			System.out.println("Not Connect");
		}
		return conn;
	}
}

