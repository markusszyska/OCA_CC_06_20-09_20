package demoArray;

public class DemoArray {
	public static void main(String[] args) {
		//Die eckigen Klammer koennen vor oder hinter dem Bezeichner stehen
		int[]zahlen = new int[5];
		int zahlen2 [] = new int[5];
		//Bei dieser Schreibweise darf in der eckigen Klammer keine Groesse stehen
//		int[] zahlen3 = new int[5] {1,2,3};
		int[] zahlen3 = new int[] {1,2,3};
		//Die Schreibweise ohne new int[] geht nur bei Deklaration und Initialisierung
		//in einem Schritt
		int[] zahlen4 = {1,2,3};
		zahlen3 = new int[] {1,2,3};
//		 zahlen3 = {1,2,3};
		
		nimmtArray(new int[] {1,2,3});
//		nimmtArray({1,2,3,4});
		
		//Mehrdimensionale Arrays
		int[][] zahlen5 = new int[3][3];
//		zahlen5[2] = 10;
		zahlen5[2][2] = 10;
		zahlen5[1] = new int[] {1,2,3,4};
		
		int[][]zahlen6 = { {10,20} , {30,40,50,60,70}, {80,90,100} };
		for (int i = 0; i < zahlen6.length; i++) {
//			System.out.println("Wir sind an Stelle " + i + " der ersten Dimension");
			for (int j = 0; j < zahlen6[i].length; j++) {
				System.out.println("Wir sind an Stelle ["+ i + "][" + j +"]");
				System.out.println("Dort haben wir den Wert: " + zahlen6[i][j]);
			}
		}
		
		for(int[]firstDim : zahlen6) {
			for(int wert : firstDim) {
				System.out.println(wert);
			}
		}
		
		int[][]twoDim = { {10,20} , {30,40,50,60,70}, {80,90,100} };
		int[][]twoDim2 = new int[][]{ new int[]{10,20} , new int[]{30,40,50,60,70}, new int[]{80,90,100} };
		
		twoDim2[0][0] = 1000000;
		
		int[][][] threeDim = {twoDim2, twoDim2, twoDim};
		System.out.println("---------------------------------");
		for(int[][] twoDimArray : threeDim) {
			for(int[] oneDimArray : twoDimArray) {
				for(int wert: oneDimArray) {
					System.out.println(wert);
				}
			}
		}
		
//		System.out.println(zahlen6[1][10]);//Out Of Bound	
		System.out.println("--------------oneDim---------------");
		int[] oneDim = new int[2];
		for (int i = 0; i < oneDim.length; i++) {
			System.out.println(oneDim[i]);
		}
		/*
		 * In der zweiten Dimension ist keine Laenge angegeben.
		 * Da ein int[] ein Referenztyp ist, ist der Standardwert
		 * null
		 */
		int[][] twoDim3 = new int[2][];
		for (int i = 0; i < twoDim3.length; i++) {
			System.out.println(twoDim3[i].length);//NullPointer
		}
		
		int[] zahlen7;
//		System.out.println(zahlen7);
		int[] zahlen8 = null;
		System.out.println(zahlen8);
		
		int[][][][] fourDim5 = new int[5][5][5][5];
		int[][][] threeDim5 = new int[5][5][5];
		int[][] twoDim5 = new int[5][5];
		int[][] twoDim6 = new int[5][5];
		
		fourDim5[1][1] = twoDim5;
// 		fourDim5[1][1][0] = twoDim5;
		fourDim5[1] = threeDim5;
//		fourDim5 = threeDim5;
		twoDim5 = twoDim6;
		
	}
	
	public static void nimmtArray(int[]arr) {
		
	}
	
	
	
}
