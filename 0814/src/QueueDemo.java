import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("피자");
		queue.offer("치킨");
		queue.offer("만두");
		queue.offer("감자");
		
		System.out.println(queue.peek()); // 제일첫번째를 가리키는 것 peek
		System.out.println(queue.poll()); // 뽑아내는 것 poll
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}
}
