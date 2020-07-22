package ml.neumann.fahrzeugrennen;

import java.util.Arrays;

public class Rennen {
public static void main(String[] args) {
	Fahrzeug fr = new Fahrrad(); 
	Fahrzeug a = new Auto(); 
	Fahrzeug r = new Rennwagen(); 
	Fahrzeug k = new Krankenwagen(); 

	fr.setGeschwindigkeit(20);
	a.setGeschwindigkeit(150);
	r.setGeschwindigkeit(200);
	k.setGeschwindigkeit(80);
	
// Test was in den Variablen gespeichert ist.
	//String test = 	k.toString();
	//System.out.println("Test:" + test);	
	
fr.bewegen(300);
a.bewegen(60);
r.bewegen(60);
k.bewegen(60);

//// Positionen nach dem Rennen 
System.out.println("Position des Fahrrads: " + fr.getPosition());
System.out.println("Position des Autos: " + a.getPosition());
System.out.println("Position des Rennwagens: " + r.getPosition());
System.out.println( "Position des Krankenwagens: " + k.getPosition());
// Array mit den Positionen 
double[] rennerg; 
rennerg = new double [4];

rennerg[0]= fr.getPosition();
rennerg[1]= a.getPosition();
rennerg [2]= r.getPosition();
rennerg[3]=k.getPosition();

// sortieren der Positionen
Arrays.sort(rennerg);
System.out.println("Der Gewinner und der Verlierer des Rennens -------");
System.out.println("Der Gewinner: " + rennerg[3]);
System.out.println("Der Verlierer: " + rennerg[0]);
}

 

}
