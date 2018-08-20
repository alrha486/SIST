import java.util.Date;
public class DeprecationDemo {
		public static void main(String[] args) {
			Date now = new Date();
			int year = now.getYear();
			int month = now.getMonth();
			System.out.println(month+1);
		}
}
