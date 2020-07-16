package ml.assmann;

public class DynamischesArrayMain {
	public static void main(String[] args) {
		int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		DynamischesArray dynArray1 = new DynamischesArray(testArray);
		
		System.out.println("Array:\n\t" + dynArray1.toString());
		
		dynArray1.removeLast();
		
		System.out.println("\nArray nach Loeschen:\n\t" + dynArray1.toString());
		
		dynArray1.addLast(50);
		
		System.out.println("\nArray nach hinzufuegen von 50 an letzter Stelle:\n\t" + dynArray1.toString());
		
		int stelle = 9;
		int ele = 66;
		dynArray1.addAt(ele, stelle);
		
		System.out.println("\nArray nach hinzufuegen von " + ele + " an "+ stelle + ". Stelle:\n\t" + dynArray1.toString());
		
		stelle = 1;
		ele = 33;
		dynArray1.addAt(ele, stelle);
		
		System.out.println("\nArray nach hinzufuegen von 33 an "+ stelle + ". Stelle:\n\t" + dynArray1.toString());
		
		System.out.println("\n\nArray ist nun " + dynArray1.getLength() + " lang.");
		dynArray1.removeLast();
		dynArray1.removeLast();
		dynArray1.removeLast();
		dynArray1.removeLast();
		dynArray1.removeLast();
		dynArray1.removeLast();
		System.out.println("Nach 6 Mal Loeschen: " + dynArray1.toString() + "Laenge: " + dynArray1.getLength());
		dynArray1.removeLast();
		dynArray1.removeLast();
		dynArray1.removeLast();
		dynArray1.removeLast();
		dynArray1.removeLast();
		dynArray1.removeLast();
		dynArray1.removeLast();
		dynArray1.removeLast();
		System.out.println("Nach weiteren 8 Mal loeschen.");
	}
}
