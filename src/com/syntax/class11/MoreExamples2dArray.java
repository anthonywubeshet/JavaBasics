package com.syntax.class11;

public class MoreExamples2dArray {

	public static void main(String[] args) {
		
		String [][] jobs= {
				{"Tester","Dev","PO","Scrum Master"},
				{"Math teach","Science","Esl teach"},
				{"Dentist","Surgeon"}
		};
		
		for(String[] prof :jobs) {
			for(String title:prof) {
				System.out.print(title+" ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
