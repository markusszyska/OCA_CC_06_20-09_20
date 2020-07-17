package arrays;

import java.util.Arrays;

import bauernhof_final_vor_vererbung.Kartoffel;

public class DemoKlasseArrays {
	public static void main(String[] args) {
		int[] oneDim = { 1, 2, 3, 4, 5 };
		System.out.println(oneDim);

		int[][] twoDim = { oneDim, oneDim };

		System.out.println("oneDim: " + Arrays.toString(oneDim));
		System.out.println("twoDim: " + Arrays.toString(twoDim));

		Kartoffel[] kartoffeln = { new Kartoffel("Christa", 20), new Kartoffel("Bertha", 30) };
		System.out.println("Kartoffel Array: " + Arrays.toString(kartoffeln));
		Kartoffel[][] twoDimKartoffeln = { kartoffeln };
		System.out.println("Kartoffel Array: " + Arrays.toString(twoDimKartoffeln));

		/*
		 * Returns a string representation of the "deep contents" of the specified
		 * array. If the array contains other arrays as elements, the string
		 * representation contains their contents and so on. This method is designed for
		 * converting multidimensional arrays to strings.
		 */
		System.out.println("Kartoffel Array deepToString(): " + Arrays.deepToString(twoDimKartoffeln));

		// Arrays klonen
		// Erzeugt eine flache Kopie, beide Arrays referenzieren die selben Objekte
		int[] oneDim2 = oneDim.clone();
		oneDim2[2] = 1000;
		System.out.println(Arrays.toString(oneDim));
		System.out.println(Arrays.toString(oneDim2));

		int[] oneDim3 = { 1, 2, 3, 4, 5 };
		int[] oneDim4 = oneDim3;
		oneDim3[0] = 1000;
		System.out.println("Arrays.toString(oneDim3)" + Arrays.toString(oneDim3));
		System.out.println("Arrays.toString(oneDim4)" + Arrays.toString(oneDim4));

		int[] oneDim5 = { 1, 2, 3, 4, 5 };
		int[] oneDim6 = { 8, 9, 10 };
		int[][] twoDim2 = { oneDim5, oneDim6 };
		int[][] twoDim3 = twoDim2.clone();
		int[][] twoDim4 = twoDim2;

		System.out.println(twoDim2[0] == twoDim3[0]);
		twoDim2[0][0] = 1000;
		System.out.println(twoDim2[0][0]);
		System.out.println(twoDim3[0][0]);
		System.out.println("twoDim2== twoDim3 " + (twoDim2 == twoDim3));
		System.out.println("twoDim2== twoDim4 " + (twoDim2 == twoDim4));

		Kartoffel[] kartoffeln2 = kartoffeln.clone();
		kartoffeln2[0].setSorte("neue Sorte");
		System.out.println(kartoffeln[0].getSorte());
		System.out.println(kartoffeln2[0] == kartoffeln[0]);
		System.out.println(kartoffeln == kartoffeln2);
		kartoffeln[0] = null;
		System.out.println(kartoffeln[0]);
		System.out.println(kartoffeln2[0]);

		int[] zahlen = { 6, 3, 9, 1, 5 };
		Arrays.sort(zahlen);
		System.out.println(Arrays.toString(zahlen));

		/*
		 * Assigns the specified int value to each element of the specified range of the
		 * specified array of ints. The range to be filled extends from index fromIndex,
		 * inclusive, to index toIndex, exclusive. (If fromIndex==toIndex, the range to
		 * be filled is empty.)
		 */
		Arrays.fill(zahlen, 2, 4, 1);
		System.out.println(Arrays.toString(zahlen));
		
		
		
		
	}
}
