
public class ArrayDemo3 {
public static void main(String[] args) {
	short[] original = {3,4,5,6};
	short[] target = {7,8,9,10,11,12,13,14,15};
	System.out.println("���� �� : ");
	System.out.println(original[0]);

	original = target; // �ּҺ��� 
	
	System.out.println("���� �� : ");
	System.out.println(original[0]);
	
	target[0] = 100;// ������ �ٲ� ���� �ٲ��. ���� �ּҸ� ����Ŵ
	
	
	System.out.println("2�� ���� �� : ");
	System.out.println(original[0]);

}
	//System.arraycopy(src, srcPos, dest, destPos, length);
}

