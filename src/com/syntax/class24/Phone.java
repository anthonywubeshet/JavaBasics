package com.syntax.class24;

public abstract class Phone {
	
	//implemented methods 
	public void call() {
		System.out.println("Phone can make a call");
	}
	
	public void text() {
		System.out.println("Phone can send text");
	}
	
	//unimplemented methods= undefined methods=abstract methods 
	public abstract void takePic();
	
	public abstract void playMusic();

}

class iPhone extends Phone{

	@Override
	public void takePic() {
		System.out.println("iPhone takes pictures");
		
	}

	@Override
	public void playMusic() {
		System.out.println("iPhone play music");
		
	}
	
}

class Samsung extends Phone{

	@Override
	public void takePic() {
		System.out.println("Samsung takes pictures");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung plays music");
		
	}
	
}