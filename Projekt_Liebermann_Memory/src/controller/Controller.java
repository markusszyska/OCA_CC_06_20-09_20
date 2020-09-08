package controller;

import Interface.IObserver;
import Listener.Mouselistener;
import Listener.MyComponentAdapter;
import Timer.CardFlipper;
import gui.Frame.GameArea;
import gui.cards.Card;
import model.Model;

public class Controller implements IObserver {

	private GameArea game;
	private Model model;
	public Controller() {
		
		this.setModel(new Model(new CardFlipper(this)));
		this.getModel().addObserver(this);
		
		this.setGame(new GameArea());
		this.getGame().setCards(this.getModel().createGame());
		this.getGame().setMouseListener(new Mouselistener(this));
		this.getGame().addComponentListener(new MyComponentAdapter(this));
		
		
	}
	private GameArea getGame() {
		return game;
	}
	private void setGame(GameArea game) {
		this.game = game;
	}
	private Model getModel() {
		return model;
	}
	private void setModel(Model model) {
		this.model = model;
	}

	@Override
	public void update(int i, int j ) {
		this.getGame().turnCard(i, j);
	}
	
	public void cardClicked(Card c) {
		this.getModel().turnCard(c);
	}
	
	public void onResize() {
		//this.getGame().reDraw();
	}
	@Override
	public void update(int trys) {
		this.getGame().gewonnen(trys);
		
	}
	
}
