package ml.vi;

public class DynamischesArrayMain {

	public static void main(String[] args) {

		DynamischesArray dArray = new DynamischesArray(10);
		
		dArray.printArray();
		System.out.println();
		dArray.setRandom();
		

		int index = 5;
		int value = 5000;
		System.out.print("d Array vor delete vom index "+index+": ");
		dArray.printArray();
		System.out.println("Länge des d Arrays vor delete: "+dArray.length());
		System.out.println();
		dArray.deleteElem(index);
		System.out.print("d Array nach delete vom index "+index+": ");
		dArray.printArray();
		System.out.println("Länge des d Arrays nach delete: "+dArray.length());
		System.out.println("------------------------");
		System.out.print("d Array vor delete vom letzten Element: ");
		dArray.printArray();
		System.out.println("Länge des d Arrays vor delete: "+dArray.length());
		System.out.println();
		dArray.deleteElem();
		System.out.print("d Array nach delete vom letzten Element: ");
		dArray.printArray();
		System.out.println("Länge des d Arrays nach delete: "+dArray.length());
		System.out.println("------------------------");
		System.out.print("d Array vor add vom index "+index+": ");
		dArray.printArray();
		System.out.println("Länge des d Arrays vor add: "+dArray.length());
		System.out.println();
		dArray.addElem(value, index);
		System.out.print("d Array nach add vom index "+index+": ");
		dArray.printArray();
		System.out.println("Länge des d Arrays nach delete: "+dArray.length());
		System.out.println("------------------------");
		System.out.print("d Array vor add am Ende: ");
		dArray.printArray();
		System.out.println("Länge des d Arrays vor add: "+dArray.length());
		System.out.println();
		dArray.addElem(value+55);
		System.out.print("d Array nach add am Ende: ");
		dArray.printArray();
		System.out.println("Länge des d Arrays nach add: "+dArray.length());
		System.out.println("------------------------");
		
		
	}

}
