
public class ThisDemo1 {
public static void main(String[] args) {
	A a = new A();
	B b = new B();
	a.copy();
}
}

class A {
	public String name = "Aclass";
	
	public A() { //持失切
		System.out.println("号榎 持失�臉�");
	}
	public void copy() {
		B b = new B();
		b.copy(this);
	}
}
class B{
	public void copy(A a_other) {
		System.out.println(a_other.name);
	}
}
