package kr.co.sist.model;

import java.sql.SQLException;

public class SungjukController {
	public static void insert(StudentDTO s) {
		try {
			SungjukDAO.insert(s);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
