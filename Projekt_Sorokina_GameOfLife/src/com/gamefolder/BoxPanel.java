package com.gamefolder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class BoxPanel extends JPanel {
   Cell cell;
	

	public BoxPanel(int x, int y) {
		super(); //Parent
		cell= new Cell(); //create a new Cell 
		setBounds(x*Configuration.SIZE, y*Configuration.SIZE,Configuration.SIZE,Configuration.SIZE);
		setBackground(Configuration.getColor(Status.NONE));
		addMouseListener (new MouseAdapter() {
			public void mousePressed(MouseEvent e) { //By pressing add new cell and turn a status of first cell
				cell.turn();
			}
			});
		}


	public void initCells( int x , int y) {
		// TODO Auto-generated method stub
		
		
	}
	public void Colorize() {
		 setBackground(Configuration.getColor(cell.status)); // Method to set a color to different status of cells;
		
	}
	void stepI() {
		cell.stepI();
		Colorize();
	}
	void stepII() {
		cell.stepII();
		Colorize();
	}
	
	
}
