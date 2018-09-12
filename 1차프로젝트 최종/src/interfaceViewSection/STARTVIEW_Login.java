package interfaceViewSection;


import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlSection.ACTLSNR_STARTVIEW_Login;
import systemCoreSection.MAIN_SystemCore;

public class STARTVIEW_Login extends JFrame {
	
	private JButton btnLogin, btnSignin;
	private JPasswordField passText;
	private JTextField userText;
	private JPanel panel;
	private STARTVIEW_Background backgroundImg;
	private MAIN_SystemCore main;

	
	
	
	
	
	public STARTVIEW_Login(MAIN_SystemCore main) {
		this.main = main;
		this.setTitle("Login");// setting
		this.setSize(280, 150);
		this.setResizable(false);
		this.setLocation(1200, 650);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		this.placeLoginPanel();
		
		this.add(panel);
		this.setVisible(true);
	}//constructor
	
	
	
	
	
	
	public void placeLoginPanel(){
		this.backgroundImg = new STARTVIEW_Background();
		
		panel.setLayout(null);	
		
		JLabel userLabel = new JLabel("아이디");
		JLabel passLabel = new JLabel("비밀번호");
		btnLogin = new JButton("Login");
		btnSignin = new JButton("Sign in");
		userText = new JTextField(20);
		passText = new JPasswordField(20);
		
		userLabel.setBounds(10, 10, 80, 25);
		passLabel.setBounds(10, 40, 80, 25);
		userText.setBounds(100, 10, 160, 25);
		passText.setBounds(100, 40, 160, 25);
		btnLogin.setBounds(20, 80, 100, 25);
		btnSignin.setBounds(150, 80, 100, 25);
		
		
		btnSignin.setBackground(Color.BLACK);
		btnSignin.setForeground(Color.WHITE);
		
		btnLogin.addActionListener(new ACTLSNR_STARTVIEW_Login(userText, passText, backgroundImg, main));
		btnSignin.addActionListener(new ACTLSNR_STARTVIEW_Login(userText, passText, backgroundImg, main));
		
		panel.add(userLabel);
		panel.add(passLabel);
		panel.add(userText);
		panel.add(passText);
		panel.add(btnLogin);
		panel.add(btnSignin);
		
	}//LoginPanelInitialize
	
	
}

