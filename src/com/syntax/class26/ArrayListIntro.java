package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		//create an arrayList to store numbers
		
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(10);//auto boxing
		numbers.add(20);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(numbers.get(2));
		
		for(int i=0; i<numbers.size(); i++) {
			Integer num=numbers.get(i);//auto unboxing
			System.out.println(num);
		}
		
		for(Integer num: numbers) {
			System.out.println(num);
		}
		
		numbers.remove(10);

	}

}
