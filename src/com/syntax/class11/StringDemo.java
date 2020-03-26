package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		
		String school=" Syntax ";
		
		String str=new String("HELLO");
		
		String str1="This a String 57575 #$%%6";
		
		System.out.println(school.length());
		
		int size=str.length();
		System.out.println(size);
		
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str=str.toLowerCase();
		System.out.println(str);
		
		String nw=str+school;
		System.out.println(nw);
		
		String day="Saturday";
		String date="14";
		
		String newDate=day.concat(date);
		System.out.println(newDate);
		
		char grade='A';
		String str2="Student";
		
		String str3="";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		String str4="    Welcome to Syntax!   "; 
		str4=str4.trim();
		System.out.println(str4);
		
		
	}

}
