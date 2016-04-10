/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	// SENTINEL SAFETY
	private static final int SENTINEL = 0;
	
	public void run() {
		
		println("This program finds the largest and smallest numbers.");
		
		int number = readInt("? ");

		if (number == SENTINEL) {
			println("Invalid input. Please try again!");
		} else {
			int smallest = number; // we assign to int smallest the value of input number, in this case its the smallest value
			int largest = number; // we assign to int largest the value of input number, in this case its the largets value also 
			while (true) {
				number = readInt("? ");
				if (number == SENTINEL) break;  // if break then it get out from loop and print smallest and largest
				if (smallest > number){
					smallest = number;
				}else if (largest < number){
					largest = number;
			     } 
			}
			println("smallest: " + smallest);
			println("largest: " + largest);
		}	
	}
}

		

		

		
		





