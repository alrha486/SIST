
public class InterfaceDemo2 implements Mother, Father{
	
	public void grandFather() {		
	System.out.println("할아버지");
	}
	public void grandmother() {				
		System.out.println("할아머니");
	}
	public void father() {
		System.out.println("아버지");
	}	
	public void mother() {				
		System.out.println("어머니");
	}
	public void display() {
		System.out.println("나 자신");
	}
	public static void main(String[] args) {
		GrandFather gf = new InterfaceDemo2();
		gf.grandFather(); // 7. 각 인터페이스형 참조변수는 본인의 인터페이스에서 선언된 메소드만 접근 가능
		InterfaceDemo2 id = new InterfaceDemo2();
		GrandMother gm = id; // 자기 자신만 접근 가능
		gm.grandmother();
		Father f = id; // 할아버지 할머니 자기자신 접근가능
		//f.display(); // 부모형 참조변수는 자식의 모든 메소드 접근이 아니라 재정의 된 메소드만 접근 가능
		Mother [] m = new Mother[3];
		m[0] = id;
		m[1] = new InterfaceDemo2();
		// 인터페이스형 배열 생성 간응
System.out.println(Mother.NAME);
System.out.println(Father.NAME);
		
	}
}
