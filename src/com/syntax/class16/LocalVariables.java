package com.syntax.class16;

public class LocalVariables {
	
	void nameInside() {
		String name="John";
		//local variable that visible only within method it was declared	
	}

	public static void main(String[] args) {
		
		LocalVariables obj=new LocalVariables();
		obj.nameInside();
		
		
		
		boolean flag=true;
		
		if(flag) {
			String answer="Yes";
		}
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
}
