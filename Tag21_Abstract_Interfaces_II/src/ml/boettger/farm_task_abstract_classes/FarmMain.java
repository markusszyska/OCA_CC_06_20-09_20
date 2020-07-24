package ml.boettger.farm_task_abstract_classes;

import java.util.Scanner;

import ml.boettger.farm_task_abstract_classes.fauna.*;
import ml.boettger.farm_task_abstract_classes.flora.*;

public class FarmMain {
	//########################################################################
	//
	//	Here you can switch on/off the testmode
	//
	final public static boolean TESTMODE = false;	// testmode true/false
	//
	//########################################################################
	
	final public static String CTOR = "\tctor\n";	// ctor in testmode
	
	public static Scanner sc = new Scanner(System.in); 
		// for pausing console output, see function pause
	
	public static void pause()
	{
		System.out.println();
	    System.out.println("\tPress Any Key To Continue...");
	    FarmMain.sc.nextLine();	    
	}
	
	public static boolean isTESTMODE() 
	{
		return TESTMODE;
	}
	
	public static void main(String[] args)
	{
		String s_input = "";		// input request string
		
		//                      name   weight height age
		
		System.out.println();
		
		/*		
		Farmer max = new Farmer("Max", 80.2f, 1.95f, 38);		
		Farm my_farm = new Farm("My Home My Farm");		
		Barn b = new Barn();
		*/
			
		Potato p = new Potato();
		Carrot c = new Carrot();

		// 11 pigs
		//Pig p_napoleon = new Pig("Napoleon", 350.00f, 18, 500.00f);	// 1
		Pig p_emil = new Pig("Emil");								// 2
		Pig p_johannes = new Pig("Johannes");						// 3
		Pig p_siegfried = new Pig("Siegfried");						// 4
		Pig p_manfred = new Pig("Manfred");							// 5
		Pig p_richard = new Pig("Richard");							// 6
		Pig p_bert = new Pig("Bert");								// 7
		Pig p_friedhelm = new Pig("Friedhelm");						// 8
		Pig p_carsten = new Pig("Carsten");							// 9	
		Pig p_snowball = new Pig("Snowball");						// 10
		Pig p_reiner = new Pig("Reiner");							// 11

		// 11 cows
		Cow c_siglinde = new Cow("Siglinde");						// 1
		Cow c_gertrude = new Cow("Gertrude");						// 2
		Cow c_martha = new Cow("Martha");							// 3
		Cow c_gerda = new Cow("Gerda");								// 4
		Cow c_berta = new Cow("Berta");								// 5
		Cow c_rita = new Cow("Rita");								// 6
		Cow c_eva = new Cow("Eva");									// 7
		Cow c_ute = new Cow("Ute");									// 8
		Cow c_elma = new Cow("Elma");								// 9	
		Cow c_frieda = new Cow("Frieda");							// 10
		Cow c_jutta = new Cow("Jutta");								// 11
				
		c_jutta.makeNoise();
		p_reiner.makeNoise();				
		p_reiner.eat(p);
		c_jutta.eat(c);
		
		System.out.println();
		System.out.println("\tEnd of program");
		System.out.println();
	}
}
