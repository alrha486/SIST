package interfaceViewSection;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import dataObjectSection.STATSAVE_StatementClass;


 
public class STARTVIEW_Background extends JFrame{
    BufferedImage img = null;
 
    public STARTVIEW_Background() {
        setTitle(STATSAVE_StatementClass.systemVersion);
        setLocation(380, 150);
       
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setSize(1200, 750);
        layeredPane.setLayout(null);
 
        try {
        	img = ImageIO.read(new File("./imageSrc/back.jpg"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "이미지를 불러올 수 없습니다.");
            System.exit(0);
        }
       
       myPanel panel = new myPanel();
        panel.setSize(1200,750);
        layeredPane.add(panel);
        setLayout(null);
 
        add(layeredPane);
        setVisible(true);
        setSize(1200, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
    class myPanel extends JPanel {
        public void paint(Graphics g) {
            g.drawImage(img, 0, 0, null);
        }
    }
}