package com.syntax.class17;

public class Employee {

	//create variables to hold: name, last name, title, ssn;
	public static String title;
	
	public String name;//accessible everywhere
	protected String lastName;//accessible within same package
	double salary;//accessible within same package
	private long ssn;//accessible ONLY within same class
	
	private static void  method1() {
		System.out.println("Private Method");
	}
	void method2() {
		System.out.println("Default Method");
	}
	protected void method3() {
		System.out.println("Protected Method");
	}
	public void method4() {
		System.out.println("Public Method");
	}
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="John";
		emp.lastName="Smith";
		emp.salary=90000;
		emp.ssn=9087735;
		//accessing all methods
		method1();
		emp.method2();
		emp.method3();
		emp.method4();
		
	}
}
