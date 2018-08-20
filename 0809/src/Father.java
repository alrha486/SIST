//6. 인터페이스끼리의 상속은 extends를 사용하며 다중상속이 가능하다. 클래스는 다중상속 불가능
public interface Father extends GrandFather, GrandMother{
	String NAME = "이진웅";
	void father();
	
}
