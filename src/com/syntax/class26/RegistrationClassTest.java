package com.syntax.class26;

public class RegistrationClassTest {

	public static void main(String[] args) {
		
		RegistrationClass rc=new RegistrationClass();
		rc.setEmail("john@yahoo.com");
		System.out.println(rc.getEmail());
		
		rc.setUserName("Johnny123");
		System.out.println(rc.getUserName());
		
		rc.setPassword("asfdfasdfasf");
		System.out.println(rc.getPassword());
		
		
	}

}
