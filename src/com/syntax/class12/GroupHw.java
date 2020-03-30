package com.syntax.class12;

public class GroupHw {

	public static void main(String[] args) {
		
		
		String b="madam";
		String a="";
		
		for(int i=b.length()-1;i>=0;i--) {
			a=a+b.charAt(i);
		}
		
		if(a.equals(b)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	
	
	
	
	
}}
		