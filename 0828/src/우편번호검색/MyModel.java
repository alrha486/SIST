package �����ȣ�˻�;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class MyModel extends DefaultTableModel{
	private String key;
	
	public MyModel(String key) {
		this.key = key;
		Vector<String> columVector = new Vector<String>(1,1);
		String [] array = {"�����ȣ", "��/��", "��/��", "��/��/��", "����"};
		for(String str : array) columVector.addElement(str);
		this.setDataVector(getZipcodeData(),columVector);
		
	
	}
	
	private Vector<Object> getZipcodeData(){
		Vector<Object> dataVector = new Vector<Object>(1,1);
		Vector <ZipSearchVO> vector = null;
		
		if(this.key == null) vector = SelectController.selectAll();
		else vector = SelectController.select(this.key);
		for(int i=0; i<vector.size() ; i++) {
			ZipSearchVO zip = vector.get(i);
			Vector<String> rowVector = new Vector<String>(5); 
			rowVector.addElement(zip.getZipcode());
			rowVector.addElement(zip.getSido());
			rowVector.addElement(zip.getGugun());
			rowVector.addElement(zip.getDong());
			rowVector.addElement(zip.getBunji());
			dataVector.addElement(rowVector);
		}
		return dataVector;
	}
	
	}


