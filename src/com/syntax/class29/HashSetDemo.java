package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// create a collection that will store only unique objects/ don't care about order
		HashSet<String> breakfast=new HashSet<>();
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("tea");
		breakfast.add("cream cheese");
		breakfast.add("eggs");
		breakfast.add("coffee");
		
		//how many elements in the set?
		int size=breakfast.size();
		System.out.println(size);
		//order is not maintained 
		System.out.println(breakfast);
		
		//we need to retrieve an element--->no get method available 
		//we can retrieve all elements!
		Iterator<String> it=breakfast.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//we can not use regular for loop to retrieve all elements
		
		for(String item:breakfast) {
			System.out.println(item);
		}
		
		
		
	}

}
