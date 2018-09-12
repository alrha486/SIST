package dataObjectSection;


public class VIRTUAL_OBJ_Restaurant {
	private String r_no,r_division,r_name,r_address,r_menu;
	public VIRTUAL_OBJ_Restaurant(String r_no, String r_division, String r_name, String r_address, String r_menu) {
		this.r_no = r_no;
		this.r_division = r_division;
		this.r_name = r_name;
		this.r_address = r_address;
		this.r_menu = r_menu;
	}
	public VIRTUAL_OBJ_Restaurant(String r_no) {
		this.r_no = r_no;
	}
	public String getR_no() {
		return r_no;
	}
	public void setR_no(String r_no) {
		this.r_no = r_no;
	}
	public String getR_division() {
		return r_division;
	}
	public void setR_division(String r_division) {
		this.r_division = r_division;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_address() {
		return r_address;
	}
	public void setR_address(String r_address) {
		this.r_address = r_address;
	}
	public String getR_menu() {
		return r_menu;
	}
	public void setR_menu(String r_menu) {
		this.r_menu = r_menu;
	}
	
}
