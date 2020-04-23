package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMap {

	public static void main(String[] args) {
		//store student id and corresponding name
		//LinkedHashMap - preserves the insertion order
		Map<Integer, String> lmap=new LinkedHashMap<>();
		lmap.put(1000, "John Smith");
		lmap.put(1001, "Jane Smith");
		lmap.put(1002, "Faisal Sakhi");
		lmap.put(102, "Ali Tarlaci");
		
		System.out.println(lmap);
		
		//store object in a form of K and V and you want to sort your keys in Ascending order
		Map<Integer, String> tmap=new TreeMap<>(lmap); 
		System.out.println(tmap);
		
		//create a map of Country and population and sort countries in Alphabetical order 
		
		Map<String, Integer> population=new TreeMap<>();
		population.put("USA", 3300000);
		population.put("Kazakhstan", 1800000);
		population.put("India", 132600000);
		population.put("Afghanistan", 3700000);
		System.out.println(population);
		
	}

}
