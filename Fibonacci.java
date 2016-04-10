/*
* File: Fibonacci.java
* --------------------
* This program lists the terms in the Fibonacci sequence up to
* a constant MAX_TERM_VALUE, which is the largest Fibonacci term
* the program will display.
*/

import acm.program.*;


public class Fibonacci extends ConsoleProgram { 
	
	private static final int MAX_TERM_VALUE = 10000; //Defines the largest term to be displayed
	
	public void run () {
		
		println("This program lists the Fibonacii sequence.");
		int f0 = 0;
		int f1 = 1;
		
		while (f0 < MAX_TERM_VALUE) {
			println(+f0);
			int f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
		}

				
	}			
		

}
