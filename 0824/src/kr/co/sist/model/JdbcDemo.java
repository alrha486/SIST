package kr.co.sist.model;

import java.sql.SQLException;

public class JdbcDemo {
	public static void main(String[] args){
		try{
			SungjukDAO.delete();
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		
		}
}
