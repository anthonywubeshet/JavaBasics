package com.syntax.class12;

public class task {

	public static void main(String[] args) {
		
		String day="Sunday";
		
		for(int i=5; i>=0; i--) {
			System.out.print(day.charAt(i));
		}
		System.out.println();
		
		String str="Today";
		int num= str.length()/2;
		
		if(!str.isEmpty()) 
			if(str.length()%2!=0 && str.length()>3) {
				System.out.println(str.charAt(num));
			}
		
		
		
		
		
		

	}

}
