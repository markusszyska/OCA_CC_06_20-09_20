package ml.schulzke;

public class Strings {
	public static void main(String[] args) {
		System.out.println("\n --------- Aufgabe1 --------- \n");
		Aufgabe1("olleH");
		Aufgabe1("!nesel sad nenneok siforP ruN");
		System.out.println("\n --------- Aufgabe2 --------- \n");
		Aufgabe2("HaBcDGa");
		Aufgabe2("123456789");
		System.out.println("\n --------- Aufgabe3 --------- \n");
		Aufgabe3("HaB");
		Aufgabe3("=");
		Aufgabe3("123123=");
		Aufgabe3("Peter=666");
		Aufgabe3("UiUiUi=123");
		Aufgabe3("Ui===UiUi=123");
		System.out.println("\n --------- Aufgabe4 --------- \n");
		Aufgabe4(123);
		Aufgabe4(123312414);
		Aufgabe4(15342433);
		Aufgabe4(987654321);
		
		
	}
	
	
	static void Aufgabe1(String input) {
		char[] array = input.toCharArray();
		String output = "";
		for(int i=array.length-1;i>=0;i--) {
			output += String.valueOf(array[i]);
		}
		System.out.println(output);
	}
	
	static void Aufgabe2(String input) {
		char[] array = input.toCharArray();
		String output = "";
		for(int i=0;i<array.length-1;i=i+2) {
			if(i==array.length-3) {
				output += String.valueOf(array[i+2]);
				output += String.valueOf(array[i+1]);
				output += String.valueOf(array[i]);
			}else {
				output += String.valueOf(array[i+1]);
				output += String.valueOf(array[i]);
			}
		}
		System.out.println(output);
	}
	
	
	static void Aufgabe3(String input) {
		
		if((input.indexOf("=")==-1)||(input.charAt(0)=='=')||(input.indexOf("=")==input.length()-1)) {
			System.out.println("Ungueltige Eingabe! ("+input+")");
		}else {
			String[] array = input.split("=");
			String output = "";
			
			output = 	"\nEingabe 	'"+input+"'\n"+
						"Length: 	"+input.length()+"\n"+
						"Name: 		"+array[0]+"\n"+
						"Wert:		"+array[1];
			
			System.out.println(output);
		}

	}
	
	static void Aufgabe4(double input) {
		int dblOut = (int) input;
		String output = "";
		int pow = 0;
		
		while(Math.pow(2, pow)<input) {
			pow++;
		}
		
		pow--;
		
		while(pow>=0) {
			
			if((pow % 4) == 3) {
				output += " ";
			}
			
			if(input>=Math.pow(2, pow)) {
				input = input-Math.pow(2, pow);
				output += "1";
			}else {
				output += "0";
			}
			pow--;
		}
		System.out.println(dblOut+" == "+output);
	}
}
