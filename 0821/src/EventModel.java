import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventModel  implements ActionListener{
	private JFrame frm;
	private JButton btnYello, btnRed;
	private JPanel pSouth;
	private Container con;
	private Font font;
	
	EventModel(String title){
		this.frm = new JFrame(title);
		this.pSouth = new JPanel();
		this.con = this.frm.getContentPane();
		this.font = new Font("Serif",Font.PLAIN,50);
	}
	
	private void display() {
		this.pSouth.add(this.btnRed = new JButton("RED"));
		this.btnRed.setFont(this.font);
		this.pSouth.add(this.btnYello = new JButton("Yello"));
		this.btnYello.setFont(this.font);
		
		this.con.add(this.pSouth, "South");
		this.frm.setVisible(true);
		
		this.btnRed.addActionListener(this);
		this.btnYello.addActionListener(this);
	
	}
	
	
	public static void main(String[] args) {
		new EventModel("Event Model").display();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnRed)) {
			this.con.setBackground(Color.RED);
		}else if(e.getSource().equals(btnYello)) {
			this.con.setBackground(Color.YELLOW);
		}
	}
}

