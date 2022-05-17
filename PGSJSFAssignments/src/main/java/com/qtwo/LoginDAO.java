package com.qtwo;

public class LoginDAO {
	
	public static boolean validate(String user, String password) {
		if(user.equals("admin") && password.equals("admin"))
			return true;
		return false;
	}

}
