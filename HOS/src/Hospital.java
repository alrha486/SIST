/* int
 * HosCustomerNumb=번호
 * HosDay=입원일수
 * HosAge=나이
 * HosMoney=진찰비
 * HosSum=총입원비
 * HosPrice=입원비
 * HosExpenses=진료비
 * 
 * String
 * HosCode=진료코드
 * ins=입력
 * outs=출력
 */

public class Hospital {
	//----------------------변수선언
	private String HosCode;
	private int HosCustomerNumb,
				HosDay,
				HosAge,
				HosMoney,
				HosSum,
				HosPrice,
				HosExpenses;
	//---------------------------생성자선언
	public Hospital(int hosCustomernumb, 
						String hosCode, 
							int hosDay, 
							int hosAge){//생성자 파라미터 
		HosCustomerNumb = hosCustomernumb;
		HosCode = hosCode;
		HosDay = hosDay;
		HosAge = hosAge;
	}
	
	//--------------------------getter,setter 입력,출력,나이,입원일수,번호,진료코드는 getter만 가짐
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