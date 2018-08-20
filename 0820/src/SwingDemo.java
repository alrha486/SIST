import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingDemo {
	private JFrame frm;
	private JButton btn;
	private Container con;
	
	private SwingDemo(String title) { // ������� �ʱ�ȭ
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane(); // JFrame�� Heavy component �̱⶧���� �����̳ʸ� ���� �� �� ���� �÷��ߵ�
		this.btn = new JButton("Click me!"); // ��ư�� �̸�
	}
	
	private void display() {
		this.frm.setSize(800,600); // �������� ������
		this.con.add(this.btn, "North"); // 13line�� ������ container���� ��ư�� �߰�
		this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �����ư �̺�Ʈ
		this.frm.setVisible(true); // �ð�ȭ true
	}
	
	
	public static void main(String[] args) {
		new SwingDemo("Swing Window").display();
	}
}
