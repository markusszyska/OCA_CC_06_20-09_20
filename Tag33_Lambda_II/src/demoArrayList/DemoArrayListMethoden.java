package demoArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayListMethoden {
	/*
	 * Die Default Initialkapazitae der ArrayList ist 10 Wenn ein Element
	 * hinzugefuegt wird und die Kapazitaet nicht ausreicht, wird sie um Faktor 1,5
	 * erhoeht.
	 */

	public static void main(String[] args) {
		ArrayList<Integer> arl = new ArrayList<>();
		// --------------------add()--------------
		/*
		 * die add() Methode fuegt ein Element an das Ende der Liste an
		 */
		for (int i = 0; i <= 10; i++) {
			arl.add(i);
		}
		System.out.println("arl hat die Groesse: " + arl.size());
		System.out.println("arl : " + arl);
		
		//---------------------add(int index)--------------
		/*
		 * Fuegt ein Element an dem angegebenen Index ein, alle anderen Elemente
		 * ruecken automatisch um eins nach hinten
		 */
		arl.add(2, 200);
		System.out.println("arl : " + arl);
		
		//---------------------addAll()--------------
		/*
		 * addAll fuegt die uebergebene Liste an das Ende der Liste ein.
		 */
		Integer[] zahlen = {new Integer(11),new Integer(22),new Integer(33)};
		arl.addAll(Arrays.asList(zahlen));
		
		ArrayList<Integer> arl2 = new ArrayList<>();
		arl2.addAll(arl);
		System.out.println(arl2);
		//---------------------addAll(int index)--------------
		/*
		 * addAll(int index) fuegt die Elemente vom uebergebenen index aufsteigend ein.
		 * Bestehende Elemente weriden nach hinten verschoben
		 */
		arl2.addAll(3, arl);
		System.out.println(arl2);
		
		//----------------------get()------------------
		/*
		 * get() gibt das Element an dem angegebenen Index zurueck
		 */
		Integer zahl;
		zahl = arl.get(5);
		
		//-----------------------set(int index)-----------------
		/*
		 * set() ueberschreibt das Element an dem angegebenen Index.
		 * Das ueberschriebene Element wird zurueckgegeben
		 */
		Integer zahl2 = arl.set(2, 5000);
		
		//-----------------------remove(int index)-----------------
		/*
		 * Entfernt das Element an dem angegebenen Index, das entfernte Element
		 * wird zurueckgegeben.
		 */
		Integer zahl3 = arl.remove(3);
		System.out.println(zahl3);
		System.out.println(arl.get(3));
				
		//-----------------------removeAll(Collection c)-----------------
		/*
		 * Entfernt alle Elemente, die in der uebergebenen Collection enthalten sind
		 */
		System.out.println(arl);
		arl.removeAll(Arrays.asList(10,11));
		System.out.println(arl);
		
		//-----------------------contains()-----------------
		//contains gibt einen boolean zurueck, ob das gesuchte Element enthalten ist
		boolean con = arl.contains(5);
		
		//-----------------------containsAll(Collection c)-----------------
		/*
		 * gibt true zurueck, wenn alle gesuchten Elemente enthalten sind,
		 * dabei spielt die Reihenfolge keine Rolle
		 */
		boolean con2 = arl.containsAll(Arrays.asList(3,4,5));
		
		//-----------------------indexOf()-----------------
		/*
		 * indexOf() gibt den ersten Index des gesuchten Elementes zurueck
		 */
		arl.add(6, 3);
		arl.add(8, 3);
		System.out.println(arl);
		System.out.println(arl.indexOf(3));		
		//-----------------------lastIndexOf()-----------------
		System.out.println(arl.lastIndexOf(3));
		
		//---------------------------clear()------------------
		arl.clear();
		System.out.println(arl);
		System.out.println(arl.size());
//		arl = null;
		
		arl.trimToSize();
		
		
	}

}
