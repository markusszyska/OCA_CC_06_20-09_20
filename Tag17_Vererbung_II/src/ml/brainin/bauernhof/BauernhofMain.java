package ml.brainin.bauernhof;

import java.util.ArrayList;

public class BauernhofMain {
	private ArrayList<Bauer> dieBauer = new ArrayList<>();
	private ArrayList<Stall> staelle = new ArrayList<>();
	private double kontostand = 0;
	
	
	public double getKontostand() {
		return kontostand;
	}


	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}


	public static void main(String[] args) {

		BauernhofMain bauernhofMain = new BauernhofMain();
		Bauer bauer = new Bauer("Tomas", 86, 180, 28, new Stall("Stall 1"));

		
		Kuh kuh1 = new Kuh("Ruddy", "schwarz", "weiss", 650);
		Kuh kuh2 = new Kuh("Sally", "weiss", "schwarz", 750);
		kuh1.setVerkaufsPreis(7.5);
		kuh2.setVerkaufsPreis(7.5);
		Schwein schwein1 = new Schwein("Marta", 70);
		Schwein schwein2 = new Schwein("Moriz", 65);
		schwein1.setVerkaufsPreis(5.5);
		schwein2.setVerkaufsPreis(5.5);
		
		bauer.getStall().addKuh(kuh1);
		bauer.getStall().addKuh(kuh2);
		bauer.getStall().addSchwein(schwein1);
		bauer.getStall().addSchwein(schwein2);
		
		System.out.println("\n\n--------------------------------------");
		Schwein schw1 = bauer.getStall().verkaufenSchwein(schwein1);
		if (schw1 != null) {
			bauernhofMain.setKontostand(bauernhofMain.getKontostand() + schw1.getVerkaufsPreis());
			System.out.println("Ein Schwein ("+schw1.getName()+")  wurde verkauft.\n\nDer Kontostand ist : "+ bauernhofMain.getKontostand());
		}
		Kuh k1 = bauer.getStall().verkaufenKuh(kuh1);
		if (k1 != null) {
			bauernhofMain.setKontostand(bauernhofMain.getKontostand() + k1.getVerkaufsPreis());
			System.out.println("\nEine Kuh ("+k1.getName()+")  wurde verkauft.\n\nDer Kontostand ist : "+ bauernhofMain.getKontostand());
		}
	}
	
	
}
