import com.javasoft.libs.finance.Money;
import com.javasoft.libs.hr.*;
import static java.lang.System.out;
import static java.lang.Math.random;

public class ImportDemo extends Employee {
	public static void main(String[] args) {
		Money m = new Money();
		//Employee e = new Employee();
		ImportDemo id = new ImportDemo();
		out.println(id.name + " " + m.price);
		int random = (int)(random() *100 +1);
		out.println(random);
		
	}
//	static double random() {
//		return 3.14;
//	}
}
