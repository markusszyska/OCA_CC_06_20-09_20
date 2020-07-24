/**
 * 
 */
package ml.salastexido.faunaandflora;

import ml.salastexido.interfaces.IEatable;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class Carrot extends APlants implements IEatable{
	
	
	public Carrot(final double price) {
		this.price=price;
	}
	

	@Override
	public void willEat() {
		// TODO Auto-generated method stub
		System.out.println("Carrot will be eaten!!!");
		
	}


	@Override
	public String toString() {
		return "Carrot (price=" + price + ")";
	}
	
	
	
	

}
