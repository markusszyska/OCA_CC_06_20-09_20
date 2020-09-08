package mboo;

import java.util.*;

public class Player {
	
	private String name;
	
	private List<Ship> ships = new ArrayList<>();
	
	private int amountOfShips;

	public Player(String name, int amountOfShips) {
		super();
		this.name = name;
		this.amountOfShips = amountOfShips;
	}
	
	public void addShip(Ship input) {
		ships.add(input);
	}
	
	public List<Ship> getShips() {
		return ships;
	}

	public String getName() {
		return name;
	}
	

}
