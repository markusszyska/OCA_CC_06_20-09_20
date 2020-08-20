package demo_mvc_observer_II;

import java.util.ArrayList;
import java.util.List;

public class Model implements IUnserObserable{

	private int zahl;
	private List<IUnserObserver> observerList;
	
	public Model() {
		this.setObserverList(new ArrayList<IUnserObserver>());
	}
		
	public int getZahl() {
		return zahl;
	}

	public void setZahl(int zahl) {
		this.zahl = zahl;
	}

	public List<IUnserObserver> getObserverList() {
		return observerList;
	}
	public void setObserverList(List<IUnserObserver> observerList) {
		this.observerList = observerList;
	}

	public void countUp() {
		System.out.println("Up gedrueckt");
		this.setZahl(this.getZahl()+1);
		this.notifyAllObservers(this.getZahl());
	}
	public void countDown() {
		System.out.println("Down gedrueckt");
		this.setZahl(this.getZahl()-1);
		this.notifyAllObservers(this.getZahl());
	}

	@Override
	public void notifyAllObservers(Object o) {
		for(IUnserObserver observer : this.getObserverList()) {
			observer.update(this, o);
		}		
	}
	@Override
	public void registerObserver(IUnserObserver observer) {
		this.getObserverList().add(observer);
	}
	
}
