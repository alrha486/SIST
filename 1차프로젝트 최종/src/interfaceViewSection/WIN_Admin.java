package interfaceViewSection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import controlSection.ACTLSNR_WIN_Admin;
import dataObjectSection.MODEL_TableModel;



public class WIN_Admin extends JPanel {
   
   private JPanel adminPanel;
   private JButton [] btn = new JButton[8];
   private ImageIcon [] btnIcons = { new ImageIcon("./imageSrc/seo.png"), 
		   							 new ImageIcon("./imageSrc/south-korea.png"), 
		   							 new ImageIcon("./imageSrc/united-states.png"),
		   							 new ImageIcon("./imageSrc/china.png"),
		   						     new ImageIcon("./imageSrc/japan.png"),
		   						     new ImageIcon("./imageSrc/earth-globe.png"),
		   						     new ImageIcon("./imageSrc/diskette.png"),
		   						     new ImageIcon("./imageSrc/trash.png"), };
   private Font font;
   private JScrollPane scroll;
   private MODEL_TableModel tableModel;
   public static JTable table;
   
   
   
   
   
   
   public WIN_Admin() {
      font = new Font("Arial", Font.PLAIN , 20);
      tableModel = new MODEL_TableModel(0);
      adminPanel = new JPanel();
      this.display();
   }//constructor
   
   
   
   
   
   
   public void display() {
      this.setLayout(new BorderLayout());
      
      adminPanel.setLayout(new BorderLayout());
      adminPanel.setBorder(BorderFactory.createEmptyBorder(10 , 10 , 10 , 10));
      adminPanel.setBackground(Color.WHITE);
      adminPanel.add(BorderLayout.WEST, getWest());
      adminPanel.add(BorderLayout.CENTER, getEast());
      
      this.add(adminPanel);
   }//display
   
   
   
   
   
   
   private JPanel getWest() {
	   
	   JPanel pWest = new JPanel();
		pWest.setLayout(new GridLayout(8,1));  
		pWest.setPreferredSize(new Dimension(150, 400));

	
		for(int index=0; index<btn.length; index++) {
			btn[index] = new JButton(btnIcons[index]);
			btn[index].setFocusPainted(false);
			btn[index].setBorderPainted(false);
			btn[index].setContentAreaFilled(false);
			btn[index].addActionListener(new ACTLSNR_WIN_Admin(btn));
			pWest.add(btn[index]);
		}//for
		pWest.setBackground(Color.WHITE);
		return pWest;
   }//getWest
   
   
   
   
   
   
   private JPanel getEast() {
      JPanel pEast = new JPanel();
      pEast.setLayout(new BorderLayout());
      pEast.setBackground(Color.WHITE);
      pEast.add(BorderLayout.CENTER, getCenter());
      
      return pEast;
   }//getEast
   
   
   
   
 
   
   
   
   
   
   private JPanel getCenter() {
      JPanel pCenter = new JPanel();
      
      table = new JTable();
      table.setRowHeight(20);
      table.setPreferredSize(new Dimension(1030, 1030));
      table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
      table.setModel(tableModel);
      
      scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      scroll.setPreferredSize(new Dimension(600, 380));
      
      pCenter.setBackground(Color.WHITE);
      pCenter.setPreferredSize(new Dimension(800, 600));
      pCenter.setLayout(new BorderLayout());
      pCenter.add(scroll, BorderLayout.CENTER);

      return pCenter;
   }//Center
   
}