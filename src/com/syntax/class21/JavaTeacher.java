package com.syntax.class21;

public class JavaTeacher extends Teacher {

	String cert;
	
	 JavaTeacher(String name,String lastName,String cert) {
		super(name,lastName);//super must be first line 
		this.cert=cert;
	}
	 
	 JavaTeacher(String name,String lastName) {
			super(name,lastName);
			
		}
}
