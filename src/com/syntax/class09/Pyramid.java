package com.syntax.class09;

public class Pyramid {

	public static void main(String[] args) {

		for(int r=1; r<=9; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
	
	
	}}
