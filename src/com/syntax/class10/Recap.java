package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		
		int[] grades=new int[4] ;
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		
		int average=(grades[0]+ grades[1]+ grades[2]+ grades[3]/4);
		
		
		String[] cities= {"dc","NY","paris","miami","LA","Dallas","Chantilly"};
		
		System.out.println("I live in "+ cities[2]);
	
		int x=1;
		System.out.println(cities[x]);
	
		int arraySize=cities.length;
		System.out.println("Total elements "+ arraySize);
		
		System.out.println(cities[arraySize-1]);
		
		for(int i=0; i<arraySize; i++) {
			System.out.println(cities[i]);
			
			
		}
	}

}
