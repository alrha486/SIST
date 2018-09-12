package jdbcSection;
	
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dataObjectSection.STATSAVE_StatementClass;
import dataObjectSection.VIRTUAL_OBJ_Member;
	
public class DAO_MemberTable {

	   // 1 : all success, 0 : no account, -1 : password error
	   public static int userCheck(String m_id, String m_pw) throws SQLException {
		   
	      String query = "SELECT m_di FROM member WHERE m_id = '"+m_id+"' AND m_pw = '"+m_pw+"';";
	      Statement stmt = JDBC_DBConnection.connProject.createStatement();
	      ResultSet rs = stmt.executeQuery(query);
	      System.out.println("[QUERY EXCUTED BY LOGIN_BUTTON : "+query+"]");
	      
	      if (!rs.next()) {
	    	 System.out.println("ID OR PASSWORD INCORRECT");
	    	 stmt.close();
	    	 rs.close();
	         return 0;
	      } 
	      else {
	    	  STATSAVE_StatementClass.loginedUser = Integer.parseInt(rs.getString("m_di"));
	         stmt.close();
	    	 rs.close();
	    	 return STATSAVE_StatementClass.loginedUser;
	      }

	   }//userCheck
	   
	   
	   
	   
	   
	   public static VIRTUAL_OBJ_Member insert_membership(VIRTUAL_OBJ_Member m) throws SQLException {
		      
		    	  String query = "INSERT INTO member VALUES(NULL,2,?,?,?,?,?);";
			      PreparedStatement pstmt = JDBC_DBConnection.connProject.prepareStatement(query);
			      pstmt.setString(1, m.getM_name());
			      pstmt.setString(2, m.getM_age());
			      pstmt.setString(3, m.getM_id());
			      pstmt.setString(4, m.getM_pw());
			      pstmt.setString(5, m.getM_gender());
			      pstmt.executeUpdate();
			      System.out.println("[QUERY EXCUTED BY SIGNIN_BUTTON : "+query+"]");
			      VIRTUAL_OBJ_Member mVO = null;

			      pstmt.close();
			      return mVO;
		      
		      
		   }

	   
}
