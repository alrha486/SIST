package controlSection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dataObjectSection.VIRTUAL_OBJ_Restaurant;
import interfaceViewSection.POPUP_InsertData;

public class ACTLSNR_POPUP_InsertData implements ActionListener {
	
	private JTextField [] tfArray;
	private POPUP_InsertData insPopup;
	private JComboBox <String> comboDivision;

	public ACTLSNR_POPUP_InsertData (JTextField [] tfArray, POPUP_InsertData insPopup, JComboBox <String> comboDivision) {
		this.tfArray = tfArray;
		this.insPopup = insPopup;
		this.comboDivision = comboDivision;
	}//constructor

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		
		case "Insert" :
			String comboSelected = comboDivision.getSelectedItem().toString();
			System.out.println(comboSelected);
			String division = (comboSelected.equals("한식")) ? "1" :
							  (comboSelected.equals("양식")) ? "2" :
							  (comboSelected.equals("중식")) ? "3" : "4";
			System.out.println("INSERT BUTTON EVENT.comboBoxHas = "+comboSelected);
			System.out.println("COMBO BOX ITEM CONVERTED TO = "+division);
			VIRTUAL_OBJ_Restaurant virtualObj = null;
			virtualObj = new VIRTUAL_OBJ_Restaurant(tfArray[0].getText(), 
												   division,
												   tfArray[2].getText(),
												   tfArray[3].getText(),
												   tfArray[4].getText());
			DAR_InsertController.insert(virtualObj);
			JOptionPane.showMessageDialog(insPopup, "데이터가 입력되었습니다!",
					"Data Insert", JOptionPane.INFORMATION_MESSAGE);
			
			for(int index =0; index<tfArray.length; index++) {
				if(index == 1) {
					
				}
				else {
					tfArray[index].setText("");
				}
			}//for
			
			break;
		
		case "Reset" : 
			for(int index =0; index<tfArray.length; index++) {
				if(index == 1) {
					
				}
				else {
					tfArray[index].setText("");
				}
			}//for
			break;
		
		default : break;
		}//switch
		
		
	}

}
