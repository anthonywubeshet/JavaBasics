package com.syntax.class19;

public class Puppy extends Dog {
	static int total=0;
	
	static void sum(int[][] d) {
		for(int[] array:d) {
			for(int i:array) {
				total=i+total;
				
				
			}
			
		}System.out.println(total);
	}
	
	public static void main(String[] args) {
		Puppy obj=new Puppy();
		int[][] a = { 
                { 1, 2, 3 }, 
                { 4, 5, 6 }, 
                { 7, 8, 9 } 
                                  };
		obj.sum(a);
		
	}

}
