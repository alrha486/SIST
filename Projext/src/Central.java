
public class Central {
	public static void main(String[] args) {
	PhoneFee [] pf = new PhoneFee[100];
	
	
	Input input = new Input(pf); //InputŬ���� �ν��Ͻ� ����(InputŬ���� ������ �˰����� ���� �Է�)
	int count = input.input(); // �޼ҵ� ȣ�� count���� �����ϹǷ� ������ ���� 
	
	
//	Calc calc = new Calc(pf, count); // ���� ����ִ� �迭�� count�� �Ű������� �����ڷ� ������
//	calc.calc();
//	
//	Output output = new Output();
//	output.output(pf);
	
}
}
