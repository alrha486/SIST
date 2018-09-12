package dataObjectSection;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import controlSection.DAR_SelectController;

	public class MODEL_TableModel extends DefaultTableModel {
		private String [] columnNames = {"번호", "분류", "상호명", "주소", "메뉴"};
		private Vector<String> columnVector;
		private Vector<Object> dataVector = new Vector<Object>(1,1);
		private Vector<VIRTUAL_OBJ_Restaurant> vObjVector = new Vector<VIRTUAL_OBJ_Restaurant>(1,1);
		private int divisionKey;
		
		
		
		
		
		
		public MODEL_TableModel(int key) {
			
			if(key < 5){ //"All Menu", "Korean", "Western", "Chinese", "Japanese"
				divisionKey = key;
			}
			else if(key>5 && key!=6){
				divisionKey = STATSAVE_StatementClass.statLatestSelected;
			}
			columnVector = new Vector<String>(1,1);
			
			for(String str : columnNames) 
				columnVector.addElement(str);
			this.getRestaurantData();
			this.setDataVector(dataVector, columnVector);
			
		}//constructor 
		
		
		
		
		
		private void getRestaurantData(){
			dataVector.clear();
			vObjVector.clear();
			
			vObjVector = DAR_SelectController.selectRestaurants(this.divisionKey);

			System.out.println("\n---------------------------- SUPPLYING DATA TO TABLE ----------------------------\n");
			for(int i = 0 ; i < vObjVector.size() ; i++) {
				
				VIRTUAL_OBJ_Restaurant res = vObjVector.get(i);
				
				Vector<String> dataVectorRecord = new Vector<String>(1,1);
				
				dataVectorRecord.addElement(res.getR_no());
				dataVectorRecord.addElement(res.getR_division());
				dataVectorRecord.addElement(res.getR_name());
				dataVectorRecord.addElement(res.getR_address());
				dataVectorRecord.addElement(res.getR_menu());
				
				System.out.println(dataVectorRecord.get(0)+"  "+dataVectorRecord.get(1)+"  "+
						dataVectorRecord.get(2)+"  "+dataVectorRecord.get(3)+"  "+dataVectorRecord.get(4));
				dataVector.addElement(dataVectorRecord);
			}
			System.out.println("\n\n\n\n");
		}
		
		@Override
		public boolean isCellEditable(int row, int column) { //수정 불가
			
			return false;
		}
	}

