
public class ConstructorDemo4 {
public static void main(String[] args) {
	Cars car = new Cars();
	car = null; // �ּҰ� ����� null������ ��
	//car.finalize();
	System.gc();
}
}
