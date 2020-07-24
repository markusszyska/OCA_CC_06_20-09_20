/**
 * 
 */
package ml.salastexido.faunaandflora;

/**
 * @author Raul Alejandro Salas Texido
 *
 */
public class Farmer extends APerson {
	
	public Farmer(final String name, final int age){
		this.name = name;
		this.age = age;
		this.bankBalance = 0;
	}
	
	public String toString() {
		return new String().concat("\n Name: " + this.name).concat("\n Age: " + this.age).concat("\n BankBalance: " + this.bankBalance);
		
	}
	
	

}
