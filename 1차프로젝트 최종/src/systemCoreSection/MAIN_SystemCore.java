package systemCoreSection;

import interfaceViewSection.FRAME_Admin;
import interfaceViewSection.FRAME_User;
import interfaceViewSection.STARTVIEW_Login;

public class MAIN_SystemCore{
	STARTVIEW_Login loginView;
	FRAME_User user;
	FRAME_Admin admin;
	
	
	
	// 메인클래스 
	public static void main(String[] args) {	
		MAIN_SystemCore main = new MAIN_SystemCore(); 
		main.loginView = new STARTVIEW_Login(main); // 로그인창 open
	}
	
	// 프레임창user
	public void showUserFrame(){
		
		loginView.dispose(); // 로그인창닫기		
		user = new FRAME_User();
	}
	
    public void showAdminFrame(){
		
		loginView.dispose(); // 로그인창닫기		
		admin = new FRAME_Admin();
		
	}

}




