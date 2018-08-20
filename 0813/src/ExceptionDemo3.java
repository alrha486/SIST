
public class ExceptionDemo3 {
	public static void main(String[] args) {
		Student jinwoong = null;
		try{
//			 jinwoong = new Student(10);
		}catch(RuntimeException e) {
			System.out.println(e);
		}
		System.out.println(jinwoong);
		
	}
}
class Student{
	private int kor;
	
	public Student(int kor) throws Exception{
		if(kor < 0 || kor >100) {
			throw new RuntimeException("잘못된 국어점수입니다.");
		}
		else this.kor = kor;
	}
	
	@Override
	public String toString() {
		return "Student [kor=" + kor + "]";
	}


}
