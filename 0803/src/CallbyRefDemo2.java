
public class CallbyRefDemo2 {
	public static void main(String[] args) {
		CallbyRefDemo2 cb = new CallbyRefDemo2();	
		Demo demo = new Demo();
		demo.a = 5;
		demo.b = 9;
		
		System.out.println("�ٲٱ��� : 5  9 " );
		cb.swap(demo);
		System.out.println("�ٲ� ��  : "+ demo.a + "   " + demo.b );
}
	void swap(Demo demo){
	int t;
	t = demo.a;
	demo.a = demo.b;
	demo.b = t;
}
}