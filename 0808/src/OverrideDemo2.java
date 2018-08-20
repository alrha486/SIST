// 1)String type >> '==' : 값 비교 or 주소 비교 
// 					'equals' : 무조건 값 비교
// 2)reference   >> '==', 'equals' : 모두 주소 비교
// 3)객체의 equals() 재정의
public class OverrideDemo2 {
	public static void main(String[] args) {
//		Test t = new Test();
//		t.su = 100;
//		Test t1 = new Test();
//		t1.su= 100;
//		
		
		Point p = new Point(100,200);
		Point target = new Point(100,200);

		if(p.equals(target)) {  //equals는 항상 값비교
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
	}
}

class Test{
	int su;
}
