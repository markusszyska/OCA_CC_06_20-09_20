/**
 * 
 */
package ml.salastexido.faunaandflora;

import ml.salastexido.interfaces.IEatable;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class Potatoes extends APlants implements IEatable{
	
	public Potatoes(final double price) {
		this.price = price;
	}

	@Override
	public void willEat() {
		// TODO Auto-generated method stub
		
	}

}
