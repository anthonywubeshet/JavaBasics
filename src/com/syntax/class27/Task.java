package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	//create an arraylist of cars and retrieve all the values using 3 different ways.
	//create an arraylist of words. Remove every word that ends with "e". Use iterator
	
	public static void main(String[] args) {
		ArrayList<String> greetings=new ArrayList<>();
		greetings.add("Hello");
		greetings.add("Merhabla");
		greetings.add("Hola");
		greetings.add("asdade");
		
		Iterator<String> greetings2= greetings.iterator();
		
		while(greetings2.hasNext()) {
			if(greetings2.next().endsWith("e")) {
				greetings2.remove();
			}
		}
		System.out.println(greetings);
	}

}
