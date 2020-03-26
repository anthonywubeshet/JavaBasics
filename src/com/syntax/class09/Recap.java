package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++)
		{for(int y=0; y<=9; y++){System.out.println(i+""+y);}}
		
		
		for(int c1=0; c1<=23; c1++) {
			for(int c2=0; c2<=59; c2++) {
				if(c2<10) {System.out.println(c1+":0"+c2);}
				else {System.out.println(c1+":"+c2);}}
		}
		
		for(int a1=0; a1<10; a1++) {
			for(int a2=0; a2<10; a2++) {
				for(int a3=0; a3<10; a3++) {
					for(int a4=0; a4<10; a4++) {
						System.out.println(a1+""+a2+""+a3+""+a4);
					}
				}
			}
		}
		

	
	
	
	}}
