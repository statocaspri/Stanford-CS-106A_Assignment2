/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	
	private static final int Box_Width = 130;
	private static final int Box_Height = 65;
	
		public void run() {
			
			// coord of all four rectangles, where some of coordinates are the same, thats why there are not x3 y3 y4
			int x1 = getWidth()/2 - Box_Width/2;
			int y1 = getHeight()/2 - Box_Height*3/2;
			int x2 = getWidth()/2 - 2*Box_Width;
			int y2 = getHeight()/2 + Box_Height/2;
			int x4 = getWidth()/2 + Box_Width;
			
            // draw all four rectangles with method drawRect
			GRect rect1 = drawRect(x1,y1); 
			add(rect1);
			
			GRect rect2 = drawRect(x2,y2);
			add(rect2);
			
			GRect rect3 = drawRect(x1,y2);
			add(rect3);
			
			GRect rect4 = drawRect(x4,y2);
			add(rect4);
			
			
            //coord of all thre lines, where some of coordinates are the same, thats why there are not x3 y3 y4
			int xl1 = getWidth()/2;
			int yl1 = getHeight()/2 - Box_Height/2;
			int xl2 = getWidth()/2 -3*Box_Width/2;
			int yl2 = getHeight()/2 + Box_Height/2;
			int xl4 = getWidth()/2 + 3*Box_Width/2;
			
            //draw all thre lines 
			GLine l1 = new GLine (xl1,yl1, xl2,yl2);
			add(l1);
			
			GLine l2 = new GLine (xl1,yl1, xl1,yl2);
			add(l2);
			
			GLine l3 = new GLine (xl1,yl1, xl4,yl2);
			add(l3);

			
            // all four labels
			
			GLabel label1 = new GLabel ("Program",0,0); // the "Program" words, but in the wrong location
			double xt1 = getWidth()/2 - label1.getWidth()/2;
			double yt1 = getHeight()/2 - Box_Height/2 - (Box_Height - label1.getAscent())/2;
			label1.move (xt1,yt1); //moves the "Program" words in the appropriate location
			add(label1);
			
			GLabel label2 = new GLabel ("GraphicsProgram",0,0); // the "GraphicsProgram" words, but in the wrong location
			double xt2 = getWidth()/2 - 2*Box_Width + (Box_Width - label2.getWidth())/2;
			double yt2 = getHeight()/2 + 3*Box_Height/2 - (Box_Height - label2.getAscent())/2;
			label2.move (xt2,yt2); //moves the words in the appropriate location
			add(label2);
			
			GLabel label3 = new GLabel ("ConsoleProgram",0,0); // the "ConsoleProgram" words, but in the wrong location
			double xt3 = getWidth()/2 - label3.getWidth()/2; ;
			double yt3 = getHeight()/2 + 3*Box_Height/2 - (Box_Height - label3.getAscent())/2;
			label3.move (xt3,yt3); //moves the words in the appropriate location
			add(label3);
			
			GLabel label4 = new GLabel ("DialogProgram",0,0); // the "DialogProgram" words, but in the wrong location
			double xt4 = getWidth()/2 + Box_Width + ( Box_Width - label4.getWidth())/2; ;
			double yt4 = getHeight()/2 + 3*Box_Height/2 - (Box_Height - label4.getAscent())/2;
			label4.move (xt4,yt4); //moves the words in the appropriate location
			add(label4);
			
		}
		
            //draw all four rectangles with method drawRect
			private GRect drawRect (int x, int y){
				GRect rect = new GRect(x,y,Box_Width,Box_Height);
				return rect;
			}
			 
			
			
		
	}


