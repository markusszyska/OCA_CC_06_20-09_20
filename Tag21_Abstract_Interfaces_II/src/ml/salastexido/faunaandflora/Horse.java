/**
 * 
 */
package ml.salastexido.faunaandflora;

import ml.salastexido.interfaces.IEatable;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class Horse extends Herbivoren {
	
	public Horse(final String name, final int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void willEat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat(IEatable e) {
		e.willEat();
		System.out.println("Horse will -> " + e + " eat");

	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub

	}

}
