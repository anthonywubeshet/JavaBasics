package com.syntax.class12;

public class StringManipulationsMore {

	public static void main(String[] args) {
		
		String str="Today is a rainy day"; 
		String partialString=str.substring(6);
		System.out.println(partialString);
		
		partialString=str.substring(11);
		System.out.println(partialString);
		  
		
		partialString=str.substring(0, 5);
		System.out.println(partialString);
		
		partialString=str.substring(11, 16);
		System.out.println(partialString);
		
		String a="123456789";
		String b="abcdf";
		String c="";
		
		for(int i=0; i<a.length(); i+=3) {
			int x=i+1;
			c=c+a.substring(i, x);
			
		}
		
		System.out.println(c);
		
		
		
		

	}

}
