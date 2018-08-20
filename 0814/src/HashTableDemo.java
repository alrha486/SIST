import java.util.Date;
import java.util.Hashtable;
import java.util.StringTokenizer;


public class HashTableDemo {
	public static void main(String[] args) {
		 Date now = new Date();
		 StringTokenizer st = new StringTokenizer(now.toString());
		 String [] array = new String[st.countTokens()];
		 
		 int count = 0;
		 while(count < array.length) {
			 array[count++] = st.nextToken();
		 }
		 String year = array[5];
		 String month = array[1];
		 String day = array[2];
		 System.out.println(year + "  " + getMonth(month) + "  " + day);		 
	}
	static int getMonth(String month) {
		Hashtable <String , Integer> ht = new Hashtable<String, Integer>();
		ht.put("Jan", 1); ht.put("Feb", 2); ht.put("Mar", 3); ht.put("Apr", 4); 
		ht.put("May", 5); ht.put("Jun", 6); ht.put("Jul", 7); ht.put("Aug", 8); 
		ht.put("Sep", 9); ht.put("Oct", 10); ht.put("Nov", 11); ht.put("Dec", 12);
		
		return ht.get(month);
	}
}
