package controlSection;
import java.sql.SQLException;
import dataObjectSection.VIRTUAL_OBJ_Restaurant;
import dataObjectSection.VIRTUAL_OBJ_Member;
import jdbcSection.DAO_MemberTable;
import jdbcSection.DAO_RestaurantTable;


	public class DAR_InsertController {
		
		
		
		
	
		public static VIRTUAL_OBJ_Member insert(VIRTUAL_OBJ_Member m) {
			VIRTUAL_OBJ_Member mVO = null;
			try {
				mVO = DAO_MemberTable.insert_membership(m);
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
			return mVO;
		}
		
		
		
		
		
		public static VIRTUAL_OBJ_Restaurant insert(VIRTUAL_OBJ_Restaurant restInfo) {
			try {
				DAO_RestaurantTable.insert_Restaurant(restInfo);
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
			return restInfo;
		}
		
		
		
		
		
		public static void delete(int pkCode) {
			try {
				DAO_RestaurantTable.delete_Restaurant(pkCode);
			}catch(SQLException ex) {
				ex.printStackTrace();
			}
		}
		
		
		
		
		
	}

