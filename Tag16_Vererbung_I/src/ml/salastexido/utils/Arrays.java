package ml.salastexido.utils;

import ml.salastexido.farm.Animal;

public class Arrays {
	
	public int indexOf(Animal[] array,int key) {
		int low = 0;
		int height = array.length-1;
		while(low <= height) {
			int middle = low+(height-low)/2;
			if(key<array[middle].getId()) {
				height=middle-1;
			}else if(key>array[middle].getId()) {
				low = middle+1;
			}else return middle;
		}
		return -1;
	}
	
	
}
