package model;

import java.awt.Point;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Interface.IObservable;
import Interface.IObserver;
import Timer.CardFlipper;
import gui.cards.Card;
import javafx.animation.PauseTransition;

public class Model implements IObservable {
	CardFlipper flipper;
	ArrayList<IObserver> Obslist = new ArrayList<>();
	int trys = 0;
	ArrayList<Point> solved = new ArrayList<>();
	Card pull;
	private ImageIcon back = new ImageIcon("resource\\back.PNG");
	private ImageIcon[] front = { new ImageIcon("resource\\chrome.png"), new ImageIcon("resource\\explorer.png"),
			new ImageIcon("resource\\firefox.png"), new ImageIcon("resource\\ie.png"),
			new ImageIcon("resource\\notepad.png"), new ImageIcon("resource\\opera.png"),
			new ImageIcon("resource\\safari.png"), new ImageIcon("resource\\wmp.png"), };

	public Model(CardFlipper f1) {
		this.flipper = f1;
	}

	public void turnCard(Card c) {
		int x = (int) c.getPosition().getX();
		int y = (int) c.getPosition().getY();
		if (!solved.contains(c.getPosition()) & pull != c) {
			if (pull == null) {
				pull = c;
				notify_All(x, y);
			} else {
				if (pull.getFront() == c.getFront()) {
					solved.add(c.getPosition());
					solved.add(pull.getPosition());
					notify_All(x, y);
					if (solved.size() == 16) {
						flipper.cancel();
						this.gewonnen(trys++);
					}
				} else {
					notify_All(x, y);
					this.flipper.toSwap(new Point(x, y), pull.getPosition());
				}
				pull = null;
				trys++;
			}
		}
	}

	public Card[][] createGame() {
		Card[][] cards = new Card[4][4];
		int counter = 0;
		for (Card[] i : cards) {
			for (int j = 0; j < i.length; j++) {
				cards[counter][j] = new Card(counter, j);

			}
			counter++;
		}
		this.assignFront(cards);
		return cards;
	}

	public void assignFront(Card[][] cards) {
		ArrayList<ImageIcon> list = new ArrayList<>();
		for (ImageIcon i : front) {
			list.add(i);
			list.add(i);
		}
		Collections.shuffle(list);
		ImageIcon[] arrayFronts = list.toArray(new ImageIcon[0]);

		for (int i = 0; i < arrayFronts.length; i++) {

			cards[(int) i / 4][(int) i % 4].setFront(arrayFronts[i]);
		}
		// 0,1,2,3
	}

	@Override
	public void notify_All(int i, int j) {
		for (IObserver s : this.getObslist()) {
			s.update(i, j);
		}

	}

	@Override
	public void addObserver(IObserver ios) {
		this.getObslist().add(ios);
	}

	public ArrayList<IObserver> getObslist() {
		return Obslist;
	}

	public void setObslist(ArrayList<IObserver> obslist) {
		Obslist = obslist;
	}

	@Override
	public void gewonnen(int trys) {
		for (IObserver s : this.getObslist()) {
			s.update(trys);
		}
	}

}
