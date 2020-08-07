package zeitner.observerdemo.data;

import zeitner.observerdemo.label.IObserver;

public interface IObservable {

	public void addObserver(IObserver observer);

	public void removeObserver(IObserver observer);

	public void notifyAllObserver();

}
