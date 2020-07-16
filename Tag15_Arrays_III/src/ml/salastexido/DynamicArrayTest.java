package ml.salastexido;

public class DynamicArrayTest {
	public static void main(String[] args) {
		DynamicArray array = new DynamicArray();
		System.out.println("Size :"+array.getSize()+" and Capacity :"+array.getMaxSize());
		array.addItemEnd(1);
		array.addItemEnd(2);
		array.addItemEnd(4);
		array.addItemEnd(6);
		array.addItemEnd(4);
		array.addItemEnd(4);
		array.addItemEnd(4);
		array.addItemEnd(4);
		array.addItemEnd(4);
		array.addItemEnd(4);
		array.addItemEnd(4);
		array.addItemEnd(4);
		System.out.println("Size :"+array.getSize()+" and Capacity :"+array.getMaxSize());
		array.addItemPos(19, 0);
		array.addItemPos(200,4);
		System.out.println("Size :"+array.getSize()+" and Capacity :"+array.getMaxSize());
		array.removeItemPos(4);
		array.showArray();
		
	
	}
	
}
