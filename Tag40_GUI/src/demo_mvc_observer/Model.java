package demo_mvc_observer;

import java.util.Observable;

public class Model extends Observable{

	private int zahl;

	public int getZahl() {
		return zahl;
	}

	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
	
	public void countUp() {
		System.out.println("Up gedrueckt");
		this.setZahl(this.getZahl()+1);
		this.setChanged();
		this.notifyObservers(this.getZahl());
	}
	public void countDown() {
		System.out.println("Down gedrueckt");
		this.setZahl(this.getZahl()-1);
		this.setChanged();
		this.notifyObservers(this.getZahl());
	}
	
}
