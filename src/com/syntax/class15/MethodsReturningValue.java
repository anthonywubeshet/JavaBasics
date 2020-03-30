package com.syntax.class15;

public class MethodsReturningValue {

	public static void main(String[] args) {
		
		//create a String and based on the length of the String 
		//we define whether String is small or big
		
		String str="Hello my friends";
		int length=str.length();
		
		if(length>10) {
			System.out.println("String is big");
		}else {
			System.out.println("String is small");
		}
		
		//compare 2 numbers and then we identify whether largest number is even or odd
		
		MethodsReturningValue obj=new MethodsReturningValue();
		obj.largest(10, 20);
		boolean flag=obj.isOdd(8);
		System.out.println(flag);

	}
	
	//create a method that returns largest number from 2 given numbers
	int largest(int a,int b) {
		int largest;
		if(a>b) {
			largest=a;
		}else {
			largest=b;
		}
		return largest;
	}
	
	boolean isOdd(int num) {
		
		boolean isOdd;
		if(num%2==0) {
			isOdd=false;
		}else {
			isOdd=true;
		}
		return isOdd;
	
	}

}
