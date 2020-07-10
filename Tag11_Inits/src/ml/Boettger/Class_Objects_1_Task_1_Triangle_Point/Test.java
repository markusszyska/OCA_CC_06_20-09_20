package ml.Boettger.Class_Objects_1_Task_1_Triangle_Point;

public class Test 
{
	//########################################################################
	//
	//	Here you can switch on/off the testmode
	//
	final public static boolean testMode = true;	// testmode true/false
	//
	//########################################################################
	
	public static boolean isTestmode() {
		return testMode;
	}

	public static void main (String[] args)
	{
		Triangle t = new Triangle();
		
		System.out.println();	
		System.out.println (
			"\tThe triangle has a perimeter of " + t.perimeter() + " cm.");
	}
}
