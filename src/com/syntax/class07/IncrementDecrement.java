package com.syntax.class07;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int x=10;
				x=x+1;
				x+=1;
		x++;
		System.out.println(x);
		x--;
		// loop
		int time=10;
		if(time<12) {System.out.println("Good");}
		
		while(time<12) {System.out.println("Good");
		time++;}
		
		int u=1;
		while(u>=50) {System.out.println(u);
		u++;
		}
		
		int w=10;
		while(w>=1) {System.out.println(w);
		w--;
		}
		
		
        int num1=1;
		while(num1<=20) {
			System.out.println(num1);
			num1+=2;
			}
	
		int num2= 1;
		 while(num2<=20) {
			 if(num2%2!=0) {
				 System.out.println(num2);
			 }
			 num2++;
		 }
boolean workDay=true;
int day=1;

while(workDay) if(day<6){System.out.println("I need a day off");
day++;
}else if(workDay){System.out.println("I do not need a day off any more");
	workDay=false;}
	
int num5=1;
	do {System.out.println("Hello");
	num5++;}
	while(num5<=5);
	
	
	}
	}
