package gui.cards;

import java.awt.Point;

import Interface.ICard;

public class Card extends StandardCard implements ICard {

	private Point position;
	

	public Card(int x, int y) {
		this.setPosition(new Point(x, y));
		
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}



	public void turnCard() {
		
		super.setTurned(!super.isTurned());
		if(super.isTurned()) {
			super.setActive(super.getFront());
		}else {
			super.setActive(super.getBack());
		}
		super.resize(this.getSize().width, this.getSize().height);
	}

}
