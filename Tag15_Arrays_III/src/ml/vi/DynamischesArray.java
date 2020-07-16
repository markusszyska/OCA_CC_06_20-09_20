package ml.vi;

public class DynamischesArray {

	private int[] array;

	public DynamischesArray(int size) {
		array = new int[size];
	}

	public void setRandom() {

		if (array == null) {
			System.out.println("array is empty");
		} 
		else {
			for (int i = 0; i < array.length; i++) {
				array[i] = (int) (Math.random() * 100);
			}
		}
	}

	public void deleteElem() {
		
		if (array == null) {
			System.out.println("array is empty");
			return;
		}
		else {
			deleteElem(array.length-1);
		}
		
	}
	
	public void deleteElem(int index) {

		if (array == null) {
			System.out.println("array is empty");
			return;
		}
		else if (array.length <= index || index < 0) {
			System.out.println("invalid index");
		} 
		else if (array.length == 1) {
			array = null;
		} 
		else {
			int[] newArray = new int[array.length - 1];

			for (int i = 0, j = 0; i < newArray.length; i++, j++) {
				if (j == index) {
					j++;
				}
				newArray[i] = array[j];
			}
			array = newArray;
		}

	}

	public void addElem(int value) {
		
		if (array == null) {
			addElem(value, 0);
		}
		else {
			addElem(value, array.length);
		}
		
	}
	
	public void addElem(int value, int index) {

		if (array == null) {
			if(index == 0) {
				array = new int[1];
				array[0] = value;
			}
			else {
				System.out.println("invalid index");
			}
		} 
		else if (array.length < index || index < 0) {
			System.out.println("invalid index");
		}
		else {
			int[] newArray = new int[array.length + 1];

			for (int i = 0, j = 0; i < newArray.length; i++, j++) {
				if (i == index) {
					newArray[i] = value;
					j--;
				} 
				else {
					newArray[i] = array[j];
				}
			}
			array = newArray;
		}

	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public void printArray() {

		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public int length() {
		if (array == null) {
			return 0;
		}
		else {
			return array.length;
		}
	}

}
