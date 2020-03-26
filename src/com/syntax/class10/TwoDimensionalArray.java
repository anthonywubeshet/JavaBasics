package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int[][] nums=new int[3][4];
		
		nums[0][0]=10;
		nums[0][1]=20;
		nums[0][2]=30;
		nums[0][3]=40;
		
		nums[1][0]=5;
		nums[1][1]=10;
		nums[1][2]=15;
		nums[1][3]=20;
		
		nums[2][0]=1;
		nums[2][1]=2;
		nums[2][2]=3;
		nums[2][3]=4;
		
		System.out.println(nums[1][2]);
		
		int[][] num= {
				{10,20,30,40},
				{5,10,15,20},
				{1,2,3,4}
		};
		System.out.println(num[2][3]);
		
		String[][] month= {
				{"January","February","December"},
				{"March","April","May"},
				{"June","July","August"},
				{"September","October","November"}
		};
		System.out.println(month[3][2]);
		
		int rows=month.length;
		int firstArray=month[0].length;
		System.out.println(rows);
		
		
		for(int row=0; row< month.length; row++) {
			for(int col=0; col < month[row].length; col++) {
				System.out.println(month[row][col]+" ");
			}
		}
	
	
	}}
