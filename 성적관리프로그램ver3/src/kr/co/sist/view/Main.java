package kr.co.sist.view;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import kr.co.sist.model.Student;

//�÷��������ӿ�ũ Vector == ��� �þ�� List
public class Main {
   private JFrame frm;   	// ��ü������
   private Container con;   // ������ ���� �����̳�
   private JTabbedPane tab; // ������ ����� ��
   private Vector<Student> vector; // �л� ������ ���� �� ����

   public Main(String title) {//������  
      this.frm = new JFrame(title); // ������ ��� �Բ� �ʱ�ȭ
      this.con = this.frm.getContentPane(); // ������ ���� �����̳� �ʱ�ȭ
      this.tab = new JTabbedPane(JTabbedPane.TOP); // ������ ��ܿ� �� �ʱ�ȭ
      this.vector = new Vector<Student>(1,1); // �л� ���� �ʱ�ȭ 
   }
   
   public void display() { // ���÷��� �޼ҵ� 
      this.frm.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {//��ϸӽ� Ŭ���� == InnerClass
            JOptionPane.showMessageDialog(Main.this.con,
                  "�ȳ���������.", "�˸�â", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
      });
      this.con.add(this.tab); // �����̳� ���� ���� �߰�
      Output output = new Output(this.vector); // �л� ������ �ּҸ� �ƿ�ǲ �����ڷ� ������
      this.tab.add("�Է�", new Input(this.vector, this.tab, output)); // �Է� ���� �߰��԰� ���ÿ� ��ǲ ������ ȣ�� �л�����,�����ּ�,�ƿ�ǲ�� �ּҸ� ����
      this.tab.add("���", output); // ��� ���� �߰��԰� ���ÿ� �ƿ�ǲ�� �ּҸ� ����
      this.frm.setSize(800,600); // �������� ������
      this.frm.setVisible(true); // �ð�ȭ 
   }
   
   public static void main(String[] args) {
      Main main = new Main("�������� ������Ʈ Ver.3.0");
      main.display();
      /*Vector<Student> vector = new Vector<Student>(1,1);//��ĭ ���� --> ��ĭ�� ����
      
      Input in = new Input(vector);//input �����ڿ��� vector �ѱ�
      in.input();
      
      Calc c = new Calc(vector);
      c.calc();
      
      Sort sort = new Sort(vector);
      sort.BubbleSort();
      
      Output op = new Output(vector);//������
      op.output();//�޼ҵ�
*/      
   }
}