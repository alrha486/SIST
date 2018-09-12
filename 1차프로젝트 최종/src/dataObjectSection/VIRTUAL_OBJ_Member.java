package dataObjectSection;


public class VIRTUAL_OBJ_Member {
	private String m_id, m_di, m_pw, m_name, m_age, m_gender;
	
	
	
	
	
	public VIRTUAL_OBJ_Member(String m_name,String m_age,String m_id, String m_pw) {
		this.m_age = m_age;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
	}
	
	
	
	
	
	
	public String getM_gender() {
		return m_gender;
	}
	public void setM_gender(String m_gender) {
		this.m_gender = m_gender;
	}
	public String getM_age() {
		return m_age;
	}
	public void setM_age(String m_age) {
		this.m_age = m_age;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_di() {
		return m_di;
	}
	public void setM_di(String m_di) {
		this.m_di = m_di;
	}
	
}
