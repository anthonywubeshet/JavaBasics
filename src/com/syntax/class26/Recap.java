package com.syntax.class26;

public class Recap {

	public static void main(String[] args) {
		
		int num10;
		Doctor doc=new Doctor();
		
		int[] numbers= {10,20,30,40};
		Doctor[] doctors= {new Doctor(),new Doctor(),new Doctor()};
		
		String[] names=new String[2];
		names[0]="vital";
		names[1]="ghulam";
		
		//during runtime Java will give an exceptions because arrays are fixed in size
		//names[2]="Jawid";
	}
}
