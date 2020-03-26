package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
boolean Today=true;
boolean flag=false;

if(Today) {System.out.println("Hello");
if(flag) {System.out.println("Hello friends");}
else {System.out.println("Hello Family");}}
else {System.out.println("Bye");}

boolean isFriday=true; 
int date=13; 

if(isFriday) {System.out.println("I am going to movies");
if(date==13) {System.out.println("Ill watch horror movie");}
else{System.out.println("ill watch a comedy");}}
else {System.out.println("I am staying home");}

boolean allergies=true;
boolean apple=false;
boolean orange=true; 
boolean kiwi=false; 

if(allergies) {System.out.println("Please answer below");}
if(orange) {System.out.println("Do not ear orange");}
else {System.out.println("You are Healthy");}


	
	}

}
