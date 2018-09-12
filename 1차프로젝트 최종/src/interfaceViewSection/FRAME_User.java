package interfaceViewSection;

import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import dataObjectSection.STATSAVE_StatementClass;
import jdbcSection.JDBC_DBClose;



public class FRAME_User extends JFrame{
	
	WIN_User interfaceForUSER = new WIN_User();
	
	public FRAME_User() {
		setLayout(new CardLayout());
		setTitle(STATSAVE_StatementClass.systemVersion);
		add("interfaceForUSER", interfaceForUSER);
		setSize(1200, 750);
		setLocationRelativeTo(null);
		setResizable(false);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("CLOSED : USER");
				JDBC_DBClose.close();
				System.exit(0);
			}
		});
		setVisible(true);
	}
	
}