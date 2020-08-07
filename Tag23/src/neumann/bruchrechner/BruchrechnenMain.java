package neumann.bruchrechner;

import java.util.Scanner;

public class BruchrechnenMain {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Bitte geben einen Zaehler ein");
	int z1 = sc.nextInt();
	
	System.out.println("Bitte geben Sie einen Nenner ein");
	int n1 = sc.nextInt();
	
	System.out.println("Bitte geben einen Zaehler ein");
	int z2 = sc.nextInt();
	
	System.out.println("Bitte geben Sie einen Nenner ein");
	int n2 = sc.nextInt();
	
	sc.close();

//Testausgabe
	
	System.out.println( "Bruch 1: "  + z1+"/" + n1 );
	System.out.println( "Bruch 2: "  + z2+"/" + n2 );

	System.out.println("------------Multiplizieren ------------");
	Bruch a= new Bruch();
			a.multiplizieren(z1,n1,z2,n2);

System.out.println("---------------Dividieren--------------");
a.dividieren(z1, n1, z2, n2);

System.out.println("---------------------Addieren--------------");
a.addieren(z1, n1, z2, n2);

System.out.println("------------------Subtrahieren----------------");
a.subtrahieren(z1, n1, z2, n2);
}
}
