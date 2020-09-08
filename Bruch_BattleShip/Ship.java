package mboo;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Ship {
	
	private List<Cell> coordinates = new ArrayList<Cell>();
	private int size;
	
	private Set<Cell> fired = new HashSet<>();
	
	
	public Ship(int size) {
		super();
		this.size = size;
	}
	
	public void addCoordinate(Cell coordinate) {
		coordinates.add(coordinate);
	}
	
	public List<Cell> getCells() {
		return coordinates;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Set<Cell> getFired() {
		return fired;
	}

	public void setFired(Set<Cell> fired) {
		this.fired = fired;
	}
	
	
}
