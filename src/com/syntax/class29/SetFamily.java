package com.syntax.class29;


import java.util.*;

public class SetFamily {

	public static void main(String[] args) {
		//hashset does not guarantee insertion order
		Set<String> veggies = new HashSet<>();
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucmber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("tomato");
		System.out.println(veggies);
		//LinkedHashSet guarantee insertion order
		Set<String>fruits=new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("tomato");
		fruits.add("banna");
		fruits.add("mango");
		fruits.add("tomato");
		System.out.println(fruits);
		
		//tree set stores objects in ascending order
		Set<String> food=new TreeSet<>(veggies);
		//adding duplicate objects from veggies collection
		food.addAll(fruits);
		System.out.println(food);
	}

}
