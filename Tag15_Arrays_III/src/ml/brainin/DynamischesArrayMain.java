package ml.brainin;
/*
 * Erstellen Sie eine Klasse DynamischesArray, die als Attribut ein Array des Typs int hat.
Sie soll Methoden bereit stellen, die es ermöglichen ein Element am Ende zu entfernen
oder hinzuzufügen. Zusatzlich soll sie Methoden bieten, um ein Element an einer beliebigen
Position im Array hinzuzufügen oder zu entfernen.
Erstellen Sie eine Klasse DynamischesArrayMain mit einer main methode um ihre Klasse
DynamischesArray zu testen.  
 */

class DynamischesArray {
	int[] zahlen;
	int randomEnd;
	DynamischesArray(int arrayLenght, int randomEnd) {
		this.randomEnd = randomEnd;
		System.out.println("Array-Länge : "+arrayLenght);
		zahlen = new int[arrayLenght];
		for  (int i = 0; i < zahlen.length ; i++) {
			zahlen[i] = (int)(Math.random() * randomEnd +1);
		}
	}
	void go(boolean isRemoveElement, int index) {
		int newLenght = isRemoveElement? zahlen.length-1: zahlen.length+1;
		System.out.println("Ein Element wird an " + 
				"Position "+index+" im Array "+(!isRemoveElement?"hinzuzufügen":"entfernen")+
				"\nNeue Array-Länge : "+newLenght);
		int[] tmp = new int[newLenght];
		if (!isRemoveElement) {
			tmp[index] =  (int)(Math.random() * randomEnd +1);;
		}
		int i = 0;
		for(; i <tmp.length; i++) {
			if (i < index) {
				tmp[i] = zahlen[i];
			}else {
				if (isRemoveElement) {
					tmp[i] = zahlen[i+1];
				}else {
					if (i != index) {
						tmp[i] = zahlen[i-1];
					}
				}
			}
		}
		zahlen = tmp;
	}
	void printArray() {
		for  (int i = 0; i < zahlen.length ; i++) {
			System.out.print("zahlen["+i+"]="+zahlen[i]+(i < zahlen.length-1? ", ":""));
		}
		System.out.println();
	}
	int getArrayLenght() {
		return zahlen.length - 1;
	}
}

public class DynamischesArrayMain {
	final static int arrayLeght = 5;
	final static int totalTestCycles = 5;
	final static int ramdomEnd = 50;
	
	
	public static void main(String[] args) {
		DynamischesArray dynamischesArray = new DynamischesArray(arrayLeght, ramdomEnd); 
		System.out.println("Die generierte Zahlen : ");
		dynamischesArray.printArray();
		System.out.println("--------------------");
		for (int i = 0; i < totalTestCycles; i++) {
			System.out.println("Zyklusnummer "+(i+1));
			int index = (int)(Math.random() * dynamischesArray.getArrayLenght()+1);
			boolean isRemoveElement = index %2 == 0;
			index --; 
			dynamischesArray.go(isRemoveElement, index);
			System.out.println("Geändertes Array :");
			dynamischesArray.printArray();
			System.out.println("---------------");
		}
	}
}
