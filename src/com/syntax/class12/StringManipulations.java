package com.syntax.class12;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str="Good Morning Students!";
		char letter1=str.charAt(0);
		
		System.out.println(letter1);
		
		char letter6=str.charAt(5);
		System.out.println(letter6);
		
		char letters;
		for(int i=0;i<str.length(); i++) {
			letters=str.charAt(i);
			System.out.print(letters);
		}
		System.out.println();
		
		String name="Syntax Technologies";
		
		int index=name.indexOf("y"); 
		System.out.println(index);
		
		index=name.indexOf(" ");
		System.out.println(index);
		
		index=name.indexOf("Syntax");
		System.out.println(index);
		
		index=name.indexOf("!");
		System.out.println(index);
		
		index=name.indexOf("o");
		System.out.println(index);
		
		index=name.lastIndexOf("o");
		System.out.println(index);
		
		
		
		
		
		
		
		

	}

}
