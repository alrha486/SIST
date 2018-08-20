public class OverrideDemo3 {
	public static void main(String[] args) {
//		Human h = new Human();
//		Student s = new Student();
//		h = s;		
//		h.display();
//		s.display();
		Human human = new Student();
		human.display();
	
	
	}
}
class Human{
	void display() {
	System.out.println("나는 부모의 메소드");	
	}
}
class Student extends Human{
	
	@Override
	void display() {
		System.out.println("나는 자식의 메소드");	
	}
}
