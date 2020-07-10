package ml.Boettger.Class_Objects_2_Task_1_Addresses_Vehicles_Application;

public class Application {
	public static void main(String[] args) 
	{		
		Address adr = new Address();	// default address
		adr.printAddress();
		
		Address autohersteller = new Address("", 
			"Autohersteller", "Autoplatz", "1", "11111", "Autostadt");
		autohersteller.printAddress();
		
		Address peter_Musterautohaus = new Address("Peter", 
			"Musterautohaus", "Marktplatz", "2", "80888", "Muenchen");
		peter_Musterautohaus.printAddress();
						
		Address eva_Musterautohaus = new Address("Eva", 
			"Musterautohaus", "Milchstrasse", "14", "90234", "Galazien");
		eva_Musterautohaus.printAddress();
		
		Address luca_Musterautohaus = new Address("Luca", 
			"Musterautohaus", "Spielstrasse", "15", "76543", "Brettersbach");
			luca_Musterautohaus.printAddress();	
	}
}
