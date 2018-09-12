package jdbcSection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC_DBConnection {
	
	public static Connection connProject = getConnection();
			
	public static Connection getConnection() {
		Connection conn = null;
		Properties info = new Properties();
		try {
			info.load(new FileInputStream(new File("./dbinfoSS.properties")));
			//Driver Loading วัดู.
			Class.forName(info.getProperty("DBDRIVER"));
			conn = DriverManager.getConnection(info.getProperty("DBURL"), 
					info.getProperty("DBUSER"), info.getProperty("DBPWD"));
		}catch(ClassNotFoundException ex) {
			System.out.println("Driver Class Not Found");
		}catch(IOException ex) {
			System.out.println("File Not Found");  System.exit(-1);
		}catch(SQLException ex) {
			System.out.println("Connection Failure");
		}
		System.out.println("DB CONNECT");
		return  conn;
	}
}
