package Interface;

public interface IObservable {

	void gewonnen(int trys);
	void notify_All(int i, int j); 
	void addObserver(IObserver ios);
}
