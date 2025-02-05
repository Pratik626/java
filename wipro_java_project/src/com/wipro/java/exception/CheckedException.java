package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//checked at compile-time
public class CheckedException {
	
	public static void main(String[] args) {
		
		try {
			File file = new File("wrong path");
			FileReader reader = new FileReader(file);
		}
		catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
	}

}
