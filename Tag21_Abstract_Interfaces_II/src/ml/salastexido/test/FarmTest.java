package ml.salastexido.test;

import ml.salastexido.faunaandflora.AAnimal;
import ml.salastexido.faunaandflora.APerson;
import ml.salastexido.faunaandflora.Carrot;
import ml.salastexido.faunaandflora.Cow;
import ml.salastexido.faunaandflora.Farmer;
import ml.salastexido.faunaandflora.Hen;
import ml.salastexido.faunaandflora.Horse;
import ml.salastexido.faunaandflora.Leon;
import ml.salastexido.faunaandflora.Pig;

/**
 * @author Raul Alejandro Salas Texido
 *
 */

public class FarmTest {
	
	public static void main(String[] args) {

		AAnimal[] animals = new AAnimal[5]; 
		//create Cow in position 0
		animals[0]= new Cow();
		animals[1]=	new Hen("Pepa",5);
		animals[2]=	new Leon("Leon1",300);
		animals[3]= new Horse("Horse1",200);
	
		
		//Leon->Hen->eat
		animals[2].eat(new Hen("Tita",6));
		//Horse->Carrot->eat
		animals[3].eat(new Carrot(15));
	}

}
