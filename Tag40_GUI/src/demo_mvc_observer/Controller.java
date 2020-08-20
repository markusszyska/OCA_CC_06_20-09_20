package demo_mvc_observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Controller implements ActionListener, Observer {

	private Model model;
	private MainView mainView;

	public Controller() {
		this.setMainView(new MainView());
		this.setModel(new Model());
		this.getMainView().addActionListenerToButtons(this);
		this.getModel().addObserver(this);
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "up":
			this.getModel().countUp();
			break;
		case "down": 
			this.getModel().countDown();
			break;
		}

	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Updating View");
		System.out.println(arg);
		
		
	}

}
