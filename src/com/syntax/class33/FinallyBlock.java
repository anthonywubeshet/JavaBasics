package com.syntax.class33;

import java.io.FileInputStream;

public class FinallyBlock {

	public static void main(String[] args) {
		
String file=System.getProperty("user.dir")+"\\configs\\Examples.propertie";
		
		try {
			FileInputStream fis= new FileInputStream(file);
		}catch(Exception e) {
			System.out.println("I am a catch block");
		}finally {
			System.out.println("I am a finally block");
		}

	}

}
