import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector <String> vector = new Vector<String>(1,1); // 기본생성자는 방이 10개
//		System.out.println(vector.capacity()); // 벡터의 방 개수 구하는 메소드 capacity
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
