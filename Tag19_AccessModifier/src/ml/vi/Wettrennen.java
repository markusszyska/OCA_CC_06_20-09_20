package ml.vi;

public class Wettrennen {

	public static void main(String[] args) {
		
		Fahrzeug[] array = new Fahrzeug[4];
		array[0] = new Fahrrad();
		array[0].setGeschwindigkeit(20);
		array[1] = new Auto();
		array[1].setGeschwindigkeit(150);
		array[2] = new Rennwagen();
		array[2].setGeschwindigkeit(200);
		array[3] = new Krankenwagen();
		array[3].setGeschwindigkeit(80);
		
		float stunde = 60;		

		array[0].bewege(stunde*4);
		for (int i = 1; i < array.length; i++) {
			array[i].bewege(stunde);
		}
		
		int min_index = 0, max_index = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Position von "+ array[i].getClass().getSimpleName()+": "+array[i].getPosition());	
			
			if(array[i].getPosition() > array[max_index].getPosition()) {
				max_index = i;
			}
			if(array[i].getPosition() < array[min_index].getPosition()) {
				min_index = i;
			}
			
		}

		System.out.println("Erster Platz: " + array[max_index].getClass().getSimpleName());
		System.out.println("Letzter Platz: " + array[min_index].getClass().getSimpleName());
		
	}
	
}
