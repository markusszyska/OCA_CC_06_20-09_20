package zeitner.observerdemo.data;

import java.util.ArrayList;

import zeitner.observerdemo.label.IObserver;

public class ObservableData implements IObservableData {
	
	private String value;
	
	private ArrayList<IObserver> observerList = new ArrayList<IObserver>();

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		if (this.value == value) {
			System.out.println("ObservableData : Werte sind gleich! Niemand wird benachrigtigt!");
		} else {
			System.out.println("ObservableData : Schreibe Wert ...");
			this.value = value;
			System.out.println("ObservableData : Benachrichtige Observer ...");
			this.notifyAllObserver();
		}
	}
	
	public ObservableData(String value) {
		this.value = value;

	}
	public ObservableData() {
	}
	@Override
	public String toString() {
		return this.getValue();
	}

	@Override
	public void addObserver(IObserver observer) {
		this.observerList.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		this.observerList.remove(observer);
	}

	@Override
	public void notifyAllObserver() {
		if (observerList.size() > 0) {
			for (IObserver observer: observerList) {
				System.out.println("ObservableData : benachrichtige " + observer.getClass());
				observer.update();
				System.out.println("ObservableData : " + observer.getClass() + " benachrichtigt");
			}
		} else {
			System.out.println("Data : Keine Observer zu benachrichtigen ...");
		}
	}
	
}
