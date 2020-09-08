package gui.Frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gui.cards.Card;

public class GameArea extends JFrame {
	Card[][] cards = new Card[4][4];
	//GridLayout game = new GridLayout(4, 4, 100, 25);
	JPanel game = new JPanel();
	public GameArea() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Menu mymenu = new Menu();
		game.setVisible(true);
		
		super.setLayout(new BorderLayout());
		super.add(mymenu, BorderLayout.NORTH);
		super.add(game, BorderLayout.CENTER);
		
		game.setLayout(new GridLayout(4, 4, 100, 25));
		
		
		//super.setLayout(new GridLayout(4, 4, 100, 25));
		

		
		setBounds(0,0,800,800);
		

		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setResizable(false);
		super.setTitle("Memory");
		super.setVisible(true);
	}

	private void createCards() {
		int counter = 0;
		for (Card[] i : cards) {
			for (int j = 0; j < i.length; j++) {
				cards[counter][j] = new Card(counter, j);
			}
			counter++;
		}
	}

	public void setMouseListener(MouseListener ml) {
		int counter = 0;
		for (Card[] c : cards) {
			for (int i = 0; i < c.length; i++) {
				cards[counter][i].addMouseListener(ml);
			}
			counter++;
		}
	}

	public void updateCard(ImageIcon ii, int i, int j) {
		Dimension size = cards[i][j].getSize();
		cards[i][j].setActive(ii);
		cards[i][j].resize(size.width, size.height);
	}

	public void reDraw() {
		if (this.getCards() != null) {
			int counter = 0;
			for (Card[] c : cards) {
				for (int i = 0; i < c.length; i++) {
					updateCard(cards[counter][i].getActive(), counter, i);
				}
				counter++;
			}
		}
	}

	public Card[][] getCards() {
		return cards;
	}

	public void setCards(Card[][] cards) {
		this.cards = cards;
		int counter = 0;
		for (Card[] i : cards) {
			for (int j = 0; j < i.length; j++) {
				game.add(cards[counter][j]);
				//game.pack();
			}
			counter++;
		}
	}

	public void turnCard(int i, int j) {
		cards[i][j].turnCard();
	}

	public void gewonnen(int trys) {
		JOptionPane.showMessageDialog(this, "Gewonnen nach " + trys + " zügen");
	}

}
