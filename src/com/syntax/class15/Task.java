package com.syntax.class15;

public class Task {

	void large(int a,int b) {
		if(a>b) {
			System.out.println(a+" is largest");
		}else {
			System.out.println(b+" is largest");
		}
	}
	void even(int a) {
		if(a%2==0) {
			System.out.println(a+" is even");
		}else {
			System.out.println(a+" is odd");
		}
	}
	
	void palindrome(String b) {

		String a="";
		for(int i=b.length()-1;i>=0;i--) {
			a=a+b.charAt(i);
		}
		
		if(a.equals(b)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
