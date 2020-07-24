package ml.neumann.abstrakterBauernhof;

import ml.neumann.abstrakterBauernhof.fauna.ANutztier;
import ml.neumann.abstrakterBauernhof.fauna.ATier;
import ml.neumann.abstrakterBauernhof.fauna.Bauer;
import ml.neumann.abstrakterBauernhof.fauna.Kuh;
import ml.neumann.abstrakterBauernhof.fauna.Schwein;
import ml.neumann.abstrakterBauernhof.flora.APflanze;
import ml.neumann.abstrakterBauernhof.flora.Kartoffel;
import ml.neumann.abstrakterBauernhof.flora.Moehre;

public class BauernhofMain {
	public static void main(String[] args) {
		
	
	
	// Objekte 
	//	ANutztier t3= new ANutztier(); // Cannot instantiate the type ANutztier
	ATier b = new Bauer("Karl-Heinz", 60, 100, false,1500);
ANutztier k1= new Kuh("Gerda",5, 150,true,"braun");
ANutztier k2= new Kuh ("Horst", 6,150,false,"schwarz");
ANutztier s1 = new Schwein("Frieda", 2,50,true,true);
ANutztier s2 = new Schwein("Hildegard",3,70,true,false);
ANutztier s3= new Schwein("Fridolin",4,65, false, false);

APflanze m1= new Moehre("LangerLulatsch", 20);
APflanze m2= new Moehre("die Kleine", 5);
APflanze ka1= new Kartoffel ("Drillinge", 5);
APflanze ka2= new Kartoffel ("rote Riesen", 10);


// Methodenaufrufe 
System.out.println("---------------Fressen und gefressen werden --------------------");
k1.fressen(m1);
((Bauer) b).fuettert(s1,ka1);


System.out.println("--------Tiere machen Geraeusche ---------------------");
k2.machGeraeusch();
b.machGeraeusch();
s1.machGeraeusch();

System.out.println("----------Tiere werden geschlachtet-------------------");
((Bauer)b).schlachten(s1);

	}










}
 