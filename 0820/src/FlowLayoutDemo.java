import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo {
	   private JFrame frm;
	   private Container con;
	   private JCheckBox chkEclipse, chkNotepad, chkVisCode;
	   private ButtonGroup btnGroup;
	   private Font font;
	   private JPanel panel;
	   
	   private FlowLayoutDemo(String title) {
	      this.frm = new JFrame(title);
	      this.con = this.frm.getContentPane();
	      this.panel = new JPanel();
	      this.chkEclipse = new JCheckBox("chkEclipse",true); // 이름과 체크여부
	      this.chkNotepad = new JCheckBox("chkNotepad");
	      this.chkVisCode = new JCheckBox("chkVisCode");
	      this.font = new Font("Arial", Font.BOLD,40);
	   }
	   
	   private void display() {
		   	  this.panel.setLayout(new FlowLayout(FlowLayout.RIGHT,10,50));
		   	  this.panel.add(chkEclipse);	this.chkEclipse.setFont(font);
		   	  this.panel.add(chkNotepad); this.chkNotepad.setFont(font);
		   	  this.panel.add(chkVisCode); this.chkVisCode.setFont(font);
		   	  this.panel.setBackground(Color.DARK_GRAY);  // 패널 배경 색
		      this.panel.setPreferredSize(new Dimension(con.WIDTH, 100)); // 패널 사이즈
		   	  
		   	  this.con.add(this.panel, "South");
		      this.frm.setSize(800,600);
		      this.frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//[x]버튼 활성화
		      this.frm.setVisible(true);//반드시
	   }

	public static void main(String[] args) {
		new FlowLayoutDemo("FlowLayoutDemo").display();
	}
}
