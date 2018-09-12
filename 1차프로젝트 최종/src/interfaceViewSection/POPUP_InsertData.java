package interfaceViewSection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlSection.ACTLSNR_POPUP_InsertData;
import dataObjectSection.MODEL_TableModel;

//������ ���� 
public class POPUP_InsertData extends JDialog{

	private JLabel [] lblArray = new JLabel[5];
	private JTextField [] tfArray = new JTextField[5];
	private JButton btnInsert, btnReset;
	private JPanel popupPanel;
	private String [] comboSource = {"�ѽ�", "���", "�߽�", "�Ͻ�"};
	private String [] lblText = {"��ȣ", "�з�", "��ȣ��", "�ּ�", "�޴�"};
	private JComboBox <String> comboDivision;
	private String comboSelected;
	
	
	//������
	public POPUP_InsertData(String title) {
		setSize(300, 250);
		setTitle("insert");
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("CLOSED : INSERT POPUP");
				WIN_Admin.table.setModel(new MODEL_TableModel(7));
			}
		});
		comboSelected ="�ѽ�";
		popupPanel = new JPanel();
		this.InputDisplay();	
		
	}
	
	
	
	
	
	//���
	public void InputDisplay() {
		this.setLayout(new BorderLayout());
		popupPanel.setLayout(new BorderLayout());
		popupPanel.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));
		popupPanel.setBackground(Color.WHITE);
		popupPanel.add(BorderLayout.NORTH, top());
		popupPanel.add(BorderLayout.SOUTH, bottom());
		this.add(popupPanel);
	}
	
	
	
	
	//����г�(������ �Է�)
	private JPanel top() {
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(5,2));
		topPanel.setBackground(Color.WHITE);
		
		for(int index =0; index<lblArray.length; index++) { //"��ȣ", "�з�", "��ȣ��", "�ּ�", "�޴�"
			if(index == 1) {
				topPanel.add(lblArray[index] = new JLabel(lblText[index]));
				topPanel.add(comboDivision = new JComboBox<String>(comboSource));
				tfArray[index] = null;
			}
			else {
				topPanel.add(lblArray[index] = new JLabel(lblText[index]));
				topPanel.add(tfArray[index] = new JTextField());
			}
		}//for
	
		comboDivision.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comboSelected = comboDivision.getSelectedItem().toString();
				System.out.println(comboSelected);
			}
		});//comboDivisionActionListener
		
		return topPanel;
	}
	
	
	
	
	
	
	
	//�ϴ��г�(��ư)
	private JPanel bottom() {
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.WHITE);
		
		btnInsert = new JButton("Insert");
		btnReset = new JButton("Reset");
		
		btnInsert.setSize(60, 30);
		btnReset.setSize(60, 30);
		
		btnInsert.addActionListener(new ACTLSNR_POPUP_InsertData(tfArray, this, comboDivision));
		btnReset.addActionListener(new ACTLSNR_POPUP_InsertData(tfArray, this, comboDivision));	
		
		btnReset.setForeground(Color.WHITE);
		btnReset.setBackground(Color.RED);
		
		bottomPanel.add(btnReset);
		bottomPanel.add(btnInsert);
		
		return bottomPanel;
	}//Bottom
	
	
}
