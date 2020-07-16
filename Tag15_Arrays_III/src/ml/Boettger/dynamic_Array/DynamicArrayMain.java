/*
Erstellen Sie eine Klasse DynamischesArray, die als Attribut ein Array des Typs
int hat.

Sie soll Methoden bereitstellen, die es ermöglichen ein Element am Ende zu
entfernen oder hinzuzufuegen. 

Zusatzlich soll sie Methoden bieten, um ein Element an einer beliebigen
Position im Array hinzuzufuegen oder zu entfernen.

Erstellen Sie eine Klasse DynamischesArrayMain mit einer main methode um ihre
Klasse DynamischesArray zu testen. 
 */

package ml.Boettger.dynamic_Array;


public class DynamicArrayMain 
{
	public static void print_array(int[] arr)
	{
		if (arr == null)
		{		
			System.out.println("\tNull");
		}
		else
		{
			System.out.print("\tArray: ");
			for (int i : arr)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7};		
		DynamicArray da = new DynamicArray();
		
		System.out.println();
		System.out.println("\tOriginal array:");
		print_array(arr1);
		System.out.println("\t---------------------------------------------");
		
		print_array(da.insertAtEnd(arr1, 8));	
		print_array(da.deleteAtEnd(arr1));	
		print_array(da.insertAtPos(arr1, 3, 999));
		print_array(da.deleteAtPos(arr1, 3));	
		print_array(da.deleteAtPos(arr1, 100));
	}
}
