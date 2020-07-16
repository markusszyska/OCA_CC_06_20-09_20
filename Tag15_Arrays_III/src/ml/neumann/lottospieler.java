package ml.neumann;

import java.util.Scanner;

public class lottospieler {
	
public static void main(String[] args) {
	int[] lottozahlen = new int[6];
	
	for (int i=0; i<6; i++) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 49 ein");
	int zahl = sc.nextInt();
	
	//Abprüfung Zahl zwischen 1 und 49
	if (zahl < 1 || zahl > 49) {
		System.out.println("Zahl liegt nicht zwischen 1 und 49");
		i--;
		continue;}
	lottozahlen[i] = zahl;
	}
	
	

	System.out.println(lottozahlen[0]);
	 System.out.println(lottozahlen[1]);
	 System.out.println(lottozahlen[2]);
	 System.out.println(lottozahlen[3]);
	 System.out.println(lottozahlen[4]);
	 System.out.println(lottozahlen[5]);

	 // sechs zahlen eingegeben, ohne Abprüfung ob doppelt oder innerhalb der Range 1-49
	 
	 // Daten sortieren mit Bubblesort

} }  /*
class Bubblesort{
	public int[] intArr;
    public int[] sort() {
        int k;
        for (int i = 0; i < lottozahlen.length - 1; i++) {
            if (lottozahlen[i] < lottozahlen[i + 1]) {
                continue;
            }
            k = lottozahlen[i];
            lottozahlen[i] = lottozahlen[i + 1];
            lottozahlen[i + 1] = k;
            sort();
        }
        return lottozahlen;
    }

    public static void main(String[] args) {
        Bubblesort bs = new Bubblesort();
        int[] arr = bs.sort();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
            */

// ende Klasse
