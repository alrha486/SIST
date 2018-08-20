
public class GenericDemo {
	public static void main(String[] args) {
		Demo<Integer> d = new Demo<Integer>(3, 3);
		int num = d.getSu();
		int num2 = d.getSu1();
		Demo<Double> d1 = new Demo<Double>(3.14, 4.56);
		double num1 = d1.getSu();
		Demo<String> d3 = new Demo<String>("서정은", "이진웅");
		String st = d3.getSu();
		
		System.out.println(num + "  " + num1 + "  " + st);
		
		
	}
}


class Demo<T>{  // 제너릭 객체<만능형>
	private T su;
	private T su1;
	
	public Demo(T su, T su1) {
		this.su = su;
		this.su1 = su1;
	}
	public T getSu() {
		return su;
	}
	public T getSu1() {
		return su1;
	}
	public void setSu(T su) {
		this.su = su;
	}
	public void setsu(T su1) {
		this.su1 = su1;
	}
}