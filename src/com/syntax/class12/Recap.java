package com.syntax.class12;

public class Recap {

	public static void main(String[] args) {
	
		String str="";
		System.out.println(str.isEmpty());
		
		String str1=" Good Morning ";
		String str2="students";
		String str3="!";
		
		str1=str1.concat(str2).concat(str3);
		System.out.println(str1);
		
		String str4="Day";
		int date=25;
		
		String str5=" Hello "; 
		String str6="Syntax";
		
		str5=str5.concat(str6).trim();
		System.out.println(str5);
		

	}

}
