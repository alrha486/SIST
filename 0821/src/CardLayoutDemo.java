import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.*; // 1. import.


public class CardLayoutDemo implements MouseListener{ // 2.implements 한다
	
	private JFrame frm;
	private JPanel p1,p2,p3,p4,p5,p6,p7;
	private CardLayout card;
	private Container con;
	
	CardLayoutDemo(String title){
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		
		this.p1 = new JPanel();	this.p2 = new JPanel();
		this.p3 = new JPanel();	this.p4 = new JPanel();
		this.p5 = new JPanel();	this.p6 = new JPanel();
		this.p7 = new JPanel();
		
		this.card = new CardLayout();
	}
	
	private void display() {
		this.con.setLayout(this.card);
		
		this.con.add(this.p1);
		this.p1.setBackground(Color.RED);
		this.p1.addMouseListener(this);
		
		this.con.add(this.p2);
		this.p2.setBackground(Color.ORANGE);
		this.p2.addMouseListener(this);
		
		this.con.add(this.p3);
		this.p3.setBackground(Color.YELLOW);
		this.p3.addMouseListener(this);
		
		this.con.add(this.p4);
		this.p4.setBackground(Color.GREEN);
		this.p4.addMouseListener(this);
		
		this.con.add(this.p5);
		this.p5.setBackground(Color.BLUE);
		this.p5.addMouseListener(this);
		
		this.con.add(this.p6);
		this.p6.setBackground(new Color(0,0,139)); // 남색
		this.p6.addMouseListener(this);
		
		this.con.add(this.p7);
		this.p7.setBackground(new Color(128,0,128)); // 보라색
		this.p7.addMouseListener(this);		
		
		this.card.show(this.con, "First Label");
		
		this.frm.setSize(400,700);
		this.frm.setVisible(true);
	}
	
	
	
	public static void main(String[] args) { 
		new CardLayoutDemo("CardLayoutDemo").display();
	}

	@Override
	public void mouseClicked(MouseEvent e) { // 3. Override 한다.
		this.card.next(con);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.card.next(con);
		}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.card.next(con);
		}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.card.next(con);
		}

	@Override
	public void mouseExited(MouseEvent e) {
		this.card.next(con);	
	}
}
