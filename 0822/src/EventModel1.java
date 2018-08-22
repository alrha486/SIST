import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventModel1  implements ActionListener, MouseMotionListener, WindowListener{
	private JFrame frm;
	private JButton btnYello, btnRed;
	private JPanel pSouth;
	private JTextField tf; // 한줄 입력받는 텍스트필드
	private Container con;
	private Font font;
	
	EventModel1(String title){
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
		
		this.btnRed.addActionListener(this);
		this.btnYello.addActionListener(this);
		
		this.frm.addMouseMotionListener(this);
		this.frm.addWindowListener(this);
	}
	
	
	public static void main(String[] args) {
		new EventModel1("Event Model").display();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnRed)) {
			this.con.setBackground(Color.RED);
		}else if(e.getSource().equals(btnYello)) {
			this.con.setBackground(Color.YELLOW);
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.tf.setText("(x,y) = (" + e.getX() + "," + e.getY() + ")");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		int choice = JOptionPane.showConfirmDialog(this.con, "정말 종료하시겠습니까?");
		if(choice == JOptionPane.YES_OPTION) {
			this.frm.setVisible(false);
			this.frm.dispose();
			System.exit(0);
		}else {
			this.frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}

}

