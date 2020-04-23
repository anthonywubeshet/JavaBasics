package com.syntax.class29;

import java.util.*;

public class Task {

	public static void main(String[] args) {
		
		Set<String> cities = new LinkedHashSet<>();
		cities.add("Charles");
		cities.add("Turkey");
		cities.add("USA");
		cities.add("Afgahan");
		cities.add("Richmond");
		cities.add("Ashland");
		
		System.out.println(cities);
		Iterator<String> city=cities.iterator();
		
		while(city.hasNext()) {
			if(city.next().toLowerCase().startsWith("a")) {
				city.remove();
			}
		}
		System.out.println(cities);

	}

}
