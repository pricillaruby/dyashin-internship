package com.encapsulation;

public class Login {
	private String userName = "Admin";
	private String password = "admin@1234";
	
	public void userLogin(String userName , String password) {
		if(isValid(userName,password)) {
			System.out.println("Login Successful");
		}else {
			System.out.println("Wrong Credentials");
		}
	}

	private boolean isValid(String name, String userPassword) {
		// TODO Auto-generated method stub
		return userName.equals(name) && password.equals(userPassword);
	}
}
