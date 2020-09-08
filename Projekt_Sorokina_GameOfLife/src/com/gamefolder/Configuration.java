package com.gamefolder;

import java.awt.Color;

public class Configuration {

	public static final int SIZE = 10; // size of ONE cell;
	public static final int WIDTH = 80; // size of area width
	public static final int HEIGHT = 60;// size of area height
	public static final int SLEEPMS = 200; // in milliseconds( frames)
	
	public static Color getColor( Status status) {//  colors to status
		 switch (status) {
		case NONE: return Color.BLACK;
			
		case BORN: return Color.BLACK;
			
		case LIVE: return Color.GREEN;
			
		case DIED:	return Color.BLACK;
			
		default: return null;

		
		}
		
		
		
	}
	
}
