package demoDatentypen;

public class DemoCasting {
	public static void main(String[] args) {

		//Implizites Casting
		/*
		 * Implizites Casting bezeichnet ein Casting, welches vom Compiler
		 * direkt ausgefuehrt werden kann. Implizites Casting ist ein verlustfreies
		 * Casting. Dies wird nur durchgefuehrt, wenn der Wertebereich erweitert wird.
		 * Fuer das implizite Casting wird keine direkte Anweisung benoetigt.
		 * 
		 * Wertebereich erweitern: Widening
		 */
//		byte -> short
		byte b1 = 5;
		short s1 = b1;
		
		//short -> int
		int i1 = s1;
		//byte -> int
		i1 = b1;
		
		int i4 = 5;
//		byte b2 = i4;
		//implizites Narrowing von Literalen
		/*
		 * Alle Literale sind sog. Kompilierzeitkonstanten
		 * daher kann der Compiler ueberpruefen, ob der Wert
		 * in ein byte passt
		 */
		byte b2 = 5;
		final int finInt = 5;
		b2 = finInt;
		
		//implizites Narrowing bei Compound Operatoren
		int erg = 0;
		long l2 = 10L;
		
		erg += l2;
		
		//Explizites Casting
		/*
		 * Explizites Casting ist immer dann noetig, wenn der Wertebereich 
		 * eingeschraenkt wird. 
		 * Damit eine Ganzzahl mit einem 8byte Wetrtebereich
		 * in eine Variable mit einem 4byte Wertebereich geschrieben werden kann,
		 * muss explizit gecastet werden.
		 * Dadurch werden die hoeheren Bits einfach abgeschnitten und es koennen
		 * unerwuenschte Nebeneffekte auftreten.
		 * 
		 * Wertebereich einschraenken: Narrowing
		 */
		//Beispiel ohne Seiteneffekt
		long l1 = 5000;
		int i2 = (int)l1;
		System.out.println("l1 : " + l1);
		System.out.println("i2 : " + i2);
		//Beispiel mit Seiteneffekt
		long l3 = 123_456_789_123_456_789L;
		int i3 = (int)l3;
		System.out.println("l2 : " + l3);
		System.out.println("i3 : " + i3);
	}
}
