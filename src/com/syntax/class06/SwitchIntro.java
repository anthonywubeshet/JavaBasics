package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		
		int day=5; 
		String dayName;
		
		if(day==1) {dayName="monday";}
		else if(day==2) {dayName="tuesday";}
		else if(day==3) {dayName="wed";}
		else if(day==4) {dayName="thurs";}
		else if(day==5) {dayName="Fri";}
		else if(day==6) {dayName="Sat";}
		else if(day==7) {dayName="Sun";}
		else {dayName="Invalid";}
		
		String today;
		
		switch(day) {
		case 1: today="Monday";
		break;
		case 2: today="Tuesday";
		break;
		case 3: today="Wednesday";
		break;
		case 4: today="Thursday";
		break;
		case 5: today="Friday"; 
		break;
		case 6: today="Saturday";
		break;
		case 7: today="sunday";
		break;
		default: today="Invalid";
		}
	System.out.println("Today is "+today);
	
	
	}}
