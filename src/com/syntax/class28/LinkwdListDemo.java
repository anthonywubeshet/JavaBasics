package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkwdListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		list.add("Yunis");//comes from collection
		list.add(0, "Reyhan");//comes from List
		list.add("Pavel");
		list.add("Farid");
		list.add("Farid");
		list.add("Farid");
		
		int size=list.size();
		System.out.println(size);
		
		//get all elements 1 by 1  3 different ways
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String a:list) {
			System.out.println(a);
		}
		
		Iterator<String> it= list.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str);
		}
		
		//can we store objects of user defined classes?
		//LinkedList<> =new LinkedList<>();
		
	
		
		
		
		
		

	}

}
