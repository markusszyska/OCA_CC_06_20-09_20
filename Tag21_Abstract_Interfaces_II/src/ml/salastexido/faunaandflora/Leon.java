/**
 * 
 */
package ml.salastexido.faunaandflora;

import ml.salastexido.interfaces.IEatable;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class Leon extends Carnivores {
	
	public Leon(final String name, final int weight) {
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
		// TODO Auto-generated method stub
		e.willEat();
		System.out.println("Leon will -> " + e + " eat");

	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isOverheated() {
		// TODO Auto-generated method stub
		return false;
	}

}
