package ml.salastexido.utils;

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

    public int removeItemPos(int pos){
        if(pos>=size+1 || pos < 0){
            System.out.println("Invalid position .... " + pos);
        }else {
            for (int i = pos; i < size-1 ; i++) {
                array[i] = array[i + 1];
            }
        }
        array[size-1] = 0;
        size--;
        return pos;
    }
    
    public void Sort(int[] array, int n) {
		
		 if(n==1) {
			 return ;
		 }
		  for (int j = 0; j < array.length-1 ; j++) {
            if(array[j+1] < array[j]) {
                array[j] ^= array[j+1];
                array[j+1] ^= array[j];
                array[j] ^= array[j+1];
            }
        }
		  Sort(array,n-1);
	 }
    
    public int indexOf(int key) {
		int low = 0;
		int height = array.length-1;
		while(low <= height) {
			int middle = low+(height-low)/2;
			if(key<array[middle]) {
				height=middle-1;
			}else if(key>array[middle]) {
				low = middle+1;
			}else return middle;
		}
		return -1;
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
