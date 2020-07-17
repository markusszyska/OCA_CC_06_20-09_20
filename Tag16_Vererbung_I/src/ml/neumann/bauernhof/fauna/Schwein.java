package ml.neumann.bauernhof.fauna;

import ml.neumann.bauernhof.flora.Kartoffel;
import ml.neumann.bauernhof.gebaeude.Stall;

public class Schwein {
	//Attribute
		private String name;
		private int gewicht;
		private int alter;
		private Stall stall;
		private int preis; 
		
		//Getter/Setter
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getGewicht() {
			return gewicht;
		}
		public void setGewicht(int gewicht) {
			this.gewicht = gewicht;
		}
		public int getAlter() {
			return alter;
		}
		public void setAlter(int alter) {
			this.alter = alter;
		}
		public Stall getStall() {
			return stall;
		}
		public void setStall (Stall stall){
			this.stall = stall;
		}
		public int getPreis() {
			return preis;
		}
		public void setPreis(int preis) {
			this.preis = preis;
		}
		
		//Konstruktoren 
		
		public Schwein() {
			this.setName("Standardschwein");
			this.setGewicht(100);
			this.setAlter(1);
			this.setStall(null);
			this.setPreis(100);
		}
		
		public Schwein(String name, int gewicht, int alter, Stall stall, int preis) {
			this.setName(name);
			this.setGewicht(gewicht);
			this.setAlter(alter);
			this.setStall(stall);
			this.setPreis(preis);
		}
		
		// toString Methode 
		
		public String toString() {
			String ausgabe = "";
			ausgabe += "\n---------------Schwein:";
			ausgabe += "\nName: " + this.getName();
			ausgabe += "\nGewicht: " + this.getGewicht();
			ausgabe += "\nAlter: " + this.getAlter();
			ausgabe += "\nPreis: " + this.getPreis();
			
			return ausgabe;
		}
		
		
		// Methoden
		
		public void fressen(int bissen) {
//			this.gewicht += bissen;
			this.setGewicht(this.getGewicht() + bissen);
			System.out.println(this.getName() + " frisst " + bissen + " und wiegt jetzt "+ this.getGewicht());
		}
		public void fressen(Kartoffel paramKartoffel) {
			System.out.println(this.getName() + " frisst " + paramKartoffel.getSorte());
			this.setGewicht(this.getGewicht() + paramKartoffel.wirdGegessen());		
		}
		
		public void spielen(Schwein paramSchwein) {
			System.out.println(this.getName() + " spielt mit " + paramSchwein.getName());
		}
		
		
		
		
		
		

}
