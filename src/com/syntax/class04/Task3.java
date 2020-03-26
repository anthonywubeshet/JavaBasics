package com.syntax.class04;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		Scanner inp;
	     int x ;
	    System.out.print("In:");
	    
	    inp=new Scanner(System.in); 
		
	     x=inp.nextInt(); 
	  	for(int i=x-1; i>=0; i--) {
	  		System.out.print(i+" ");
	  	}
	}

}
