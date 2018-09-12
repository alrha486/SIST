package controlSection;
import java.sql.SQLException;
import java.util.Vector;

import dataObjectSection.VIRTUAL_OBJ_Restaurant;
import jdbcSection.DAO_MemberTable;
import jdbcSection.DAO_RestaurantTable;

public class DAR_SelectController {
	
	
	
		public static int userCheck(String m_id, String m_pw) {
			int result = 0;
			try {
				result = DAO_MemberTable.userCheck(m_id, m_pw);
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return result;
		}
		
		

		public static Vector<VIRTUAL_OBJ_Restaurant> selectRestaurants(int key) {
			Vector<VIRTUAL_OBJ_Restaurant> vector = null;
			try {
				vector = DAO_RestaurantTable.selectRestaurants(key);
			}catch(SQLException ex) {
				System.out.println(ex);
			}
			return vector;
		}
		
		
		
		
}
