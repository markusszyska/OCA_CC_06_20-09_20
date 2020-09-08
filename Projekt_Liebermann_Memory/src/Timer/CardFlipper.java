package Timer;

import java.awt.Point;
import java.util.Timer;
import java.util.TimerTask;

import controller.Controller;
import gui.cards.Card;

public class CardFlipper extends Timer {
	Controller c;
	Point c1, c2;
	boolean swap = false;
	public CardFlipper(Controller c) {
		this.schedule(task, 1500, 1000);
		this.c = c;
	}
	
	public void toSwap(Point c1, Point c2) {
		this.setC1(c1);
		this.setC2(c2);
		this.setSwap(true);
	}
	
	
	
	TimerTask task = new TimerTask() {
		
		@Override
		public void run() {
			if(swap) {
				swap = false;
				c.update((int)c1.getX(),(int)c1.getY());
				c.update((int)c2.getX(),(int)c2.getY());
			}
		}
	};
	public Controller getC() {
		return c;
	}





	public void setC(Controller c) {
		this.c = c;
	}










	public Point getC1() {
		return c1;
	}

	public void setC1(Point c1) {
		this.c1 = c1;
	}

	public Point getC2() {
		return c2;
	}

	public void setC2(Point c2) {
		this.c2 = c2;
	}

	public boolean isSwap() {
		return swap;
	}





	public void setSwap(boolean swap) {
		this.swap = swap;
	}
	
}
