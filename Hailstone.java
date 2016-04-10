/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	
	public void run() {
		
		int x = 0; // number of steps
		int y = 0; // number of steps
		int n = readInt ("Enter a number: ");
		
		while(n!=1) {
			if(n%2==0) { // if the remainder is 0 then number is even
				println(n+ " is even, so i take half: " +(n/2));
				n/=2;
				x++; // counts the number of steps in if loop
				
				} else {
				println(n+ " is odd, so i make 3n+1: " +(3*n+1));
				n = 3*n + 1;
				y++; // counts the number of steps in else loop (i could name this also x as above in if loop, it would bee the same result)
			}
		}
		println("The process took " +(x+y)+ " to reach 1");
  }
}

