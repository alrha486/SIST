import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector <String> vector = new Vector<String>(1,1); // �⺻�����ڴ� ���� 10��
//		System.out.println(vector.capacity()); // ������ �� ���� ���ϴ� �޼ҵ� capacity
		vector.addElement("Apple");
		vector.addElement("Mango");
		vector.addElement("Melon");
		vector.addElement("Grape");
		vector.addElement("Apple");		
		
		for(int i=0; i<vector.size();i++) {
			System.out.println(vector.elementAt(i));
		}
	}
}
