package ml.Liebermann;

public class DynamischesArray {
	static int[] arr = new int[0];

	public static void main(String[] args) {
		arr = new int[] { 2, 23, 4, 5, 6 };
		addElement(1337, 1);
		addElement(2);
		arrAusgeben(arr);
		delElement(1);
		arrAusgeben(arr);
	}

	public static void addElement(int element) {
		int[] newArr = new int[arr.length + 1]; // Neues Array mit laenge + 1
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i]; // 1-1 Kopie vom alten Array
		}
		newArr[arr.length] = element; // an letzter stelle die zahl add einfuegen.

		arr = newArr;
	}

	public static void delElement() {
		int[] newArr = new int[arr.length - 1]; // Neues Array mit laenge + 1
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i]; // 1-1 Kopie vom alten Array
		}
		arr = newArr;
	}

	public static void addElement(int element, int index) {
		int[] newArr = new int[arr.length + 1]; // Neues Array mit laenge + 1
		
		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}
		newArr[index] = element;
		for (int i = index; i < arr.length; i++) {
			newArr[i+1] = arr[i];
		}
		
	
		arr = newArr;

	}
	public static void delElement(int index) {
		int[] newArr = new int[arr.length - 1]; // Neues Array mit laenge + 1
		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}
		for (int i = index +1; i < arr.length; i++) {
			newArr[i -1] = arr[i];
		}
		arr = newArr;
	}

	public static void arrAusgeben(int[] arr) {
		System.out.println("-------------");
		for (int p1 : arr) {
			System.out.print(p1 + " ");
		}
		System.out.println("-------------");
	}

}
