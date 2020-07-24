/**
 * 
 */
package ml.salastexido.faunaandflora;

import ml.salastexido.interfaces.IEatable;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class Hen extends AAnimal {
	
	
	public Hen(final String name, final int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public void eat(IEatable e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void willEat() {
		// TODO Auto-generated method stub
		System.out.println("Hen will be eaten!!!");
		
	}

	@Override
	public String toString() {
		return "Hen (weight=" + weight + ", name=" + name + ")!!!";
	}
	
	
	
	

}
