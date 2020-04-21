package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
		
		//store flowers into array
		
		Flower[] flowerArray={new Rose("rose"),new Tulip("Tulip"),new Sunflower("sunflower")};
		
		//store flowers into arraylist
		ArrayList<Flower> flowers=new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
		//flowers.add("rose"); cannot add String object into ArrayList of Flower Objects
		
		//hw to call available methods using: for loop, advanced for loop, iterator
		//hw create food class that will have 3 undefined methods and it will have 4 subclasses;
		//create a collection of food and using 3 ways execute methods 
		
		for(Flower arrayList:flowers) {
			arrayList.bloom();
		}
		
		Iterator<Flower> it=flowers.iterator();
		while(it.hasNext()) {
			Flower str= it.next();
			str.bloom();
		}
	}

}
