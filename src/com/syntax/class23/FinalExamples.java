package com.syntax.class23;

public class FinalExamples {
	
	final String str="I love java";
	
	final void saySmth(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		FinalExamples obj=new FinalExamples();
		//obj.str="i dont"; final variables can't be modified 
	}

}
