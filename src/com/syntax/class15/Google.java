package com.syntax.class15;

public class Google {
	
	//define features such as emp id, name, salary
	//define a behavior
	
	int empId;
	double salary;
	
	String name, lastName, title;
	
	void working() {
		System.out.println(title +" is working");
	}
	
	void getPaid() {
		System.out.println(name+" is getting paid "+salary);
	}
	void attendMeetings() {
		System.out.println(name+" attending meetings");
	}

	public static void main(String[] args) {
		
		Google emp1=new Google();
		emp1.empId=123;
		emp1.name="John";
		emp1.lastName="Smith";
		emp1.title="Ceo";
		emp1.salary=200000;
		
		emp1.working();
		emp1.attendMeetings();
		emp1.getPaid();
		
		Google emp2=new Google();
		emp2.empId=1234;
		emp2.name="Sam";
		emp2.lastName="Loius";
		emp2.title="Tester";
		emp2.salary=100000;
		
		emp2.working();
		emp2.attendMeetings();
		emp2.getPaid();
	}
}
