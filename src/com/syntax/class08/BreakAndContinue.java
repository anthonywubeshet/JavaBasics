package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
	
		for(int i=1; i<=10; i++) {
			if(i==4) 
			{ System.out.println("stop loop"); break;}
			System.out.println(i);}
System.out.println("Im out of loop");
	
	for(int y=1; y<=10; y++) {
		if(y==4)
		{System.out.println("skipping iteration"); continue;}
		System.out.println("inside loop");
		System.out.println(y);}
	
	for(int r=1; r<=20; r++) {
		if(r==5 || r==6 || r==7) 
		{continue;}
		System.out.println(r);}
	
	for(int t=1; t<=20; t++) {
		if(t>=6 && t<=18) {continue;}
		System.out.println(t);}
	
	for(int u=1; u<=50; u++) {
		if(u%3==0)
		{continue;}
		System.out.println(u);}
	

	
	
	}}

