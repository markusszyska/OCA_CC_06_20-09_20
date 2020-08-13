package ml.neumann.arraylists;

import java.util.ArrayList;


//Erzeugen Sie eine `ArrayList` mit 20 zufälligen Integer aus dem Bereich [1 ... 100]. 
//Geben Sie die Elemente der Liste durchnummeriert untereinander aus.
public class A1 {
	public static void main(String[] args) {
	
// Liste erstellen 
	ArrayList <Integer> list= new ArrayList<>();
	//füllen der Liste mit zufallszahlen 
	for (int i=0; i<20; i++) {
		list.add((int)(Math.random() *100 + 1 ));
 
	System.out.println("Position " + i + ": " + list.get(i));
	}
	
	
	
	
	}}
