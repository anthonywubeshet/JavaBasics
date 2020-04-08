package com.syntax.class20_1;

import com.syntax.class20.Employee;

public class WaterfallTeam extends Employee  {

	public static void main(String[] args) {
		
		WaterfallTeam wteam=new WaterfallTeam();
		WaterfallTeam.company="Syntax";
		wteam.empNum=124;//protected variable in different package
		//wteam.salary // defaul is not visible
	}

}
