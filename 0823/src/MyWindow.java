import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MyWindow extends WindowAdapter {

		private JFrame frm;
		
		public MyWindow(JFrame frm) {
			this.frm =frm;
		}
		@Override
		public void windowClosing(WindowEvent e) {
			this.frm.setVisible(false);
			this.frm.disable();
			System.exit(0);
		}
}
