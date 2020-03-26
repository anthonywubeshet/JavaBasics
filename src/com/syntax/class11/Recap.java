package com.syntax.class11;

public class Recap {
	
public static void main(String[] args) {
	
	int elements=0;
	
	String[][] month= {
			{"January","February","December"},
			{"March","April","May"},
			{"June","July","August"},
			{"September","October","November"}
	};
	
	for(String[] array:month) {
		for(String i:array) {
			System.out.print(i+" ");
			elements= 1+elements;
		}
		System.out.println();
	}
	
	System.out.println(elements);
	
	
	
}

}
