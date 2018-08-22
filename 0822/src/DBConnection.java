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
				System.out.println("������ ã�� �� �����ϴ�.");
				System.exit(-1);
			}
		}	

	public Connection getConnection() {
		Connection conn = null; // connection�� url, id, pw���� ����
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

