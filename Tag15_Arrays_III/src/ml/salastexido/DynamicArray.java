package ml.salastexido;

public class DynamicArray {

	private int [] array; //array attribute
	private int maxSize; //default size
	private int size; //current size
	

    public DynamicArray(){
    	array = new int[1];
        size=0;
        maxSize=1;        
    }

    public void addItemEnd(int item) {
    	 if(size==maxSize) {
         	increaseSpace(2);
         } 
    	 array[size]=item;
    	 size++;
    	 
    }
    
    public void addItemPos(int item, int pos){
    	if(size==maxSize) {
        	increaseSpace(2);
        }
        for (int i = size-1;i>=pos;i--) {
            array[i+1] = array[i];
        }
        array[pos] = item;
        size++;
    }
    
    public void increaseSpace(int l) {
    	int[] tempArray =  new int[maxSize*l];
    	for(int i=0;i<maxSize;i++) {
    		tempArray[i] = array[i];
    	}
    	maxSize = maxSize*l;
    	array=tempArray;
    }

    public int[] removeItemPos(int pos){
        if(pos>=size+1 || pos < 0){
            System.out.println("Invalid position .... " + pos);
        }else {
            for (int i = pos; i < size-1 ; i++) {
                array[i] = array[i + 1];
            }
        }
        array[size-1] = 0;
        size--;
        return array;
    }

    public int getElementArray(int pos) {
    	return array[pos];
    }

    public void showArray(){
        for (int element: array) { System.out.print(" " +element); }
        System.out.println();
    }

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
    
    
}
