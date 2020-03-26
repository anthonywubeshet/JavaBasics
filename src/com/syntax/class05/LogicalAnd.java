package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		int num=78;
		
		if(num>=1 && num<=10) {System.out.println("Small num");}
		else if(num>=11 && num<=100) {System.out.println("Big num");}
		else if(num>=100 && num<=1000) {System.out.println("Large num");}
		
		int day=6;
		
		if(day==2 || day==3) {System.out.println("SDLC");}
		else if(day==6 || day==7) {System.out.println("Java");}
		else if(day==1 || day==5) {System.out.println("off day");} 
		else if(day==4) {System.out.println("Review");} 
		
		String day1="Saturday";
				
		if(day1.equals("Tuesday") || day1.equals("Wedsnday")) {System.out.println("SDLC");}
		else if(day1.equals("Saturday") || day1.equals("Sunday")) {System.out.println("Java");}
		else if(day1.equals("Monday") || day1.equals("Friday")) {System.out.println("Off day");}
		else if(day1.equals("Thursday")) {System.out.println("Review");} 
		

		
	
	
	
	}
}
