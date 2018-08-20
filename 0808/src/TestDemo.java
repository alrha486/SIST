public class TestDemo {
	public static void main(String[] args) {
		Object obj = new Object();
		Integer in = new Integer(100);
		String str = new String("이진웅");
		
		
		obj = in;
		if(obj instanceof Integer) { // instanceof 형변환 성립여부
			System.out.println("가능하다.");
		}else {
			System.out.println("안된다.");
		}
		//Integer in = (Integer)obj;
		//System.out.println(obj);
		
	}
}
