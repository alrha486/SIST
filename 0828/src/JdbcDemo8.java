import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDemo8 {
	public static void main(String[] args) throws SQLException {
		Connection conn = DBConnection.getConnection();
		conn.setAutoCommit(false);
		Scanner scan = new Scanner(System.in);
		
		String sql = "INSERT INTO Member VALUES(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		System.out.print("ID : ");
		String id = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("age : ");
		int age = scan.nextInt();
		
		pstmt.setString(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, age);
		
		int row = pstmt.executeUpdate();
		if(row ==1) System.out.println("성공");
		else System.out.println("실패");
		
		conn.commit();
		
		DBClose.close(conn);
	}
}
