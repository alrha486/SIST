package controlSection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dataObjectSection.VIRTUAL_OBJ_Member;
import interfaceViewSection.POPUP_SignIn;


public class ACTLSNR_POPUP_SIGNIN implements ActionListener{
	
	private JTextField [] jTf;
	private JPasswordField jPf;
	
	

	public ACTLSNR_POPUP_SIGNIN(JTextField[] jTf, JPasswordField jPf) {
		this.jTf = jTf;
		this.jPf = jPf;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		
		case "Sign in" : 
			if(jTf[0].getText().equals("") || jTf[1].getText().equals("") ||jTf[2].getText().equals("") || 
					jPf.getPassword().toString().equals(""))//IF : EMPTY TEXT FIELD DETECTED
				{
				JOptionPane.showMessageDialog(null, "회원정보를 모두 입력해주세요." , "Error!", JOptionPane.ERROR_MESSAGE); 
				
				for(int index =0; index<jTf.length; index++) {
					 jTf[index].setText(""); 
					 }
				 jPf.setText(""); 
				 POPUP_SignIn.group.clearSelection();
				 POPUP_SignIn.male.setSelected(true);
				 
			}
			else if (Integer.parseInt(jTf[1].getText()) > 127 || Integer.parseInt(jTf[1].getText()) < 1) {
				JOptionPane.showMessageDialog(null, "나이는 1살부터 127살까지 입력 가능합니다.", "Sign In", JOptionPane.INFORMATION_MESSAGE); 
				for(int index =0; index<jTf.length; index++) {
					 jTf[index].setText(""); 
					 }
				 jPf.setText(""); 
				 POPUP_SignIn.group.clearSelection();
				 POPUP_SignIn.male.setSelected(true);
			}
			else {
				String gender = null; 
				VIRTUAL_OBJ_Member memberData = null;
					if(POPUP_SignIn.male.isSelected()) { 
						gender = "M"; 
						} 
					else { 
						gender = "F"; 
						}
					memberData = new VIRTUAL_OBJ_Member(jTf[0].getText(), 
												jTf[1].getText(), 
												jTf[2].getText(),
												jPf.getText()); 
					memberData.setM_gender(gender);
					 DAR_InsertController.insert(memberData);
					 
					 for(int index =0; index<jTf.length; index++) {
						 jTf[index].setText(""); 
						 }
					 jPf.setText(""); 
					 POPUP_SignIn.group.clearSelection();
					 POPUP_SignIn.male.setSelected(true);
					 JOptionPane.showMessageDialog(null, "회원가입이 성공했습니다!", "Sign In", JOptionPane.INFORMATION_MESSAGE); 
				}
			break;
		case "Reset" : 
			for(int index =0; index<jTf.length; index++) {
				 jTf[index].setText(""); 
				 }
			 jPf.setText(""); 
			 POPUP_SignIn.group.clearSelection();
			 POPUP_SignIn.male.setSelected(true);
			 break;
		}//switch

	}//actionPerformed
}//class

