import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("����");
		queue.offer("ġŲ");
		queue.offer("����");
		queue.offer("����");
		
		System.out.println(queue.peek()); // ����ù��°�� ����Ű�� �� peek
		System.out.println(queue.poll()); // �̾Ƴ��� �� poll
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
	}
}
