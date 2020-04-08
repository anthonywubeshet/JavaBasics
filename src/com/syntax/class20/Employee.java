package com.syntax.class20;

public class Employee {

	public static String company;
	protected int empNum;
	double salary;
	private long ss;
	
	void getPaid() {
		System.out.println("Employee get "+ salary);
	}
	static void work() {
		System.out.println("Employee wort at "+ company);
	}
}
