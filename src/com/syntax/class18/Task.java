package com.syntax.class18;

public class Task {
	
	
	 public static String alpha(String str){
		    
		    String str1="";
		     str1=str1+str.charAt(0);
		    for(int i=1; i<str.length(); i++){
		      if(str.charAt(i)>str.charAt(i-1)) {
		    	  str1=str1+str.charAt(i);
		      }
		      
		    }str=str1;
		    return str;
		    
		  }
	
	
	
	
	
	public static void main(String[] args) {
		
		String str= "";
		char s='a';
		
		str=str+s;
		System.out.println(str);
		
	}
}
