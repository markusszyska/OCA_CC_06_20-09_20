package com.gamefolder;





import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.Timer;


public class CanvasWindow implements Runnable  {
    JFrame frame;
    BoxPanel[][]boxes;
    
	@Override
	public void run() {
		// TODO Auto-generated method stub
		initFrame();//Initialization
		initBoxes();
		initTimer();
		
	}
	
	

	void initFrame() {// settings of Window
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setSize(Configuration.SIZE *Configuration.WIDTH, Configuration.SIZE * Configuration.HEIGHT); // size of window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close window and program
		frame.setLocationRelativeTo(null);// window location in the middle of display;
		frame.setVisible(true);// turn on ;
		frame.setTitle("Game Of Life");
	}
	void initBoxes() { //Initialization of  Boxes ( creation)
		
		boxes = new BoxPanel [Configuration.WIDTH] [Configuration.HEIGHT];
		for (int x = 0; x <Configuration.WIDTH; x++) 
			for (int y = 0; y < Configuration.HEIGHT; y++) {
				
				boxes [x][y]= new BoxPanel(x, y);
				frame.add(boxes [x] [y]);
			}
		
			for (int x = 0; x <Configuration.WIDTH; x++)  // here would special cell taken 
				for (int y = 0; y < Configuration.HEIGHT; y++)// check for every eight possible "moves" around it
					for(int cx =-1; cx<=+1; cx++ )
						for(int cy =-1; cy<=+1; cy++ )
							if(!(cx ==0 && cy == 0))
								boxes [x][y].cell.addNeighbours(boxes
										[(x+cx+Configuration.WIDTH)% Configuration.WIDTH ]
										[(y+cy+Configuration.HEIGHT)% Configuration.HEIGHT].cell); // add the near cell to neighbors
				
				for (int x = 25; x < 35; x++) {//  position of the first cells on line x
					 boxes[x][20].cell.status=Status.LIVE; // position of the first cells on line y
				 	 boxes[x][20].Colorize(); // set color to each cell dependent of a status
				}
				
			}
   
	private void initTimer() {
		// TODO Auto-generated method stub
		TimerListener tl = new TimerListener();
		Timer time = new Timer (Configuration.SLEEPMS,tl);
		time.start();
	}
	private class TimerListener implements ActionListener {
		
		boolean changer = false;

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		changer = !changer;
		
		for (int x = 0; x <Configuration.WIDTH; x++)  // here would special cell taken 
			for (int y = 0; y < Configuration.HEIGHT; y++) {
				if (changer) {
					boxes[x][y].stepI();
					
				}
				else {
					boxes[x][y].stepII();
				}
				
				
			}
	}
 }

}	
	

	
	

