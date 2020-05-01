package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRecap {

	public static void main(String[] args) {
		
		Map<String, String> hmap=new HashMap<>();
		hmap.put("Usa", "DC");
		hmap.put("Russoa", "Moscow");
		hmap.put("France", "Paris");
		hmap.put("Tajikstan", "Dushanbe");
		hmap.put("Italy", null);
		hmap.put(null, "some value");
		hmap.put(null, "another value");// duplicate key, previous value will be overwritten
		hmap.put("Germany", null);
		System.out.println(hmap);
		
		//how to get all keys from a map? keySet(), entrySet();
		Set<String> keys=hmap.keySet();// use loop or iterator to iterate over keys
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<Entry<String, String>> entries=hmap.entrySet();
		Iterator<Entry<String,String>> iter=entries.iterator();
		//lets get both key and value
		while(iter.hasNext()) {
			Entry<String,String> entry=iter.next();
			String myEntry=entry.getKey()+"--"+entry.getValue();
			System.out.println(myEntry);
		}
		
		//how to get only values from map? values(), entrySet();
		Collection<String> values=hmap.values();
		it=values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Map<String,String> htable= new Hashtable<>();
		htable.put("Usa", "DC");
		htable.put("Russoa", "Moscow");
		htable.put("France", "Paris");
		htable.put("Tajikstan", "Dushanbe");
		//htable.put("Italy", null); can not store null values inside hashtable 
		//htable.put(null, "some value"); can not store null keys inside hashtable
		System.out.println(htable);
		
		//first part of the code
		createMap("City","Chantilly");
		
		//second part of the code
		createMap("City","DC");
		

	}
	
	public static Map<String,String> createMap(String key, String value) {
		Map map=new HashMap<>();
		map.put(key, value);
		
		return map;
	}

}
