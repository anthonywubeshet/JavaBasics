package com.syntax.class10;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		
		String [] animals= { "duck", "cow","dog","cat","tiger","lion"};
		for(String i:animals) {
			System.out.println(i);
		}

		for(int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		
		
		int sum=0;
		int[] num= {4,6,8,3};
		
		for(int x:num) {
			sum=sum + x;
			}
		System.out.println(sum);
		
		String[] countries= {"Canada","Sweden","Jordan"};
		String[] capitals= {"cap C","cap S","cap J"};
		int o=0;
		
		for(String y:countries) {
			System.out.println(y+" "+capitals[o]);
			o++;
		}
		
	
		
		int j=0;
		for(int i=0; i<countries.length; i++) {
			System.out.println(countries[i]+" "+capitals[j]);
			j++;
		}
		
		
		
		
		
	
	
	
	
	}}
