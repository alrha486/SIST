import java.awt.Container;
import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventModel2{
	private JFrame frm;
	private JButton btnYello, btnRed;
	private JPanel pSouth;
	private JTextField tf; // 한줄 입력받는 텍스트필드
	private Container con;
	private Font font;
	
	EventModel2(String title){
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
		
		this.btnRed.addActionListener(new MyAction(this.con));
		this.btnYello.addActionListener(new MyAction(this.con));
		
		this.frm.addMouseMotionListener(new MyMouseMotion(this.tf));
		
		this.frm.addWindowListener(new MyWindow(this.frm));
	}
	
	
	public static void main(String[] args) {
		new EventModel2("Event Model").display();
	}
	
}

