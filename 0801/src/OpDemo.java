public class OpDemo {
public static void main(String[] args) {
/*	
	int a = -79;
	System.out.println(Integer.toBinaryString(a)); // a�� 2������ �ٲٱ�
	int result = a >>> 3; // 79 / 2�� 3��
	System.out.println(result); 
	System.out.println(Integer.toBinaryString(result)); 
	
*/
	
int a = 20;
System.out.println(Integer.toBinaryString(a));
int result = a << 3; // 20�� 2��3�� 3�� �� = 160
System.out.println(Integer.toBinaryString(result));
System.out.println(Integer.toString(result));

}
}
