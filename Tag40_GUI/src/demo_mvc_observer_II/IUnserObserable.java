package demo_mvc_observer_II;

public interface IUnserObserable {
	void notifyAllObservers(Object o);
	void registerObserver(IUnserObserver observer);
}
