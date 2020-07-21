package ml.salastexido;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vehicle {
	
	private float price;
	private String manufacterName;
	protected static Scanner scanner = new Scanner(System.in);

	
	/**
	 * 
	 */
	public Vehicle() {
		super();
		System.out.println("Enter the name of Manufacter: ");
		manufacterName = scanner.next();
		try {
			System.out.println("Enter the Price: ");
			price = scanner.nextFloat();
		}catch(InputMismatchException e) {
			System.out.println("The Price is invalid: ");
			System.exit(1);
		}

	}

	public void print() {
		System.out.println();
		System.out.println("Manufacturer Name : " + manufacterName );
		System.out.println("Price : " + price);
		
	}
	
	public float getPreis() { return price;}
	
	public String getManufacterName() { return manufacterName;}

}
