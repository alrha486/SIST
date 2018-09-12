package jdbcSection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import dataObjectSection.STATSAVE_StatementClass;
import dataObjectSection.VIRTUAL_OBJ_Restaurant;

	public class DAO_RestaurantTable {
	
		
		public static Vector<VIRTUAL_OBJ_Restaurant> selectRestaurants(int division) throws SQLException{
			
			String query = null;
			Statement stmt = JDBC_DBConnection.connProject.createStatement();
			ResultSet rs;
			Vector<VIRTUAL_OBJ_Restaurant> vector = new Vector<VIRTUAL_OBJ_Restaurant>(1,1);
			vector.clear();
			
			
			if(STATSAVE_StatementClass.loginedUser == 1) {
				if(division == 0) {
					query = "SELECT r.r_no, d.d_division, r.r_name, r.r_address, r.r_menu FROM restaurant r, division d WHERE r.d_no = d.d_no ORDER BY r.r_no;";
					STATSAVE_StatementClass.statLatestSelected = division;
					System.out.println("[LATEST BUTTON SELECTED STAT : "+STATSAVE_StatementClass.statLatestSelected+"]");
				}
				else {
					query = "SELECT r.r_no, d.d_division, r.r_name, r.r_address, r.r_menu FROM restaurant r, division d WHERE r.d_no = d.d_no AND r.d_no = "+division+" ORDER BY r.r_no;";
					STATSAVE_StatementClass.statLatestSelected = division;
					System.out.println("[LATEST BUTTON SELECTED STAT : "+STATSAVE_StatementClass.statLatestSelected+"]");
				}
				
				rs = stmt.executeQuery(query);
				
				System.out.println("[QUERY EXCUTED BY SELECT_BUTTON : "+query+"]");
				System.out.println("\n---------------------------- DATA BROUGHT FROM SQL SELECT QUERY ----------------------------\n");
				while(rs.next()) {
					
					System.out.println(rs.getString("r_no")+"  "+rs.getString("d_division")+"  "+rs.getString("r_name")+"  "+
							rs.getString("r_address")+"  "+rs.getString("r_menu"));
					
					VIRTUAL_OBJ_Restaurant res = new VIRTUAL_OBJ_Restaurant(rs.getString("r_no"),
							rs.getString("d_division"),rs.getString("r_name"),
							rs.getString("r_address"),rs.getString("r_menu"));
					
					vector.addElement(res);
				}
				stmt.close();
		    	rs.close();
				return vector;
			}
			//Admin Login----------------------------------------------------------------------------------------------------------------------------
			else if(STATSAVE_StatementClass.loginedUser == 2) {
				if(division == 0) {
					query = "SELECT d.d_division, r.r_name, r.r_address, r.r_menu FROM restaurant r, division d WHERE r.d_no = d.d_no ORDER BY r.r_no;";
					STATSAVE_StatementClass.statLatestSelected = division;
					System.out.println("[LATEST BUTTON SELECTED STAT : "+STATSAVE_StatementClass.statLatestSelected+"]");
				}
				else {
					query = "SELECT d.d_division, r.r_name, r.r_address, r.r_menu FROM restaurant r, division d WHERE r.d_no = d.d_no AND r.d_no = "+division+" ORDER BY r.r_no;";
					STATSAVE_StatementClass.statLatestSelected = division;
					System.out.println("[LATEST BUTTON SELECTED STAT : "+STATSAVE_StatementClass.statLatestSelected+"]");
				}
				
				rs = stmt.executeQuery(query);
				int userRawNumb = 1;
				
				System.out.println("[QUERY EXCUTED BY SELECT_BUTTON : "+query+"]");
				System.out.println("\n---------------------------- DATA BROUGHT FROM SQL SELECT QUERY ----------------------------\n");
				
				while(rs.next()) {
					
					System.out.println(userRawNumb+"  "+rs.getString("d_division")+"  "+rs.getString("r_name")+"  "+
							rs.getString("r_address")+"  "+rs.getString("r_menu"));
					
					VIRTUAL_OBJ_Restaurant res = new VIRTUAL_OBJ_Restaurant(Integer.toString(userRawNumb),
							rs.getString("d_division"),rs.getString("r_name"),
							rs.getString("r_address"),rs.getString("r_menu"));
					
					vector.addElement(res);
					userRawNumb++;
				}
				stmt.close();
		    	rs.close();
				return vector;
			}//User Login
			return vector;
		}//selectRestaurants
		
		
		
		
		
		
		
		public static void insert_Restaurant(VIRTUAL_OBJ_Restaurant m) throws SQLException {
		      
		    	  String query = "INSERT INTO restaurant VALUES(?,?,?,?,?);";
			      PreparedStatement pstmt = JDBC_DBConnection.connProject.prepareStatement(query);
			      pstmt.setString(1, m.getR_no());
			      pstmt.setString(2, m.getR_division());
			      pstmt.setString(3, m.getR_name());
			      pstmt.setString(4, m.getR_address());
			      pstmt.setString(5, m.getR_menu());
			      pstmt.executeUpdate();
			      System.out.println("[QUERY EXCUTED BY INSERT_BUTTON : "+query+"]");
			      pstmt.close();
		   }
		
		
		
		
		
		
		
		public static void delete_Restaurant(int pkCode) throws SQLException {
		      
		    	  String query = "DELETE FROM restaurant WHERE r_no = ? ;";
			      PreparedStatement pstmt = JDBC_DBConnection.connProject.prepareStatement(query);
			      pstmt.setString(1, pkCode+"");
			      pstmt.executeUpdate();
			      System.out.println("[QUERY EXCUTED BY DELETE_BUTTON : "+query+"]");
			      pstmt.close();
		   }
	}

