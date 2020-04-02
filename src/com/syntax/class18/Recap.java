package com.syntax.class18;

public class Recap {

	protected int SumFromArray(int[] array) {
		
		int total=0;
		for(int i=0; i<array.length; i++) {
			total += array[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		Recap obj=new Recap();
		int[] array= {2,8,55,344};
		System.out.println(obj.SumFromArray(array));
	}
}
