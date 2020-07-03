/*
###############################################################################
 
Aufgabe 1

Sie sollen eine Anwendung entwickeln, die Anwendern helfen soll deren 
Gesundheit ein wenig im Auge zu behalten. Dazu soll Ihre Anwendung den
BMI ñ body mass index ñ errechnen. Der BMI errechnet sich nach der folgenden

Formel:
BMI calculation: body weight(kg) / (body height(m) * body height(m))

Ein wuenschenswerter BMI h‰ngt vom Alter ab. Die nachfolgende Tabelle
zeigt, in welchem Alter ein BMI als gesund gilt:

	19-24 Jahre BMI 19-24
	25-34 Jahre BMI 20-25
 	35-44 Jahre BMI 21-26
 	45-54 Jahre BMI 22-27
 	55-64 Jahre BMI 23-28
 	> 64 Jahre BMI 24-29

Tabelle 1 ñ Quelle: 
https://www.uni-hohenheim.de/wwwin140/info/interaktives/bmi.htm

Ihr Konsolenprogramm soll drei Werte abfragen:

1. Koerpergewicht in kg
2. Koerpergroeﬂe in Metern
3. Alter (in Jahren)

Ihr Programm soll den BMI errechnen und pruefen, ob der BMI fuer das
angegebene Alter im vorgesehenen Intervall liegt. Wenn ja, soll der
Anwender einen netten Hinweis bekommen, dass alles im Rahmen ist. 
Andernfalls sollte eine vorsichtige Warnung ausgegeben werden.

###############################################################################
*/

package ml.Boettger.Berechnungen_Verzeigungen_01_Aufgabe_01_BMI;

import java.util.Scanner;

public class BMI_Calculation {
	public static void main(String[] args) {
		
		// local varibales
		float f_Body_Weight = 0.00f;
		float f_Body_Height = 0.00f;
		float f_BMI = 0.00f;

		short s_Age = 0;
		
		boolean b_BMI_ok = false;
		
		// read input
		Scanner sc = new Scanner(System.in);
				
		System.out.println();
		System.out.print("Please enter your age in years: ");
		s_Age = sc.nextShort();

		if (s_Age < 19)
		{
			System.out.println();
			System.out.println("BMI cannot be calculated - finish!");
			
			// just not learned, othewise use ...else
			System.exit(0);
		}
		
		System.out.println();
		System.out.print("Please enter your body weight in kg with COMMA: ");
		f_Body_Weight = sc.nextFloat();
		
		System.out.println();
		System.out.print("Please enter your body height in m with COMMA: ");
		f_Body_Height = sc.nextFloat();
		
		
		// BMI calculation: body weight(kg) / (body height(m) * body height(m))

		f_BMI = f_Body_Weight / (f_Body_Height * f_Body_Height);
		
		System.out.println();
		System.out.println("Your BMI is " + f_BMI + ".");
		
		System.out.println();
		if ((s_Age >= 19 && s_Age <= 24 && f_BMI >= 19  && f_BMI <= 24) ||
			(s_Age >= 25 && s_Age <= 34 && f_BMI >= 20  && f_BMI <= 25) ||
			(s_Age >= 35 && s_Age <= 44 && f_BMI >= 21  && f_BMI <= 26) ||
			(s_Age >= 45 && s_Age <= 54 && f_BMI >= 22  && f_BMI <= 27) ||
			(s_Age >= 55 && s_Age <= 64 && f_BMI >= 23  && f_BMI <= 28) ||
			(s_Age > 64 && f_BMI >= 24  && f_BMI <= 29)) 			
		{	
			System.out.println("Everything is in the frame!");
		}
		else
		{
			System.out.println("Your BMI is not in the frame!");
		}			
	}
}
