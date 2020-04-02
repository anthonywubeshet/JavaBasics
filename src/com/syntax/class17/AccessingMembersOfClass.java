package com.syntax.class17;

public class AccessingMembersOfClass {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="Faisal";
		emp.lastName="Sakhi";
		emp.salary=100000;
		//emp.ssn=2343242;
		//field ssn is not visble
		
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4();
		//method4 not visible
		
	}

}
