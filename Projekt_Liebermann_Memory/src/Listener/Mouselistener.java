package Listener;

import javax.swing.BorderFactory;

import controller.Controller;
import gui.cards.Card;

public class Mouselistener implements java.awt.event.MouseListener{

	private Controller c;
	
	public Mouselistener(Controller c) {
		this.c = c;
	}
	
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		Card myCard = (Card)e.getSource();
		this.c.cardClicked(myCard);
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		Card myCard = (Card)e.getSource();
		myCard.setBorder(BorderFactory.createRaisedBevelBorder());
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		Card myCard = (Card)e.getSource();
		myCard.setBorder(BorderFactory.createEmptyBorder());
		
	}

}
