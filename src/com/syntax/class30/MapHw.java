package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapHw {

	public static void main(String[] args) {
		//enteries with duplicate keys and values
		Map<Integer, String> building=new LinkedHashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Google");
		building.put(4, "Amazon");
		building.put(5, "HP");
		building.put(6, "Microsoft");
		building.put(7, "Oracle");
		
		System.out.println(building.size());
		System.out.println(building);
		
		//how to get all keys
		Set<Integer> keys=building.keySet();
		Iterator<Integer> keysIt=keys.iterator();
		while(keysIt.hasNext()) {
			int key=keysIt.next();
			//key is__ands it value is___
			System.out.println("Key is "+ key+" its value is "+building.get(key));
		}
		
		for(int k:keys) {
			System.out.println("Keys from building map "+k+":"+building.get(k));
		}
		
		//how to get all values
		Collection<String> values=building.values();//Iterable=collection
		
		for(String v:values) {
			System.out.println("value from collection "+v);
		}
		
		Iterator<String> valuesIt=values.iterator();
		while(valuesIt.hasNext()) {
			System.out.println("Map values: "+ valuesIt.next());
		}
		
		
	}

}
