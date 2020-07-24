package ml.salastexido.faunaandflora;

import ml.salastexido.interfaces.ICanMove;
import ml.salastexido.interfaces.IEatable;
import ml.salastexido.interfaces.IMakeSound;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public abstract class AAnimal implements ICanMove, IMakeSound, IEatable {
	
	public int weight;
	public String name;
	
	
	public abstract void eat(IEatable e);
	public abstract void makeSound();

}
