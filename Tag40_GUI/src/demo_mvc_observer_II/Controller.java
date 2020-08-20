package demo_mvc_observer_II;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Controller implements ActionListener, IUnserObserver{

	private Model model;
	private MainView mainView; 

	public Controller() {
		this.setMainView(new MainView());
		this.setModel(new Model());
		this.getMainView().addActionListenerToButtons(this);
		this.getModel().registerObserver(this);
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
	public void update(IUnserObserable o, Object arg) {
		if(o == this.getModel()) {
			this.getMainView().updateLabel(arg);
		}		
	}

	
		
	

}
