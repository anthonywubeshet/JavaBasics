package com.syntax.class17_1;

import com.syntax.class17.Employee;

public class AccessingMembersOfDifferentClass {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		Employee.title="QA engineer";
		emp.name="Ahmet";
		//emp.lastName-->protected
		//emp.salary-->default
		//emp.ssn-->private
		
		Employee.method1();
		emp.method1();//not preferable
		//emp.method2();-->protected
		//emp.method3();-->default
		//emp.method4();-->private
		
	}
}
