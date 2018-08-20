import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
//		int random = (int)Math.floor(Math.random()* 6 +1);
//		System.out.println(random);
		Random r = new Random(10);
		int rand = r.nextInt();
		System.out.println(rand);
	}
}
