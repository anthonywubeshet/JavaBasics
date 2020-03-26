package com.syntax.class02;

public class ArithmeticOperatiors {
public static void main (String[] args){

	int num1=30; 
	int num2=10; 
	
	int sum=num1+num2; 
	
	double num3=10.99;
	double num4=11.99; 
	
	double sum1=num3+num4; 
	
	int sub=num1-num2;
	
	int mult=num1*num2;
	
	int div=num1/num2; 
	
	System.out.println("The result of the division is = "+div);
	
	double dec=13.45; 
	double dec1=17.95; 
	
	double decsum=dec+dec1; 
	double decsub=dec-dec1; 
	double decmult=dec*dec1; 
	double decdiv=dec/dec1; 
	double num5=3.9;
	
	System.out.println("The square root of "+num5+" is "+Math.sqrt(num5));
	
	int width=5;
	int height=8; 
	
	int perimiter=2*(width+height);
	int area= width*height; 
	
	System.out.println("The perimeter of a rectangle with width "+width+" and hieght "+height+" is equal to "+perimiter+" and the area is "+area );
	
}}
