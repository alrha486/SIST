public class OverrideDemo1 {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.toString());
	}
}
class Demo extends Object{
	private String name = "Jinwoong";

	@Override
	public String toString() {
		return String.format("name = %s", name);
	}

//	@Override
//	public String toString() {	
//		return this.name; 
//	}
}

