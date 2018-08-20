
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
		if(supply ==1) {
			this.minimum_fare = 6000;
		}else if(supply ==2){
			this.minimum_fare = 4800;
		}else if(supply == 3) {
			this.minimum_fare = 3000;
		}
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

	

}
