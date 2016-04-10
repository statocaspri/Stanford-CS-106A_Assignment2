

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class Target2 extends GraphicsProgram {	
	
	// radius of the first circle 
	private static final double r1 = 1;

    //radius of the second circle
	private static final double r2= 0.65;

    // radius of the third circle 
	private static final double r3 = 0.3;
	
	public void run() {
		double x1 = getWidth()/2 - r1*72;
		double y1 = getHeight()/2 - r1*72;
		double R1 = r1*72;
		double x2 = getWidth()/2 - r2*72;
		double y2 = getHeight()/2 - r2*72;
		double R2 = r2*72;
		double x3 = getWidth()/2 - r3*72;
		double y3 = getHeight()/2 - r3*72;
		double R3 = r3*72;
		
		GOval circle1= createFilledCircle (x1,y1,R1,Color.RED);
		add(circle1);
		
		GOval circle2= createFilledCircle (x2,y2,R2,Color.WHITE);
		add(circle2);
		
		GOval circle3= createFilledCircle (x3,y3,R3,Color.RED);
		add(circle3);
		
	}
		
		private GOval createFilledCircle (double x, double y, double R, Color color) {
			GOval circle = new GOval (x,y,2*R, 2*R);
			circle.setFilled(true);
			circle.setColor(color);
			return circle;
		}


		

	}
