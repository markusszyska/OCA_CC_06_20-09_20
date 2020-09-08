package com.gamefolder;

import java.util.ArrayList;

public class Cell {
    ArrayList <Cell> neighborshoods; // List of Neighbors
	Status status;
	
	public Cell() {
		// TODO Auto-generated constructor stub
		status= Status.NONE; //first status of a cell;
		neighborshoods = new ArrayList<>(); 
	}
	void addNeighbours(Cell cell) { // create neighbors cells around cell
		neighborshoods.add(cell);
	}
	void stepI() {
		 int radius = searchForLife();
		 status = status.stepI(radius);
	}
    
	void stepII() {
		status = status.stepII();
	}
	 int searchForLife() { // count how many neighbors are around the cell now;
		int nlife=0;
		for (Cell cell: neighborshoods)
		 if (cell.status.isCellAlive()) // if cell is still alive go fort, count 
			                            
			 nlife++;
			 return nlife;
		
		
		
	}
	 void turn() {
		 for (Cell cell : neighborshoods)
			 cell.status = cell.status.isCellAlive() ? Status.NONE : Status.LIVE;
	 }
}
