import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Login implements ActionListener
{
	private String ID = "alrha486";
	private String PW = "123123a";
	
  private JTextField id;
  private JTextField pw;
  private JButton login;
  private JButton cancel;
  private Container c;
  private int width = 250;
  private int height = 120;

  public static void main(String args[]) {
    Login login = new Login();
    JFrame f = login.getLoginFrame();
    f.setVisible(true);
  }
  public JFrame getLoginFrame() {
    JFrame frame = new JFrame("Login");
    frame.setSize(width,height);
    c = frame.getContentPane();
    c.add(getTextPanel(),"Center");
    c.add(getLabelPanel(),"West");
    c.add(getActionPanel(),"South");
    return frame;
  }
  private JPanel getTextPanel() {
    JPanel panel = new JPanel();
    id = new JTextField();
    pw = new JTextField();
    panel.setLayout(new GridLayout(2,1));
    panel.add(id);
    panel.add(pw);
    return panel;
  }
  private JPanel getLabelPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2,1));
    panel.add(new JLabel("     ID     ",JLabel.CENTER));
    panel.add(new JLabel("     PW     ",JLabel.CENTER));
    return panel;
  }
  private JPanel getActionPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(1,3));
    login = new JButton("로그인");
    cancel = new JButton("취소");
    panel.add(new JLabel());
    panel.add(login);
    this.login.addActionListener(this);
    panel.add(cancel);
    return panel;
  }
@Override
public void actionPerformed(ActionEvent e) {
	if(this.ID.equals(id) && this.PW.equals(pw)) {
		JOptionPane.showMessageDialog(null,"로그인에 성공하였습니다.");
	}
	
}
}

