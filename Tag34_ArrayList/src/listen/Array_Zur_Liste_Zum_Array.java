package listen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_Zur_Liste_Zum_Array {

	public static void main(String[] args) {

		System.out.println("--------------Arrays.asList()---------------");

		String[] arr = { "mo", "di", "mi" };
		/*
		 * This method also provides a convenient way to create a fixed-size list
		 * initialized to contain several elements: Die Liste wird vom Objekttyp der
		 * privaten inneren Klasse ArrayList in der Klasse Arrays erstellt. Diese innere
		 * Klasse hat keine add() Methode. Darum erzeugt ein Benutzen der Methode add()
		 * eine java.lang.UnsupportedOperationException
		 */
		List<String> list = Arrays.asList(arr);
		System.out.println("list: " + list);

		/*
		 * Eine Aenderung am Array aendert auch den Wert in der Liste, da beide das
		 * selbe Array referenzieren
		 */
		arr[0] = "Montag";
		System.out.println("arr[0]: " + arr[0]);
		System.out.println("list.get(0): " + list.get(0));

//		list.add("do");//java.lang.UnsupportedOperationException
		/*
		 * Die Groesse ist nicht mehr veraenderbar, aber Zugriff auf die Elemente ist
		 * weiterhin moeglich
		 */
		list.set(0, "Freitag");
		System.out.println("arr[0]: " + arr[0]);
		System.out.println("list.get(0): " + list.get(0));

		/*
		 * Hier wird ein neues ArrayList Objekt erzeugt als Kopie. Die Groesse ist dann
		 * wieder veraenderbar.
		 */
		List<String> list2 = new ArrayList<>(list);
		System.out.println("list: " + list2);
		list2.add("do");
		System.out.println("list: " + list2);
		/*
		 * Es kann dem Konstruktor auch gleich Arrays.asList() uebergeben werden
		 */
		List<String> list3 = new ArrayList<>(Arrays.asList("mo"));

		System.out.println("-----------------toArray()-------------------");

		/*
		 * Returns an array containing all of the elements in this list in proper
		 * sequence (from first to last element).
		 * 
		 * The returned array will be "safe" in that no references to it are maintained
		 * by this list. (In other words, this method must allocate a new array even if
		 * this list is backed by an array).The caller is thus free to modify the
		 * returned array.
		 * 
		 * This method acts as bridge between array-based and collection-basedAPIs.
		 * 
		 */
		Object[] objArr = list2.toArray();

		for (int i = 0; i < objArr.length; i++) {
			String s = (String) objArr[i];
			System.out.println(s);
		}
		System.out.println("objArr.length " + objArr.length);
		list2.set(0, "mo");
		String s = (String) objArr[0];
		System.out.println("objArr[0]: " + s);
		System.out.println("list2.get(0): " + list2.get(0));

		/*
		 * Returns an array containing all of the elements in this list inproper
		 * sequence (from first to last element); the runtime type ofthe returned array
		 * is that of the specified array. If the list fits in the specified array, it is
		 * returned therein. Otherwise, a newarray is allocated with the runtime type of
		 * the specified array and the size of this list.
		 */
		String[] strArr = list2.toArray(new String[0]);
		for (String s1 : strArr) {
			System.out.println(s1);
		}

		List<Kuh> kuehe = new ArrayList<Kuh>(Arrays.asList(new Kuh(), new Kuh()));
		Kuh[] kuhArr = kuehe.toArray(new Kuh[0]); 
		//Hier kann eine Exception auftreten, wenn in der Liste keine Kalb Objekte sind
//		Kalb[] kuhArr2 = kuehe.toArray(new Kalb[0]); 
		
	}

}

class Kuh{}
class Kalb extends Kuh{}
