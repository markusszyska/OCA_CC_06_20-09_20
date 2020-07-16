/*
Erstellen Sie eine Klasse DynamischesArray, die als Attribut ein Array des Typs
int hat.

Sie soll Methoden bereitstellen, die es ermöglichen ein Element am Ende zu
entfernen oder hinzuzufuegen. 

Zusaetzlich soll sie Methoden bieten, um ein Element an einer beliebigen
Position im Array hinzuzufuegen oder zu entfernen.

Erstellen Sie eine Klasse DynamischesArrayMain mit einer main methode um ihre
Klasse DynamischesArray zu testen. 
 */

package ml.Boettger.dynamic_Array;

public class DynamicArray {
	private int[]arr = {0};

	public int[] insertAtEnd(int []arr_in, int i_new)	
	{
		int i;
		int[] arr_out = new int [arr_in.length + 1];
		for (i = 0; i < arr_in.length; i++)
		{
			arr_out[i] = arr_in[i];
		}
		arr_out[i] = i_new;
		return arr_out;
	}
	
	public int[] deleteAtEnd(int[] arr_in)
	{
		int i;
		
		if (arr_in.length == 1)
		{	
			return null;
		}			
		
		int[] arr_out = new int [arr_in.length - 1];		
		
		for (i = 0; i < arr_in.length - 1; i++)
		{
			arr_out[i] = arr_in[i];
		}
		return arr_out;		
	}
	
	public int[] insertAtPos(int []arr_in, int pos, int i_new)	
	{
		// pos starts at 0, until arr_in.lenght - 1, insert will be before pos

		int i;
		int[] arr_out = new int [arr_in.length + 1];
		
		if (pos < 0 || pos > arr_in.length - 1)
		{
			return null;
		}
	
		for (i = 0; i < pos; i++)
		{
			arr_out[i] = arr_in[i];
		}
		
		arr_out[pos] = i_new;
		
		for (i = pos; i < arr_in.length; i++)
		{
			arr_out[i + 1] = arr_in[i];
		}
		return arr_out;
	}
	
	public int[] deleteAtPos(int[] arr_in, int pos)
	{
		// pos starts at 0, until arr_in.lenght - 1, deletion is at pos

		int i;
		
		if (arr_in.length == 1)
		{	
			return null;
		}			
		
		int[] arr_out = new int [arr_in.length - 1];
		
		if (pos < 0 || pos > arr_in.length - 1)
		{
			return null;			
		}		
		
		for (i = 0; i < pos; i++)
		{
			arr_out[i] = arr_in[i];
		}
		for (i = pos + 1; i < arr_in.length; i++)
		{
			arr_out[i - 1] = arr_in[i];
		}
		return arr_out;		
	}	
}	

