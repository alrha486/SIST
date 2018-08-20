import java.io.IOException;

public class RumtimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		r.exec("notepad");
//		Runtime r1 = Runtime.getRuntime();
//		if(r == r1) {
//			System.out.println("같다.");
//		}
//		else {
//			System.out.println("다르다.");
//		}
	}
}
