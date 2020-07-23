package demoAbstract;

public abstract class AAbstrakteZwischenklasse extends AAbstractParent {
//	@Override
//	public abstract void anAabstractMethodInAbstractParent();
	/*
	 * Eine konkrete Methode aus der abstrakten Elternklasse
	 * kann in einer abstrakten Kindklasse wieder abstrakt gemacht werden,
	 * muss dann aber in der naechsten konkreten Kindklasse ueberschrieben werden.
	 */
	public abstract void anNonAbstractMethodInAbstractParent();
}
