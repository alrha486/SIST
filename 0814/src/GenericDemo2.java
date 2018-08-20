import java.util.Stack;

public class GenericDemo2 {
	public static void main(String[] args) {
		Stack <String> stack = new Stack<String>();
		stack.push("hello");
//		display(stack);
		Stack <Integer> stack1 = new Stack<Integer>();
		stack1.push(100);
		display(stack1);
		Stack<Double> stack2 = new Stack<Double>();
		stack2.push(3.14);
		display(stack2);
		
	}
		static void display(Stack <? extends Number> stack) { // raw≈∏¿‘
			Number a = stack.pop();
			System.out.println(a);			
		}
}
