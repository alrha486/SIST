
public class ExceptionDemo1 {
	public static void main(String[] args) {
		int [] array = {1,2,3};
		
		try {
		for(int i=0; i <=3; i++) {
			System.out.println(array[i]);
		}
		}catch(Exception e) {
			System.out.println("�迭�� ������ Ȯ�����ּ���");
		}
	}
}
