package demoOperatoren;

public class DemoOperatoren {

	public static void main(String[] args) {
		int zahl1 = 5;
		int zahl2 = 10;
		
		int erg = zahl1 + zahl2;
		
		zahl1++;
		zahl1 = zahl1 + 1;
		
		zahl1--;
		zahl1 = zahl1 -1;
		
		//Post und Pre Inkrement
		/*
		 * Bei Pre Inkrement wird der Wert erst erhoeht und danach genutzt.
		 * Bei Post Inkrement wird der Wert erst genutzt und danach erhoeht.
		 */
		//Pre Inkrement
		System.out.println(++zahl1);
		
		//Post Inkrement
		System.out.println(zahl1++);
		System.out.println(zahl1);
		
		//Modulo
		System.out.println("10 Modulo 3 entspricht: " + (10 % 3));
		
		//Compound Operators
		int zahl = 0;
		zahl += 5;
		System.out.println(zahl);
		
	}
}
