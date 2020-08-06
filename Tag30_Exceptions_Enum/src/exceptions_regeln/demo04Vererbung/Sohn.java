package exceptions_regeln.demo04Vererbung;

import java.io.IOException;

public class Sohn extends Vater {

	/*
	 * In der Vererbung duerfen keine neuen checked Exceptions in einer
	 * ueberschriebenen Methode hinzugefuegt werden
	 */
//	public void except01() throws Exception{}

	/*
	 * Es duerfen neue unchecked Exceptions hinzugefuegt werden
	 */
	public void except01() throws RuntimeException {
	}

	/*
	 * In der Vererbung muessen wir die in der Oberklasse deklarierten checked
	 * Exceptions nicht weiterfuehren wenn die Methode der Elternklasse nicht mit
	 * einbezogen wird.
	 */
//	public void except02() {
//		
//	}
	public void except02() throws Exception {
		super.except02();
	}

	// Wir duerfen die Exception nicht verallgemeinern
//	public void except03()throws Exception{}

	/*
	 * Die ueberschriebene Methode darf speziellere Exceptions deklarieren
	 */
//	public void except03() throws ClassNotFoundException{}

	/*
	 * Die Anzahl der Exceptions darf nicht erhoeht werden, wenn die hinzugefuegte
	 * Exception auf einem anderen Vererbungsast liegt
	 */
//	public void except03() throws ReflectiveOperationException, IOException{}
	/*
	 * Die Anzahl der checked Exceptions darf nicht erhoeht werden, es sei denn, die
	 * hinzugefuegte Exception ist von der abgeleitet, die in der Elternklasse
	 * deklariert ist.
	 */
	public void except03() throws ReflectiveOperationException, ClassNotFoundException {
	}

	/*
	 * Bei unchecked Exceptions gelten die Regeln bezueglich spezialisieren,
	 * verallgemeinern oder "new" nicht
	 */
//	public void runExcept01() throws ArrayStoreException {}
	/*
	 * Die Methoden koennen auch jederzeit neue RuntimeExceptions hinzufuegen
	 */
//	public void runExcept01() throws ArrayStoreException, RuntimeException {}

	public static void main(String[] args) {
		Vater v = null;
		try {
			v = new Sohn();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		v.except01();

		try {
			v.except02();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Sohn s = new Sohn();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		s.except02();
	}

	/*
	 * Default constructor cannot handle exception type Exception thrown by implicit
	 * super constructor. Must define an explicit constructor
	 * 
	 * super() muss als erstes stehen, darum darf kein try davor sein
	 * also muss der Kind Konstruktor auch deklarieren
	 */
	public Sohn() throws Exception {
//		try{
//		super();
//		}catch(Exception e){}
	}
}
