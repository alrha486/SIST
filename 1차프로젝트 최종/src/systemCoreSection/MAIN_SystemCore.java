package systemCoreSection;

import interfaceViewSection.FRAME_Admin;
import interfaceViewSection.FRAME_User;
import interfaceViewSection.STARTVIEW_Login;

public class MAIN_SystemCore{
	STARTVIEW_Login loginView;
	FRAME_User user;
	FRAME_Admin admin;
	
	
	
	// ����Ŭ���� 
	public static void main(String[] args) {	
		MAIN_SystemCore main = new MAIN_SystemCore(); 
		main.loginView = new STARTVIEW_Login(main); // �α���â open
	}
	
	// ������âuser
	public void showUserFrame(){
		
		loginView.dispose(); // �α���â�ݱ�		
		user = new FRAME_User();
	}
	
    public void showAdminFrame(){
		
		loginView.dispose(); // �α���â�ݱ�		
		admin = new FRAME_Admin();
		
	}

}




