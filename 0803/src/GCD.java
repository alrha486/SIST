
public class GCD {
public static void main(String[] args) {
	int a = 16;
	int b = 32;
	int c = GCD(a,b);
	System.out.println(a+ "��" + b + "�� �ִ����� : " + c);
}
static int GCD(int a, int b) { //�ִ�����
	int c=0; 
	
	for(int i=1; i<100; i++) {
	if(a%i ==0 && b %i ==0)	{
		c=i;
	}
	}
	return c;
			
}
int LCD(int a, int b) { //�ּҰ����
int c=0;
	
	for(int i=1; i<100; i++) {
	if(a%i ==0 && b %i ==0)	{
		c=i;
	}
	}
	return c;
}

}
