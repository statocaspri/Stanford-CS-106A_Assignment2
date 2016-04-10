/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		
		double x0 = getWidth()/2 - (BRICK_WIDTH * BRICKS_IN_BASE)/2; // start x coordinate for the first brick at the bottom
		double y0 = getHeight() - BRICK_HEIGHT ;                     // start y coordinate for the first brick at the bottom
		
		for (int j = 0; j < BRICKS_IN_BASE; j++) {
			double y = y0 - BRICK_HEIGHT *j;
			int numOfBricks = BRICKS_IN_BASE - j;   // num of bricks in each row
			for (int i = 0; i < numOfBricks; i++) {
				double x = x0 + BRICK_WIDTH * i + (j*BRICK_WIDTH)/2;    // formula for the x coordinates
				GRect brick = new GRect (x,y,BRICK_WIDTH,BRICK_HEIGHT); // draw the bricks
				add(brick);
			}
		}
	}
}
	

