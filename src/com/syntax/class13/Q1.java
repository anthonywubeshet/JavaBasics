package com.syntax.class13;

public class Q1 {

	public static void main(String[] args) {
	
		int a=10;
		int b=20; 
		
		a=a+b; 
		b=a-b;
		a=a-b;
		
		System.out.println("The value of a ="+ a);
		System.out.println("The value of b ="+ b);
		
		String str1="Day";
		String str2="Night";
		
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
		
		String s1="Hello";
		String s2="Bye";
		
		String s3=s1+s2;
		s2 = s3.replace(s2, "");
		s1= s3.replace(s1, "");
		
		System.out.println(s2);

	}

}
