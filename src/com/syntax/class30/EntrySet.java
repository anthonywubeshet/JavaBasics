package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {

	public static void main(String[] args) {
		Map<String,String> land=new TreeMap<>();
		land.put("Togo", "Lome");
		land.put("Jamica", "Kingston");
		land.put("Iran", "Tehran");
		land.put("Peru", "Lima");
		land.put("Cuba", "Havana");
		System.out.println(land);
		
		//storing all entry objects into a set
		Set<Entry<String, String>> allEntries=land.entrySet();
		System.out.println(allEntries);
		
		//loop through all entries to get a key and values 
		for(Entry<String,String> entr:allEntries) {
			String key=entr.getKey();
			String value=entr.getValue();
			System.out.println(key+"----"+value);
		}
		
		//iterate through all entries to get a key and value
		Iterator<Entry<String,String>> entryIt=allEntries.iterator();
		while(entryIt.hasNext()) {
			Entry<String,String> e=entryIt.next();
			String keyvalue=e.getKey()+":::"+e.getValue();
			System.out.println(keyvalue);
		}
		
		
		
		
	}

}
