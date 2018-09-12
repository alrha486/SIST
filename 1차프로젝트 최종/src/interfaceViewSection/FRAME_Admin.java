package interfaceViewSection;

import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import dataObjectSection.STATSAVE_StatementClass;
import jdbcSection.JDBC_DBClose;



public class FRAME_Admin extends JFrame{
	
	WIN_Admin interfaceForADMIN = new WIN_Admin();
	
	public FRAME_Admin() {
		setLayout(new CardLayout());
		setTitle("ADMIN PERMISSION - "+STATSAVE_StatementClass.systemVersion);
		add("interfaceForADMIN", interfaceForADMIN);
		setSize(1200, 750);
		setLocationRelativeTo(null);
		setResizable(false);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("CLOSED : ADMIN");
				JDBC_DBClose.close();
				System.exit(0);
			}
		});
		
		setVisible(true);
	}
	
}