/**
 * 
 */
package ml.salastexido.faunaandflora;

import ml.salastexido.interfaces.IEatable;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class Fish extends AAnimal {

	@Override
	public void eat(IEatable e) {
		// TODO Auto-generated method stub
		System.out.println("Fish will -> " + e + "eat");

	}

	@Override
	public void willEat() {
		// TODO Auto-generated method stub
		System.out.println("Fish will be eaten!!!");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}

}
