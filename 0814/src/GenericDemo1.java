import java.util.Stack;
import java.util.Vector;

public class GenericDemo1 {
	public static void main(String[] args) {
//		Stack <String> stack = new Stack<String>();
//		Stack <Object> obj = new Stack<Object>();
//		Stack <String> stack1 = new Stack<String>();
//		
//		Vector<String> vector = new Stack<String>();
		Stack<? extends Number> stack1 = new Stack<Double>();
		Stack<? extends Object> stack2 = new Stack<String>();
		Stack<? extends Number> stack3 = new Stack<Integer>();
		Stack<? extends Object> stack4 = new Stack<Demo>();
	}
}
