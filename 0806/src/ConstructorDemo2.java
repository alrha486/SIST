
public class ConstructorDemo2 {
	public static void main(String[] args) {
	MyCalender mc = new MyCalender(2018,8,06);
	mc.display();
	mc.setYear(2045);
	mc.display();
	System.out.println(mc.getYear());
	System.out.println(); 
}
}

class MyCalender{
//	 MyCalender(){
//		 this("unknown",10000); 
//	 }
	private int year, month,day;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void display() {
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}
	
	public MyCalender(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;

		
		
		 
		
	}
	
	
}
