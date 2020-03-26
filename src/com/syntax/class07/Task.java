package com.syntax.class07;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
	Scanner scan; 
	int c;
	scan=new Scanner(System.in); 
	
	do {System.out.println("pay for candy");
	c=scan.nextInt();}
	while(c!=2);
	System.out.println("enjoy candy");

	int sum=0;
	for(int i=1; i<=99; i+=2) { 
	sum=i+sum;
	}
	System.out.println(sum);
	
	int sum1=0;
	for(int q=2; q<=99; q+=2) { 
		sum1=q+sum1;
	}
	System.out.println(sum1);
	
	
	
	
	}
}
