package ml.salastexido;

import java.util.Scanner;

public class BubbleSort {

	 private static int[] bubbleSort(int[] array)  {
	        for (int i = 0; i < array.length ; i++) {
	            for (int j = 0; j < array.length-1 ; j++) {
	                if(array[j] > array[i]) {
	                    array[i] ^= array[j];
	                    array[j] ^= array[i];
	                    array[i] ^= array[j];
	                }
	            }
	        }
	        return array;
	 }
	 
	 private static void showArray(int[] array){
	        for (int element:array) { System.out.print(" " +element); }
	        System.out.println();
	    }
	 
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int size = scanner.nextInt();
		 int[] array  = new int[size];
		 for(int i=0;i<size;i++) {
			 array[i]= scanner.nextInt();
		 }
		 showArray(array);
		 System.out.println("Array sorted with BubbleSort");
		 showArray(bubbleSort(array));
		 scanner.close();	 
	 }
	 
}
