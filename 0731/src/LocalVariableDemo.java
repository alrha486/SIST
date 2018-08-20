public class LocalVariableDemo {
	public static void main(String[] args) {

		int kor = 90;
		System.out.println("kor = " + kor);
		{
			int kor1 = 10;
		}
		System.out.println("kor = " + kor);
	}
}
