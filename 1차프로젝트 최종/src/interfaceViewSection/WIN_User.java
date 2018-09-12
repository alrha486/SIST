package interfaceViewSection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controlSection.ACTLSNR_WIN_Users;
import dataObjectSection.MODEL_TableModel;

//유저가 보는 화면

public class WIN_User extends JPanel{
	
	private JPanel userPanel;
	private JButton [] btn = new JButton[6];
	private ImageIcon [] btnIcons = { new ImageIcon("./imageSrc/seo.png"), 
									 new ImageIcon("./imageSrc/south-korea.png"), 
									 new ImageIcon("./imageSrc/united-states.png"),
									 new ImageIcon("./imageSrc/china.png"),
								     new ImageIcon("./imageSrc/japan.png"),
								     new ImageIcon("./imageSrc/earth-globe.png")
								     };
	private Font font;
	private JScrollPane scroll;
	private MODEL_TableModel tableModel;
	public static JTable table;
	
	
	
	
	
	public WIN_User() {
		font = new Font("Arial", Font.PLAIN , 20);
		tableModel = new MODEL_TableModel(0);
		userPanel = new JPanel();
		this.display();
		
	}
	
	
	
	
	
	public void display() {
		this.setLayout(new BorderLayout());
		userPanel.setLayout(new BorderLayout());
		userPanel.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));
		userPanel.setBackground(Color.WHITE);
		userPanel.add(BorderLayout.WEST, getWest());
		userPanel.add(BorderLayout.CENTER, getEast());
		
		this.add(userPanel);
	}
	
	
	
	
	
	
	   private JPanel getWest() {
		   
		   JPanel pWest = new JPanel();
			pWest.setLayout(new GridLayout(6,1));  
			pWest.setPreferredSize(new Dimension(150, 400));

			for(int index=0; index<btn.length; index++) {
				btn[index] = new JButton(btnIcons[index]);
				btn[index].setFocusPainted(false);
				btn[index].setBorderPainted(false);
				btn[index].setContentAreaFilled(false);
				btn[index].addActionListener(new ACTLSNR_WIN_Users(btn));
				pWest.add(btn[index]);
			}//for
			
			pWest.setBackground(Color.WHITE);
			return pWest;
	   }
	
	   
	   
	   
	   
	   
	private JPanel getEast() {
		JPanel pEast = new JPanel();
		
		table = new JTable(tableModel);
	    table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	    table.setPreferredSize(new Dimension(1000, 1000));
	    table.setRowHeight(20);
	    
	    scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    scroll.setPreferredSize(new Dimension(600, 400));
		
		pEast.setBackground(Color.WHITE);
	    pEast.setBackground(Color.WHITE);
	    pEast.setPreferredSize(new Dimension(800, 600));
	    pEast.setLayout(new BorderLayout());
	    pEast.add(scroll, BorderLayout.CENTER);
		
		return pEast;
		
	}
	
	
	
	
}
