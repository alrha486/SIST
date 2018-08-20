public class CarCenter {
	public static void main(String[] args) {
		Sonata sonata = new Sonata("Silver Sonata");
		Martiz martiz = new Martiz("Pink Martiz");
		CarCenter cc = new CarCenter();
		cc.repair(sonata);
		
//		int [][] a = new int[3][4];
//		System.out.println(a[0].length);
		
	}
	
	void repair(Car car) {
		if(car instanceof Martiz) {
			System.out.println("마티즈가 잘 수리되었습니다.");
		}else if(car instanceof Carnival) {
			System.out.println("카니발이 잘 수리되었습니다.");
		}else if(car instanceof Sonata) {
			System.out.println("소나타가 잘 수리되었습니다.");
		}
//		System.out.println(car.toString() + " 이/가 잘 수리되었습니다.");
	}
}
