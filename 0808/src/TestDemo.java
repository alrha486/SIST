public class TestDemo {
	public static void main(String[] args) {
		Object obj = new Object();
		Integer in = new Integer(100);
		String str = new String("������");
		
		
		obj = in;
		if(obj instanceof Integer) { // instanceof ����ȯ ��������
			System.out.println("�����ϴ�.");
		}else {
			System.out.println("�ȵȴ�.");
		}
		//Integer in = (Integer)obj;
		//System.out.println(obj);
		
	}
}
