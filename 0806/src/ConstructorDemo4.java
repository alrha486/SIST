
public class ConstructorDemo4 {
public static void main(String[] args) {
	Cars car = new Cars();
	car = null; // 주소가 사라짐 null번지가 됨
	//car.finalize();
	System.gc();
}
}
