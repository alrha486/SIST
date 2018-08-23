import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JTextField;

public class MyMouseMotion extends MouseMotionAdapter {
   private JTextField tf;
   
   public MyMouseMotion(JTextField tf) {	
      this.tf = tf;
   }
   @Override
   public void mouseMoved(MouseEvent e) {
      this.tf.setText("(x,y) = ("+e.getX()+","+e.getY()+")");
   }

}