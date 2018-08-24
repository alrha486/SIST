import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;


public class HMS_Input extends JPanel implements ActionListener{
private Vector<Hospital> vector;
private JPanel p;
private JLabel lbNum, lbCode, lbDay, lbAge;
private JTextField tfNum,tfCode,tfDay,tfAge;
private JButton btnAdd;
private JTabbedPane tab;
//private Output output;
private Font font;

public HMS_Input(Vector<Hospital> vector, JTabbedPane tab) {
	this.vector = vector;
	this.tab = tab;
	this.p = new JPanel();
	this.font = new Font("Sans Serif",Font.PLAIN,35);
	this.display();
//	this.output = output;
}
public void display() {
	this.setLayout(new FlowLayout());
	this.p.setLayout(new BorderLayout());//���� �г�
	this.p.add("Center", getCenter()); // ��ǲ �г��� ���Ϳ� getCenter() ȣ��
	this.add(this.p); // �����̳ʿ� �г��� �߰�
	this.p.setName("ȯ�� ������ �Է�");
}
private JPanel getCenter() {
	JPanel pCenter = new JPanel();
	pCenter.setLayout(new GridLayout(5,2,10,10));
	
	pCenter.add(this.lbNum = new JLabel("��ȣ :"));
	this.lbNum.setFont(font);
	pCenter.add(this.tfNum = new JTextField());
	this.tfNum.setFont(font);
	
	pCenter.add(this.lbCode = new JLabel("�����ڵ� :"));
	this.lbCode.setFont(font);
	pCenter.add(this.tfNum = new JTextField());
	this.tfNum.setFont(font);
	
	pCenter.add(this.lbDay = new JLabel("�Կ��ϼ� :"));
	this.lbDay.setFont(font);
	pCenter.add(this.tfDay = new JTextField());
	this.tfDay.setFont(font);
	
	pCenter.add(this.lbAge = new JLabel("���� :"));
	this.lbAge.setFont(font);
	pCenter.add(this.tfAge = new JTextField());
	this.tfAge.setFont(font);
		

	pCenter.add(this.btnAdd = new JButton("�߰�"));
//	this.btnAdd.setLayout(new BorderLayout("Center"));
	this.btnAdd.setFont(font);
	this.btnAdd.addActionListener(this);
	
	return pCenter;
}


public void actionPerformed(ActionEvent e) {
	int num = Integer.parseInt(this.tfNum.getText().trim());
	String code = this.tfCode.getText();
	int day = Integer.parseInt(this.tfDay.getText().trim());
	int age = Integer.parseInt(this.tfAge.getText().trim());
	
	Hospital h = new Hospital(num, code, day, age);
	this.vector.addElement(h);
	
	int a = this.vector.size();
	
	 JOptionPane.showMessageDialog(HMS_Input.this.p,
             a + "��° ȯ�ڰ� ���������� �߰��ƽ��ϴ�.", "�޽���", JOptionPane.INFORMATION_MESSAGE);
	
	this.tfNum.setText("");
	this.tfCode.setText("");
	this.tfDay.setText("");
	this.tfAge.setText("");
	
	
}
}
