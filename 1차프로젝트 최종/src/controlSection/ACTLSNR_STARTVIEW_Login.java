package controlSection;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import interfaceViewSection.POPUP_SignIn;
import interfaceViewSection.STARTVIEW_Background;
import systemCoreSection.MAIN_SystemCore;

public class ACTLSNR_STARTVIEW_Login implements ActionListener{

	private JTextField userText;
	private JPasswordField passText;
	private STARTVIEW_Background backgroundImg;
	private MAIN_SystemCore main;
	
	
	
	
	public ACTLSNR_STARTVIEW_Login(JTextField userText, JPasswordField passText, 
			STARTVIEW_Background backgroundImg, MAIN_SystemCore main) {
		this.userText = userText;
		this.passText = passText;
		this.backgroundImg = backgroundImg;
		this.main = main;
	}//constructor
	





	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		
		case "Sign in" : 
			
			POPUP_SignIn siginInPopUp = new POPUP_SignIn("?��?���??��");
			siginInPopUp.setModal(true);
			siginInPopUp.setVisible(true);
            break;
		
		
		
		case "Login" : 
		
			int result = DAR_SelectController.userCheck(this.userText.getText(), this.passText.getText());
			switch (result) {
			
				case 0:
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인 해 주세요.");
					this.userText.setText("");
					this.passText.setText("");
					break;
					
				case 1:
					JOptionPane.showMessageDialog(null, "관리자 권한으로 로그인 되었습니다.");
					backgroundImg.dispose();
					main.showAdminFrame(); //
					this.userText.setText("");
					this.passText.setText("");
					break;
					
				case 2:	
					JOptionPane.showMessageDialog(null, "환영합니다.");
					backgroundImg.dispose();
					main.showUserFrame(); //
					this.userText.setText("");
					this.passText.setText("");
					break;
		
			}//small switch (return for event)
		
		}//big switch(Event Divider)

	}//actionPerformed
	
}//class
