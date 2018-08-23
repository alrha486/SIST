import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventModel3{
	private JFrame frm;
	private JButton btnYello, btnRed;
	private JPanel pSouth;
	private JTextField tf; // 한줄 입력받는 텍스트필드
	private Container con;
	private Font font;
	
	EventModel3(String title){
		this.frm = new JFrame(title);
		this.pSouth = new JPanel();
		this.con = this.frm.getContentPane();
		this.font = new Font("Serif",Font.PLAIN,50);
		this.tf = new JTextField();
	}
	
	private void display() {
		this.pSouth.add(this.btnRed = new JButton("RED"));
		this.btnRed.setFont(this.font);
		this.pSouth.add(this.btnYello = new JButton("Yello"));
		this.btnYello.setFont(this.font);
		
		this.con.add(this.tf, "North");
		this.tf.setFont(this.font);
		
		this.con.add(this.pSouth, "South");
		this.frm.setVisible(true);
		
		this.btnRed.addActionListener(new MyInnerAction());
		this.btnYello.addActionListener(new MyInnerAction());
		
		this.frm.addMouseMotionListener(new MyMouseMotion(this.tf));
		
		this.frm.addWindowListener(new MyWindow(this.frm));
	}
	
	private class MyInnerAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("RED")) {
				EventModel3.this.con.setBackground(Color.RED);
			}else {
				EventModel3.this.con.setBackground(Color.YELLOW);
			}
		}
	}
	
	public static void main(String[] args) {
		new EventModel3("Event Model").display();
	}
	
}

