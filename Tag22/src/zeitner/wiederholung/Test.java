package zeitner.wiederholung;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) throws Exception {
		Fahrzeug f = new Fahrzeug("PKW",100);
		Fahrzeug f2 = f.clone();
		System.out.println("F : " + f.getTyp().hashCode());
		System.out.println("F2: " + f2.getTyp().hashCode());

		System.out.println("F : " + f.getTyp());
		System.out.println("F2: " + f2.getTyp());
		
		f2.setTyp("LKW");
		
		System.out.println("F : " + f.getTyp());
		System.out.println("F2: " + f2.getTyp());

		System.out.println("F : " + f.getTyp().hashCode());
		System.out.println("F2: " + f2.getTyp().hashCode());
		
	}
}