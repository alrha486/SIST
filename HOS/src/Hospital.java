/* int
 * HosCustomerNumb=��ȣ
 * HosDay=�Կ��ϼ�
 * HosAge=����
 * HosMoney=������
 * HosSum=���Կ���
 * HosPrice=�Կ���
 * HosExpenses=�����
 * 
 * String
 * HosCode=�����ڵ�
 * ins=�Է�
 * outs=���
 */

public class Hospital {
	//----------------------��������
	private String HosCode;
	private int HosCustomerNumb,
				HosDay,
				HosAge,
				HosMoney,
				HosSum,
				HosPrice,
				HosExpenses;
	//---------------------------�����ڼ���
	public Hospital(int hosCustomernumb, 
						String hosCode, 
							int hosDay, 
							int hosAge){//������ �Ķ���� 
		HosCustomerNumb = hosCustomernumb;
		HosCode = hosCode;
		HosDay = hosDay;
		HosAge = hosAge;
	}
	
	//--------------------------getter,setter �Է�,���,����,�Կ��ϼ�,��ȣ,�����ڵ�� getter�� ����
	public int getHosMoney() {
		return HosMoney;
	}
	public void setHosMoney(int hosMoney) {
		HosMoney = hosMoney;
	}
	public int getHosSum() {
		return HosSum;
	}
	public void setHosSum(int hosSum) {
		HosSum = hosSum;
	}
	public int getHosPrice() {
		return HosPrice;
	}
	public void setHosPrice(int hosPrice) {
		HosPrice = hosPrice;
	}
	public int getHosExpenses() {
		return HosExpenses;
	}
	public void setHosExpenses(int hosExpenses) {
		HosExpenses = hosExpenses;
	}
	public String getHosCode() {
		return HosCode;
	}
	public int getHosCustomerNumb() {
		return HosCustomerNumb;
	}
	public int getHosDay() {
		return HosDay;
	}
	public int getHosAge() {
		return HosAge;
	}
}