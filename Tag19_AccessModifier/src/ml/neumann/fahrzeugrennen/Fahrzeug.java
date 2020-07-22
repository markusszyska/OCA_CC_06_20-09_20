package ml.neumann.fahrzeugrennen;

public class Fahrzeug {

	private double position;
	private double geschwindigkeit; 
	private double maxGeschwindigkeit; 
	private int raeder; 



// getter/setter 
public double getPosition(){
	return position;
}

public void setPosition(double position) {
	this.position = position;}

public double getMaxGeschwindigkeit()
{
	return maxGeschwindigkeit; 
}
public void setMaxGeschwindigkeit(double maxGeschwindigkeit) {
	this.maxGeschwindigkeit = maxGeschwindigkeit;
}

public double getGeschwindigkeit() {
	return geschwindigkeit;
}
// Abpr�fung das keine Geschwindigkeit gesetzt wird die �ber der Maximalen Geschwindigkeit ist. 
public void setGeschwindigkeit(double geschwindigkeit) {
	//if (geschwindigkeit < getMaxGeschwindigkeit()){
	this.geschwindigkeit = geschwindigkeit;}
//	else {System.out.println("Die Geschwindigkeit �bersteigt die maximale Geschwindigkeit");}
//}


public int getRaeder()
{
	return raeder;
}

public void setRaeder(int raeder) {
	this.raeder=raeder;
}
// Konstruktor 

public Fahrzeug(){
	this.setGeschwindigkeit(100);
	this.setPosition(0);
	this.setMaxGeschwindigkeit(230);
	this.setRaeder(0);
	
}


// ToString Methode 
public String toString() {
	String ausgabe=""; 
	ausgabe += "\nGeschwindigkeit: " + this.getGeschwindigkeit();
	ausgabe +="\nPosition: "+ this.getPosition();
	ausgabe +="\nMaxGeschwindigkeit: " + this.getMaxGeschwindigkeit();
	ausgabe +="\nAnzahl R�der: " + this.getRaeder();
	return ausgabe;
	}

// methode bewegen. - type double - Zeitdauer m �bergeben - Fahrzeug �ndert position

public void bewegen(double min) {
	//berechnung der neuen Position: 
	double pos=0.00;
	pos = this.getPosition() + this.getGeschwindigkeit()*(min/60);
	this.setPosition(pos);
}
}/// Ende Klasse

