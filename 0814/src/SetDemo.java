import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {//List interface
   public static void main(String[] args) {//ctrl + shift + o
      Set<String> set = new HashSet<String>(); //부모형 = 자식형()
      Set<String> set1 = new TreeSet<String>(); // hashset과 treeset의 차이 : treeset은 소팅을 함.
      
      set.add("JAVA");
      set.add("Python");
      set.add("C");
      set.add("Big-Data");
      set.add("HTML5");
      set.add("C");				
      set.add("JAVA");
      
      
//      Iterator<String> iters = set.iterator();
//      while(iters.hasNext()) {
//    	  System.out.println(iters.next());
//      }
   }
}