public class Calc {
	private PhoneFee [] pf;
	private int count;	
	
	public Calc(PhoneFee [] pf, int count){
		this.pf = pf;
		this.count = count;

	}
	
   public void calc(){ // �޼ҵ�
	
	   
	   for(int i =0; i<count; i++) {
			PhoneFee pf1 = this.pf[i];
	    	   int a = pf1.getSupply(); // ��ȭ�� a�� ����
	    	   int phone_bill = a*12; //��ȭ��
	    	   pf1.setPhone_bill(phone_bill); 
	    	   int tax = (pf1.getSupply() + phone_bill)/10;// ����
	    	   pf1.setTax(tax);
	    	   int sum = (pf1.getSupply() + phone_bill + tax);
	    	   pf1.setSum(sum);
		}	
   }
}