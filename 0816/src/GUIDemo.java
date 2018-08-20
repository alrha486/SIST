import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class GUIDemo extends Frame{
	private Button btn;
	
	public GUIDemo(String title) {
		super(title);
		this.btn = new Button("Click me!!!");
	}
	public void display() {
		this.add(this.btn);
		this.setSize(800,600);
		this.setBackground(Color.black);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIDemo("Frame Demo").display();
	}
}
