
public class PhoneFee { 
	private int division; //구분
	private String tel; //전화번호
	private String name; //이름
	private int supply; // 통화량
	private int minimum_fare; //기본요금
	private int phone_bill; //통화료
	private int tax; // 세금
	private int sum; //합계
	
	public PhoneFee() {
		
	}
	
	public PhoneFee(int division, String tel, String name, int supply) {
		this.division = division;
		this.tel = tel;
		this.name = name;
		this.supply = supply;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getSupply() {
		return supply;
	}

	public void setSupply(int supply) {
		this.supply = supply;
	}

	public int getMinimum_fare() {
		return minimum_fare;
	}

	public void setMinimum_fare(int minimum_fare) {
		this.minimum_fare = minimum_fare;
	}

	public int getPhone_bill() {
		return phone_bill;
	}

	public void setPhone_bill(int phone_bill) {
		this.phone_bill = phone_bill;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getDivision() {
		return division;
	}

	public String getName() {
		return name;
	}
	
	public void output() {
			System.out.printf("%-10d %5s %5s %5d %5d %5d %5d \n",
		division,tel , name, minimum_fare, phone_bill, tax, sum);
	}
	}


