public class ReferenceCopyDemo1 {
public static void main(String[] args) {
	
	Student jinwoong = new Student();
	jinwoong.kor = 100;
	jinwoong.eng = 98;
	
	Student minho = new Student();
	
	minho = jinwoong;
	//jinwoong.kor = 60;
	//minho.kor = 60;
	//System.out.printf("진웅이의 국어 점수는 : %d 입니다.\n", jinwoong.kor);
	//System.out.printf("민호의 국어 점수는 : %d 입니다.\n", minho.kor);
	
	jinwoong.abc(jinwoong.kor, jinwoong.eng);
	minho.abc(minho.kor, minho.eng);
	
	//minho.kor = 84;
	//minho.eng = 90;
	
}
}

class Student{
	int kor; 
	int eng;

	public void abc(int kor, int eng) {
		System.out.printf("kor : %d , eng : %d\n", kor, eng);
	}
}
