package com.syntax.class07;

import java.util.Scanner;

public class LoopsScanner {

	public static void main(String[] args) {
		Scanner scan;
		String name; 
		int num=1;
		scan=new Scanner(System.in); 
		
		while(num<=5) {
		System.out.println("What is your name");
		name=scan.nextLine();
		System.out.println("Good afternoon "+ name);
		num++;}

		int num1=1;
		
		
		while(num1!=17) {System.out.println("num 1-20");
		num1=scan.nextInt();}
		 if(num1==17) {System.out.println("congratz");
		}
		
		 do {System.out.println("num 1-20");
		 num1=scan.nextInt();}
		 while(num1!=17);
		 System.out.println("congratz");
	
		 for(int c=1; c<6; c++) {System.out.println("Good morning");}
		 
		 int sum=0;
		for(int i=1; i<5; i++) {System.out.println(sum);}
		for(int q=20; q>0; q-=2) {System.out.println(q);}
		for(int i=21; i<=50; i+=2) {System.out.println(i);}
	}
}
