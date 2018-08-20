
public class PhoneFee { 
	private int division; //����
	private String tel; //��ȭ��ȣ
	private String name; //�̸�
	private int supply; // ��ȭ��
	private int minimum_fare; //�⺻���
	private int phone_bill; //��ȭ��
	private int tax; // ����
	private int sum; //�հ�
	
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


