package com.syntax.class06;

public class HW1 {

	public static void main(String[] args) {
		
		String month="January";
		String season;
		
		if(month.equals("January") || month.equals("February") || month.equals("December")) 
		{season="Winter";}
		else if(month.equals("Sept") || month.equals("Oct") || month.equals("Nov"))
{season="Autumn";}
		else {season="invalid";}
		
		System.out.println("You were born in " + season + ".");
	}

}
