package com.syntax.class04;

public class Hw {

	public static void main(String[] args) {

boolean quiz=true; 
int score=66; 

if(quiz) {System.out.println("Lets check score");
if(score>90) {System.out.println("Great Job");}
else if(score>80) {System.out.println("well done");}
else if(score>70){System.out.println("do better");}
else{System.out.println("You failed");}}
else {System.out.println("Do HW ontime");}

boolean diploma=true;
double gpa=3.2;

if(diploma) {System.out.println("congratz");
if(gpa>=3.5) {System.out.println("scholarship");}
else{System.out.println("no scholarship");}}
else {System.out.println("get a degree");}

double mortageRate=3.7; 
double mortagePrice=1000000; 

if(mortageRate<4.5) {System.out.println("buy house");
if(mortagePrice>200000) {System.out.println("You will take loan");}
else{System.out.println("you will pay cash");}}
else{System.out.println("no house");}

if(mortageRate>4.5) {System.out.println("no house");}
else {System.out.println("buy house");
if(mortagePrice>200000) {System.out.println("you will loan");}
else {System.out.println("I pay cash");}}

	
	
	}
}
