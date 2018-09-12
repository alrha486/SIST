package interfaceViewSection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controlSection.ACTLSNR_POPUP_SIGNIN;


//회원가입 화면

public class POPUP_SignIn extends JDialog {

	private JLabel info;
	private JLabel[] lblbtnSignin;
	private String[] lblText = { "이름", "나이", "ID", "PW", "성별" };
	private JTextField[] jTf; // tfName, tfAge, tfId;
	private JPasswordField tfPw;
	private JButton btnSignin, btnReset;
	private JPanel panelSignIn;
	public static ButtonGroup group;
	public static JRadioButton male, female;

	public POPUP_SignIn(String title) {
		setSize(300, 350);
		setTitle("회원가입");

		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		panelSignIn = new JPanel();
		this.display();
	}

	public void display() {
		this.setLayout(new BorderLayout());
		panelSignIn.setLayout(new BorderLayout());
		panelSignIn.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));
		panelSignIn.add(BorderLayout.NORTH, top());
		panelSignIn.add(BorderLayout.CENTER, middle());
		panelSignIn.add(BorderLayout.SOUTH, bottom());
		this.add(panelSignIn);
	}

	// 상단패널
	private JPanel top() {
		JPanel panelTop = new JPanel();
		panelTop.setLayout(new BorderLayout());
		panelTop.add(info = new JLabel("회원 정보를 입력하세요."));
		return panelTop;
	}
	
	
	
	

	// 중단패널(입력부분)
	private JPanel middle() {
		this.lblbtnSignin = new JLabel[5];
		this.jTf = new JTextField[3];
		JPanel panelMiddle = new JPanel();

		panelMiddle.setLayout(new GridLayout(5, 2, 0, 20));

		for (int index = 0; index < lblbtnSignin.length; index++) { // name, age, gender, id, pw
			switch (index) {
			case 0:
			case 1:
			case 2:
				panelMiddle.add(lblbtnSignin[index] = new JLabel(lblText[index], JLabel.CENTER));
				panelMiddle.add(jTf[index] = new JTextField());
				break;

			case 3:
				panelMiddle.add(lblbtnSignin[index] = new JLabel(lblText[index], JLabel.CENTER));
				panelMiddle.add(tfPw = new JPasswordField());
				break;

			case 4:
				panelMiddle.add(lblbtnSignin[index] = new JLabel(lblText[index], JLabel.CENTER));
				panelMiddle.add(radioPanel());
				break;

			default:
				break;
			}// switch
		} // for
		return panelMiddle;
	}// middle

	
	
	
	
	
	
	
	// 하단패널(버튼)
	private JPanel bottom() {
		JPanel pBottom = new JPanel();
		
		btnSignin = new JButton("Sign in");
		btnReset = new JButton("Reset");

		btnSignin.setSize(60, 30);
		btnReset.setSize(60, 30);

		btnSignin.addActionListener(new ACTLSNR_POPUP_SIGNIN(jTf, tfPw));
		btnReset.addActionListener(new ACTLSNR_POPUP_SIGNIN(jTf, tfPw));

		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.RED);

		pBottom.add(btnReset);
		pBottom.add(btnSignin);

		 return pBottom;
	}// bottom

	
	
	
	
	
	
	// 라디오버튼을 묶기위한 패널
	private JPanel radioPanel() {
		JPanel radioPanel = new JPanel();

		group = new ButtonGroup();

		male = new JRadioButton("남성");
		female = new JRadioButton("여성");
		
		male.setSelected(true);
		female.setSelected(false);

		group.add(male);
		group.add(female);

		radioPanel.add(male);
		radioPanel.add(female);

		return radioPanel;
	}

}
