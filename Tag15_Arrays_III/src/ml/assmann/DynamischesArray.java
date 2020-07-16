package ml.assmann;

public class DynamischesArray {
	
	/*
	 *  Attribute
	 */
	private int[] intArrayAttr;
	
	/*
	 * Getter/Setter
	 */
	private void setIntArrayAttr(int[] intArrayAttr) {
		this.intArrayAttr = intArrayAttr;
	}
	
	public int[] getintArrayAttr() {
		return intArrayAttr;
	}
	
	public int getLength() {
		return this.getintArrayAttr().length;
	}
	
	/*
	 * Konstruktor
	 */
	public DynamischesArray(int[] intArrayAttr) {
		this.intArrayAttr = intArrayAttr;
	}

	/*
	 * Methoden
	 */
	
	// Entfernt letztes Element
	public void removeLast() {
		
		if(this.getLength()<1) {
			System.out.println("Dieses Array ist zu kurz.");
			return;
		}
		
		// Erstelle neues Array das eines kuerzer ist
		int[] shorterArray = new int[this.getLength()-1];
		
		// Kopiere vorhandenes Array hinein (ohne letztes Element)
		for(int i = 0; i<shorterArray.length;i++) {
			shorterArray[i] = this.getintArrayAttr()[i];
		}
		
		// Setze Attribut auf neues Array
		this.setIntArrayAttr(shorterArray);
	}

	
	// Fuegt Element addEle am Ende an
	public void addLast(int addEle) {
		
		// Erstelle neues Array das eines laenger ist
		int[] longerArray = new int[this.getLength()+1];
		
		// Kopiere vorhandenes Array hinein
		for(int i = 0; i<this.getLength();i++) {
			longerArray[i] = this.getintArrayAttr()[i];
		}
		
		// Setze neues Element am Ende ein
		longerArray[longerArray.length-1] = addEle;
		
		// Setze Attribut auf neues Array
		this.setIntArrayAttr(longerArray);
	}

	
	// Fuegt Element addEle and Stelle position ein
	public void addAt(int addEle, int position) {
		if(position < 1) {
			System.out.println("\nPosition muss positiv sein");
			return;
		}
		if(position >= this.getLength()) {
			System.out.println("\nPosition zu gross, Element wird am Ende eingefuegt.");
			this.addLast(addEle);
			return;
		}
		
		// Erstelle neues Array das eines laenger ist
		int[] longerArray = new int[this.getLength()+1];
		int i = 0;
		for(; i<position-1;i++) {
			longerArray[i] = this.getintArrayAttr()[i];
		}
		longerArray[i++] = addEle;
		for(; i<longerArray.length;i++) {
			longerArray[i] = this.getintArrayAttr()[i-1];
		}
		
		// Setze Attribut auf neues Array
		this.setIntArrayAttr(longerArray);
	}
	
	// toString()
	public String toString() {
		String output = "";
		for(int zahl : this.getintArrayAttr()) output += zahl + " ";
		return output;
	}
}
