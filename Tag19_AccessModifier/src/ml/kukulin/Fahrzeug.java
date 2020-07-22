package ml.kukulin; 

public class Fahrzeug {
private double	aktpos = 0;
private double  aktgw;
private double maxgw =0;

private int r�der = 0;
private int zeitdauer = 0;

public Fahrzeug() {
	this.aktpos = 0;
	this.aktgw = 0;
	this.maxgw = 0;
	this.r�der = 0;
}

public Fahrzeug(double aktpos, double aktgw, double maxgw, int r�der) {
	this.aktpos = aktpos;
	this.aktgw = aktgw;
	this.maxgw = maxgw;
	this.r�der = r�der;
}

public  void setAktPos (double aktpos) {
	this.aktpos = aktpos;
	
}

public double getAktPos() {
	
	return aktpos;
}

public  void setAktGw (double aktgw) {
	this.aktgw = aktgw;
	
}

public double getAktGw() {
	
	return aktgw;
}

public  void setMaxGw (double maxgw) {
	this.maxgw = maxgw;
}

public double getMaxGw() {
	
	return maxgw;
}

public  void setR�der (int r�der) {
	this.r�der = r�der;
}

public double getR�der() {
	
	return r�der;
}

public  void setGw (double gw) {
	if(0 < gw && gw <=getMaxGw()) {
	this.aktgw = gw;}
	else {
		System.out.println("Geschwindigkeit nicht im erlaubten Bereich");
}}




public double bewege(int zeitdauer ) {
	
	return aktpos = aktgw * (zeitdauer/60);
	
}

public String toString() {
	String ausgabe = toString();
	ausgabe += "\nAktuelle Position: " + this.getAktPos();
	ausgabe += "\nAktuelle Geschwindigkeit: " + this.getAktGw();

	ausgabe += "\nMaximalgeschwindigkeit: " + this.getMaxGw();
	ausgabe += "\nR�der: " + this.getR�der();
	return ausgabe;
}
}
//getMaxGw()