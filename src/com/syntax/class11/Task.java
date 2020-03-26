package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		
		String username="Anthony";
		String password="AAA888AAAA";
		String cpassword="AAA888AAAA";
		
		if(username.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password cannot be empty");
		}else if(password.length() < 8) {
			System.out.println("Password too short");
		}else if(password.contains(username)) {
			System.out.println("password cannot contain username");
		}else if(!password.equals(cpassword)) {
			System.out.println("Passwords do not match");
		}else {
			System.out.println("Username and password created");
		}
	}

}
