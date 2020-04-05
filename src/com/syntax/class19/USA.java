package com.syntax.class19;

public class USA {
	
	String state, cap;
	
	public USA(String state, String cap) {
		this.state=state;
		this.cap=cap;
	}
	
	public void displayState() {
		System.out.println(state);
	}
	public void displayCap() {
		System.out.println(cap);
	}
	
	public void displayInfo() {
		
		displayState();
		displayCap();
	}
	
	public static void main(String[] args) {
		
		USA state=new USA("Va","Richmond");
		state.displayInfo();
	}

}
