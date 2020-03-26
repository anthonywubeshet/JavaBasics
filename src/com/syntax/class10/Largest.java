package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		
		int[] nums= {200, 30, 66, 850, 99};
		int large=0;
		int o=0;
		
		for(int x:nums) {
			if(large<nums[o]) {large=nums[o];
				
			}
			
			o++;
		}

		System.out.println(large);
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>large) {
				large=nums[i];
			}
		}
	System.out.println(large);
	
	
	}

}
