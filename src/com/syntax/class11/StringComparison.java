package com.syntax.class11;

public class StringComparison {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2=new String("Hello");
		String str3="Hello";
		
		if(str1.equals(str2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings not equal");
		}
		
		
		if(str1==str2) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("String are not equal");
		}
		
		if(str1==str3) {
			System.out.println("String are equal");
		}else {
			System.out.println("String are not equal");
		}
		
	}

}
