package gui.cards;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Interface.ICard;

public abstract class StandardCard extends JLabel implements ICard {

	private boolean turned = false;
	private ImageIcon back = new ImageIcon("resource\\back.PNG");
	private ImageIcon front;
	private ImageIcon active;

	{
		this.setActive(this.getBack());
		super.setOpaque(true);
		super.setVisible(true);
		//super.setIcon(this.getActive());
		this.resize(150,200);
	}

	public void resize(int width, int height) {
		this.setActive(new ImageIcon(this.getActive().getImage().getScaledInstance(width, height, 0)));
		super.setIcon(this.getActive());
	}

	public ImageIcon getBack() {
		return back;
	}

	public void setBack(ImageIcon back) {
		this.back = back;
		super.setIcon(this.getBack());
	}

	public ImageIcon getFront() {
		return front;
	}

	public void setFront(ImageIcon front) {
		this.front = front;
	}

	public boolean isTurned() {
		return turned;
	}

	public void setTurned(boolean turned) {
		this.turned = turned;
	}

	public ImageIcon getActive() {
		return active;
	}

	public void setActive(ImageIcon active) {
		this.active = active;
	}

}
