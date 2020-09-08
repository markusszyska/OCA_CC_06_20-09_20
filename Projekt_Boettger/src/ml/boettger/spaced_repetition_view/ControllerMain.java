package ml.boettger.spaced_repetition_view;

import ml.boettger.spaced_repetition_view.gui.FrameMain;

public class ControllerMain {
	private Model model;
	private FrameMain mainView;
		
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public FrameMain getMainView() {
		return mainView;
	}

	public void setMainView(FrameMain mainView) {
		this.mainView = mainView;
	}

	public ControllerMain() {
		this.setMainView(new FrameMain());
		this.setModel(new Model());
		//this.getMainView().addActionListenerToButtons(this);
		//this.getModel().addObserver(this);
	}	
}
