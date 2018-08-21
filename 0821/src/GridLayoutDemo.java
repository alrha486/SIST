import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class GridLayoutDemo {
	private JFrame frm;
	private JRadioButton rdoSpring, rdoSummer, rdoFall, rdoWinter;
	private ButtonGroup group;
	private Font font;
	private Container con;
	
	GridLayoutDemo(String title){
		this.frm = new JFrame(title);
		this.con = this.frm.getContentPane();
		this.group = new ButtonGroup();
		this.font = new Font("Verdana", Font.ITALIC, 50);
		this.rdoSpring = new JRadioButton("Spring");
		this.rdoSummer = new JRadioButton("Summer");
		this.rdoFall = new JRadioButton("Fall");
		this.rdoWinter = new JRadioButton("Winter");
	}
	
	public void display() {
		this.con.setLayout(new GridLayout(2,2));
		this.group.add(rdoSpring);	this.group.add(rdoSummer);
		this.group.add(rdoFall);	this.group.add(rdoWinter);
		
		this.rdoSpring.setFont(this.font);  this.rdoSummer.setFont(this.font);
		this.rdoFall.setFont(this.font);	this.rdoWinter.setFont(this.font);
 		
		this.rdoSpring.setBackground(Color.GREEN);
		this.rdoSummer.setBackground(Color.RED);
		this.rdoFall.setBackground(Color.DARK_GRAY);
		this.rdoWinter.setBackground(Color.BLUE);
		
		
		this.con.add(this.rdoSpring);
		this.con.add(this.rdoSummer);
		this.con.add(this.rdoFall);
		this.con.add(this.rdoWinter);
		
		this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frm.setSize(800,600); 
		this.frm.setVisible(true);
	}
		
	public static void main(String[] args) {
		new GridLayoutDemo("GridLayoutDemo").display();
	}
}
