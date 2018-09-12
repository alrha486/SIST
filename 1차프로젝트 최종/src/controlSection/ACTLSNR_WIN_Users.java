package controlSection;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import dataObjectSection.MODEL_TableModel;
import interfaceViewSection.WIN_User;

public class ACTLSNR_WIN_Users implements ActionListener{
	
	JButton [] btn;
	
	
	
	public ACTLSNR_WIN_Users(JButton[] btn) {
		this.btn = btn;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn[0]) {
			System.out.println("BUTTON CLICKED ON USER UI : SHOW ALL");
			WIN_User.table.setModel(new MODEL_TableModel(0));
		}
		else if(e.getSource() == btn[1]) {
			System.out.println("BUTTON CLICKED ON USER UI : KOREAN");
			WIN_User.table.setModel(new MODEL_TableModel(1));
		}
		else if(e.getSource() == btn[2]) {
			System.out.println("BUTTON CLICKED ON USER UI : WESTERN");
			WIN_User.table.setModel(new MODEL_TableModel(2));
		}
		else if(e.getSource() == btn[3]) {
			System.out.println("BUTTON CLICKED ON USER UI : CHINESE");
			WIN_User.table.setModel(new MODEL_TableModel(3));
		}
		else if(e.getSource() == btn[4]) {
			System.out.println("BUTTON CLICKED ON USER UI : JAPANESE");
			WIN_User.table.setModel(new MODEL_TableModel(4));
		}
		else if(e.getSource() == btn[5]) {
			System.out.println("BUTTON CLICKED ON USER UI : SHOWMAP");
				if(WIN_User.table.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "먼저 검색하실 데이터를 선택 해 주세요.");
					System.out.println("ROW DOESN'T SELECTED");
				}
				else {
				String selectedAddress = (String) WIN_User.table.getValueAt(WIN_User.table.getSelectedRow(), 3);
				System.out.println("ROW CATCHED ON ADDRESS = "+selectedAddress);
				
				selectedAddress.replaceAll("\\s", "+");
				System.out.println("ADDRESS PARSED = "+selectedAddress);
				
				Browser browser = new Browser();
				BrowserView view = new BrowserView(browser);
					 
				JFrame frame = new JFrame();
				frame.add(view, BorderLayout.CENTER);
				frame.setSize(720, 650);
				frame.setVisible(true);
					 
				browser.loadURL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query="+selectedAddress);
				}
		}
		
	}

}
